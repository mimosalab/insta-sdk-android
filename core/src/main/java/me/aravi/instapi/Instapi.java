package me.aravi.instapi;

import android.content.Context;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import me.aravi.instapi.models.allposts.AllPosts;
import me.aravi.instapi.models.followers.Followers;
import me.aravi.instapi.models.post.PostDetails;
import me.aravi.instapi.models.profile.ProfileDetails;
import me.aravi.instapi.utils.NetworkUtils;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Field;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;

public class Instapi {
    public static final String BASE_URL = "https://www.instagram.com/";
    private static Instapi instance;
    private Context context;
    private static Endpoints endpoints;

    public static Instapi getInstance(Context context) {
        if (instance == null) {
            instance = new Instapi(context);
        }
        instance.getService();
        return instance;
    }

    private Instapi(Context context) {
        this.context = context;
    }


    private static final Interceptor REWRITE_CACHE_CONTROL_INTERCEPTOR = new Interceptor() {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Response originalResponse = chain.proceed(chain.request());
            if (NetworkUtils.isNetworkAvailable(instance.context)) {
                int maxAge = 60 * 5;
                return originalResponse.newBuilder()
                        .removeHeader("Cache-Control")
                        .removeHeader("Pragma")
                        .header("Cache-Control", "public, max-age=" + maxAge)
                        .build();
            } else {
                int maxStale = 60 * 60 * 24 * 24;
                return originalResponse.newBuilder()
                        .removeHeader("Cache-Control")
                        .removeHeader("Pragma")
                        .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                        .build();
            }
        }
    };

    public Endpoints getService() {
        if (endpoints == null) {

            File httpCacheDirectory = new File(context.getCacheDir(), "instapi_cache");
            int cacheSize = 30 * 1024 * 1024; // 30 MB
            Cache cache = new Cache(httpCacheDirectory, cacheSize);

            OkHttpClient client = new OkHttpClient.Builder()
                    .cache(cache)
                    .addNetworkInterceptor(REWRITE_CACHE_CONTROL_INTERCEPTOR)
                    .build();

            Gson gson = new GsonBuilder()
                    .setLenient()
                    .create();

            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();

            endpoints = retrofit.create(Endpoints.class);
        }
        return endpoints;
    }


    public interface Endpoints {
        @POST("web/likes/{post_id}/like/")
        Call<JSONObject> likePost(@Header("Cookie") String cookie,
                                  @Header("X-Csrftoken") String csrfToken,
                                  @Header("user-agent") String userAgent,
                                  @Path("post_id") long postId);

        @POST("web/friendships/{user_id}/follow/")
        Call<Object> follow(@Header("Cookie") String cookie,
                            @Header("X-CSRFToken") String csrfToken,
                            @Header("X-Instagram-AJAX") String ajax,
                            @Header("User-Agent") String agent,
                            @Path("user_id") String userId);

        @POST("web/friendships/{user_id}/unfollow/")
        Call<Object> unFollow(@Header("Cookie") String cookie,
                              @Header("X-CSRFToken") String csrfToken,
                              @Header("X-Instagram-AJAX") String ajax,
                              @Header("User-Agent") String agent,
                              @Path("user_id") String userId);

        @GET("graphql/query/")
        Call<AllPosts> getAllPosts(@Header("Cookie") String cookie,
                                   @Header("x-csrftoken") String csrfToken,
                                   @Query("query_hash") String queryHash,
                                   @Query("variables") String variables,
                                   @Header("user-agent") String user_agent);

        @GET("graphql/query/")
        Call<Followers> getFollowers(@Header("Cookie") String cookie,
                                     @Header("x-csrftoken") String csrfToken,
                                     @Query("query_hash") String queryHash,
                                     @Query("variables") String variables,
                                     @Header("user-agent") String user_agent);

        @GET("graphql/query/")
        Call<Followers> getFollowing(@Header("Cookie") String cookie,
                                     @Header("x-csrftoken") String csrfToken,
                                     @Query("query_hash") String query_hash,
                                     @Query("variables") String variable,
                                     @Header("user-agent") String user_agent);

        @GET("p/{post_short_code}/?__a=1")
        Call<PostDetails> getPostDetails(@Header("Cookie") String cookie,
                                         @Header("X-csrftoken") String csrfToken,
                                         @Header("user-agent") String user_agent,
                                         @Path("post_short_code") String post_short_code);

        @GET("p/{post_short_code}/?__a=1")
        Call<Object> getPostDetails(@Header("User-Agent") String user_agent,
                                    @Path("post_short_code") String post_short_code);

        @GET
        Call<Object> getUser(@Url String str,
                             @Header("authority") String auth,
                             @Header("accept") String accept,
                             @Header("user-agent") String user_agent,
                             @Header("origin") String origin,
                             @Header("sec-fetch-site") String fetch_site,
                             @Header("sec-fetch-mode") String fetch_mode,
                             @Header("sec-fetch-dest") String fetch_dest,
                             @Header("referer") String referer,
                             @Header("accept-language") String accept_lang);

        @GET("{user_name}/?__a=1")
        Call<ProfileDetails> getUser(@Path("user_name") String username,
                                     @Header("Cookie") String cookie,
                                     @Header("x-csrftoken") String csrfToken,
                                     @Header("user-agent") String userAgent);

        @GET
        Call<Object> getUserById(@Url String str,
                                 @Header("User-Agent") String str2);

        @FormUrlEncoded
        @POST("web/comments/{id}/add/")
        Call<Object> sendComment(@Path("id") String str,
                                 @HeaderMap Map<String, String> map,
                                 @Field("comment_text") String str2);

        @POST("web/comments/like/{id}/")
        Call<Object> setLikeOnComment(@Path("id") String str,
                                      @HeaderMap Map<String, String> map);

        @POST("web/likes/{post_id}/unlike/")
        Call<Object> unlikePost(@Header("Cookie") String str,
                                @Header("X-Csrftoken") String str2,
                                @Path("post_id") long j);


        @POST("accounts/set_private/")
        @FormUrlEncoded
        Call<Object> setPrivacy(@Header("Cookie") String cookie,
                                @Header("User-Agent") String user,
                                @Header("Referer") String referer,
                                @Header("X-CSRFToken") String csrfToken,
                                @Header("X-Instagram-AJAX") String rollHash,
                                @FieldMap Map<String, String> params);


        @POST("/web/friendships/{user_id}/follow")
        Call<JSONObject> advancedFollow(@Header("Cookie") String cookie,
                                        @Header("User-Agent") String user,
                                        @Header("X-CSRFToken") String csrfToken,
                                        @Header("X-Instagram-AJAX") String rollHash,
                                        @Path("user_id") long userId);

        @POST("/web/friendships/{user_id}/unfollow")
        Call<JSONObject> advancedUnFollow(@Header("Cookie") String cookie,
                                          @Header("User-Agent") String user,
                                          @Header("X-CSRFToken") String csrfToken,
                                          @Header("X-Instagram-AJAX") String rollHash,
                                          @Path("user_id") long userId);


        @POST("/web/likes/{post_id}/like")
        Call<JSONObject> advancedLike(@Header("Cookie") String cookie,
                                      @Header("User-Agent") String user,
                                      @Header("X-CSRFToken") String csrfToken,
                                      @Header("X-Instagram-AJAX") String rollHash,
                                      @Path("post_id") long postId);


        @POST("/web/likes/{post_id}/unlike")
        Call<JSONObject> advancedDislike(@Header("Cookie") String cookie,
                                         @Header("User-Agent") String user,
                                         @Header("X-CSRFToken") String csrfToken,
                                         @Header("X-Instagram-AJAX") String rollHash,
                                         @Path("post_id") long postId);

    }


}
