package me.aravi.instapi;

import static me.aravi.instapi.InstaConfig.CONNECTION_ERROR_CODE;
import static me.aravi.instapi.InstaConfig.PARSE_ERROR_CODE;
import static me.aravi.instapi.InstaConfig.SERVER_ERROR_CODE;
import static me.aravi.instapi.InstaConfig.UNKNOWN_ERROR_CODE;
import static me.aravi.instapi.InstaConfig.USER_AGENT;

import android.content.Context;
import android.os.AsyncTask;

import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import me.aravi.instapi.auth.InstaUser;
import me.aravi.instapi.bean.PostBean;
import me.aravi.instapi.bean.post.PostNormalBean;
import me.aravi.instapi.interfaces.OnAdvancedFollowResponse;
import me.aravi.instapi.interfaces.OnAdvancedLikeResponse;
import me.aravi.instapi.interfaces.OnFollowResponse;
import me.aravi.instapi.interfaces.OnLikeResponse;
import me.aravi.instapi.interfaces.OnPostInformationReceivedListener;
import me.aravi.instapi.interfaces.OnPostsUpdated;
import me.aravi.instapi.interfaces.OnSimpleResponse;
import me.aravi.instapi.models.allposts.AllPosts;
import me.aravi.instapi.models.followers.Followers;
import me.aravi.instapi.models.post.PostDetails;
import me.aravi.instapi.models.profile.ProfileDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class InstapiSDK {
    private static InstapiSDK instance;
    private Context context;
    private Instapi instapi;

    public static final String TAG = InstapiSDK.class.getSimpleName();

    public static InstapiSDK getInstance(Context context) {
        if (instance == null) {
            instance = new InstapiSDK(context);
        }
        return instance;
    }

    private InstapiSDK(Context context) {
        this.context = context;
        this.instapi = Instapi.getInstance(context);
    }

    public void getInstaProfile(InstaUser instaUser, Callback<ProfileDetails> callback) {
        Call<ProfileDetails> userInfo = instapi.getService().getUser(
                instaUser.getUsername(),
                instaUser.getCookie(),
                instaUser.getCsrfToken(),
                USER_AGENT);
        AsyncTask.execute(() -> userInfo.enqueue(callback));
    }

    public void getRecentPosts(InstaUser instaUser, Callback<AllPosts> callback) {
        String queryHash = InstaConfig.QUERY_HASH_POSTS;
        String variables = "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":9}";
        Call<AllPosts> userPostCall = instapi.getService().getAllPosts(instaUser.getCookie(), instaUser.getCsrfToken(), queryHash, variables, USER_AGENT);
        AsyncTask.execute(() -> userPostCall.enqueue(callback));
    }

    public void getUserPosts(InstaUser instaUser, int max, Callback<AllPosts> callback) {
        String queryHash = InstaConfig.QUERY_HASH_POSTS;
        String variables = "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + "}";
        Call<AllPosts> userPostCall = instapi.getService().getAllPosts(instaUser.getCookie(), instaUser.getCsrfToken(), queryHash, variables, USER_AGENT);
        AsyncTask.execute(() -> userPostCall.enqueue(callback));
    }

    public void getPostDetailsWith(InstaUser instaUser, String shortCode, Callback<PostDetails> callback) {
        Call<PostDetails> postDetailsCall = instapi.getService().getPostDetails(instaUser.getCookie(), instaUser.getCsrfToken(), USER_AGENT, shortCode);
        AsyncTask.execute(() -> postDetailsCall.enqueue(callback));
    }

    public void getFollowersList(InstaUser instaUser, int max, Callback<Followers> callback) {
        Call<Followers> followersCall = instapi.getService().getFollowers(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWERS,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + "}",
                USER_AGENT);
        followersCall.enqueue(callback);
    }

    public void getFollowersList(InstaUser instaUser, int max, String after, Callback<Followers> callback) {
        Call<Followers> followersCall = instapi.getService().getFollowers(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWERS,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + ",\"after\":\"" + after + "\"}",
                USER_AGENT);
        followersCall.enqueue(callback);
    }

    public void getFollowingList(InstaUser instaUser, int max, Callback<Followers> callback) {
        Call<Followers> following = instapi.getService().getFollowing(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWING,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + "}",
                USER_AGENT);
        following.enqueue(callback);
    }

    public void getFollowingList(InstaUser instaUser, int max, String after, Callback<Followers> callback) {
        Call<Followers> following = instapi.getService().getFollowing(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWING,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + ",\"after\":\"" + after + "\"}",
                USER_AGENT);
        following.enqueue(callback);
    }

    public void putLikeOnPost(String shortCode, InstaUser instaUser, OnLikeResponse likeResponse) {
        getPostDetailsWith(instaUser, shortCode, new Callback<PostDetails>() {
            @Override
            public void onResponse(Call<PostDetails> call, Response<PostDetails> response) {
                assert response.body() != null;
                long postId = Long.parseLong(response.body().getGraphql().getShortcodeMedia().getId());
                putLikeOnPost(postId, instaUser, likeResponse);
            }

            @Override
            public void onFailure(Call<PostDetails> call, Throwable t) {
                likeResponse.OnFailed(t.getMessage());
            }
        });
    }

    public void putLikeOnPost(long postId, InstaUser instaUser, OnLikeResponse likeResponse) {
        Call<JSONObject> likeCall = instapi.getService().likePost(instaUser.getCookie(), instaUser.getCsrfToken(), USER_AGENT, postId);
        likeCall.enqueue(new Callback<JSONObject>() {
            @Override
            public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                if (response.code() == 200) {
                    likeResponse.OnSuccess();
                } else {
                    likeResponse.OnFailed(String.valueOf(response.code()));
                }
            }

            @Override
            public void onFailure(Call<JSONObject> call, Throwable t) {
                likeResponse.OnFailed(t.getMessage());
            }
        });
    }

    public void followAccount(long userId, InstaUser user, OnFollowResponse listener) {
        Call<Object> followCall = instapi.getService().follow(user.getCookie(),
                user.getCsrfToken(),
                user.getRoll_hash(),
                USER_AGENT,
                String.valueOf(userId));
        followCall.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if (response.code() == 200) {
                    listener.onSuccess(response.body().toString());
                } else {
                    listener.onFailure(response.message());
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                listener.onFailure(t.getMessage());
            }
        });


    }

    public void unFollowAccount(long userId, InstaUser user, OnFollowResponse listener) {
        Call<Object> followCall = instapi.getService().follow(user.getCookie(),
                user.getCsrfToken(),
                user.getRoll_hash(),
                USER_AGENT,
                String.valueOf(userId));
        followCall.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if (response.code() == 200) {
                    listener.onSuccess(response.body().toString());
                } else {
                    listener.onFailure(response.message());
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                listener.onFailure(t.getMessage());
            }
        });


    }

    public void setAccountPrivacy(boolean is_private, InstaUser user, OnSimpleResponse listener) {
        Map<String, String> params = new HashMap<>();
        params.put("is_private", String.valueOf(is_private));
        Call<Object> privacyCall = instapi.getService().setPrivacy(
                user.getCookie(),
                USER_AGENT,
                "https://www.instagram.com/accounts/privacy_and_security",
                user.getCsrfToken(),
                user.getRoll_hash(),
                params);
        privacyCall.enqueue(new Callback<Object>() {
            @Override
            public void onResponse(Call<Object> call, Response<Object> response) {
                if (response.code() == 200) {
                    listener.success(response.body() != null ? response.body().toString() : null);
                } else {
                    try {
                        listener.failure(Objects.requireNonNull(response.errorBody()).string());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }

            @Override
            public void onFailure(Call<Object> call, Throwable t) {
                listener.failure(t.getMessage());
            }
        });
    }

    public void putFollowV2(long profileId, InstaUser user, OnAdvancedFollowResponse followResponse) {
        Call<JSONObject> followV2 = instapi.getService().advancedFollow(user.getCookie(), USER_AGENT, user.getCsrfToken(), user.getRoll_hash(), profileId);
        followV2.enqueue(new Callback<JSONObject>() {
            @Override
            public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        followResponse.onSuccess(response.body());
                    } else {
                        followResponse.onSuccess(null);
                    }
                } else {
                    followResponse.onFailure(response.message());
                }
            }

            @Override
            public void onFailure(Call<JSONObject> call, Throwable t) {
                followResponse.onFailure(t.getMessage());
            }
        });
    }

    public void putLikeV2(long postId, InstaUser user, OnAdvancedLikeResponse likeResponse) {
        Call<JSONObject> followV2 = instapi.getService().advancedLike(user.getCookie(), USER_AGENT, user.getCsrfToken(), user.getRoll_hash(), postId);
        followV2.enqueue(new Callback<JSONObject>() {
            @Override
            public void onResponse(Call<JSONObject> call, Response<JSONObject> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null) {
                        likeResponse.OnSuccess(response.body());
                    } else {
                        likeResponse.OnSuccess(null);
                    }
                } else {
                    likeResponse.OnFailed(response.message());
                }
            }

            @Override
            public void onFailure(Call<JSONObject> call, Throwable t) {
                likeResponse.OnFailed(t.getMessage());
            }
        });
    }

    public void userPosts(InstaUser user, int max, OnPostsUpdated listener) {
        String queryHash = InstaConfig.QUERY_HASH_POSTS;
        String variables = "{\"id\":\"" + user.getUserId() + "\",\"first\":" + max + "}";
        // Build call
        Call<JsonObject> getCurrentUserPosts = instapi.getService()
                .getRawAllPosts(user.getCookie(), user.getCsrfToken(), queryHash, variables, USER_AGENT);

        getCurrentUserPosts.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful() && response.body() != null) {
                    try {
                        JSONObject jsonObj = new JSONObject(response.body().toString());
                        JSONObject data = jsonObj.getJSONObject("data");
                        JSONObject user = data.getJSONObject("user");
                        JSONObject timeline_media = user.getJSONObject("edge_owner_to_timeline_media");

                        int postCount = timeline_media.getInt("count");

                        // checks if it has next page and gets the cursor
                        JSONObject page_info = timeline_media.getJSONObject("page_info");
                        boolean hasNextPage = page_info.getBoolean("has_next_page");
                        String nextPageCursor = "";
                        if (hasNextPage) {
                            nextPageCursor = page_info.getString("end_cursor");
                            listener.onNextPageInfo(true, nextPageCursor);
                        } else {
                            listener.onNextPageInfo(false, null);
                        }

                        // Get Edges aka POSTS
                        List<PostBean> postBeanList = new ArrayList<>();
                        JSONArray post_edges = timeline_media.getJSONArray("edges");
                        if (post_edges.length() > 0) {
                            for (int i = 0; i < post_edges.length(); i++) {
                                JSONObject node = post_edges.getJSONObject(i).getJSONObject("node");
                                String displayUrl = node.getString("display_url");
                                JSONObject locationObj = node.getJSONObject("location");
                                String location = "";
                                if (location != null) {
                                    location = locationObj.toString();
                                }
                                ArrayList<String> displayResources = new ArrayList<>();
                                JSONArray qualities = node.getJSONArray("display_resources");
                                for (int x = 0; x < qualities.length(); x++) {
                                    String src = post_edges.getJSONObject(i).getString("src");
                                    displayResources.add(src);
                                }

                                String caption = "";
                                JSONObject edge_media_to_caption = node.getJSONObject("edge_media_to_caption");
                                JSONArray edges_caption = edge_media_to_caption.getJSONArray("edges");
                                if (edges_caption.length() > 0) {
                                    caption = edges_caption
                                            .getJSONObject(0)
                                            .getJSONObject("node")
                                            .getString("text");
                                }

                                PostBean bean = new PostBean();
                                bean.setDisplayUrl(displayUrl);
                                bean.setVideo(node.getBoolean("is_video"));
                                bean.setLocation(location);
                                bean.setTakenAt(node.getLong("taken_at_timestamp"));
                                bean.setShortCode(node.getString("shortcode"));
                                bean.setDisplayResources(displayResources);
                                bean.setId(node.getString("id"));
                                bean.setOwnerInfo(node.getJSONObject("owner").getString("username"));
                                bean.setCaption(caption);
                                bean.setUserLikedIt(node.getBoolean("viewer_has_liked"));
                                bean.setUserSavedIt(node.getBoolean("viewer_has_saved"));

                                try {
                                    bean.setThumbnailSrc(node.getString("thumbnail_src"));
                                } catch (Exception e) {
                                    bean.setThumbnailSrc("");
                                }

                                try {
                                    bean.setLikeCount(node.getJSONObject("edge_media_preview_like").getLong("count"));
                                } catch (Exception e) {
                                    bean.setLikeCount(0);
                                }

                                try {
                                    bean.setCommentCount(node.getJSONObject("edge_media_to_comment").getLong("count"));
                                } catch (Exception e) {
                                    bean.setCommentCount(0);
                                }

                                postBeanList.add(bean);
                            }
                            listener.onRetrieved(postCount, postBeanList, response.body().toString());
                        } else {
                            listener.onRetrieved(post_edges.length(), postBeanList, response.body().toString());
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                        listener.onFailedToRetrieve(InstaConfig.PARSE_ERROR_CODE, e.getMessage());
                    }
                } else {
                    listener.onFailedToRetrieve(InstaConfig.SERVER_ERROR_CODE, response.message());
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                listener.onFailedToRetrieve(InstaConfig.CONNECTION_ERROR_CODE, t.getMessage());
                t.printStackTrace();
            }
        });

    }

    public void userPosts(InstaUser user, int max, String cursor, OnPostsUpdated listener) {
        String queryHash = InstaConfig.QUERY_HASH_POSTS;
        String variables = "{\"id\":\"" + user.getUserId() + "\",\"first\":" + max + "\",\"after\":" + cursor + "}";
        // Build call
        Call<JsonObject> getCurrentUserPosts = instapi.getService()
                .getRawAllPosts(user.getCookie(), user.getCsrfToken(), queryHash, variables, USER_AGENT);

        getCurrentUserPosts.enqueue(new Callback<JsonObject>() {
            @Override
            public void onResponse(Call<JsonObject> call, Response<JsonObject> response) {
                if (response.isSuccessful() && response.body() != null) {
                    try {
                        JSONObject jsonObj = new JSONObject(response.body().toString());
                        JSONObject data = jsonObj.getJSONObject("data");
                        JSONObject user = data.getJSONObject("user");
                        JSONObject timeline_media = user.getJSONObject("edge_owner_to_timeline_media");

                        int postCount = timeline_media.getInt("count");


                        // checks if it has next page and gets the cursor
                        JSONObject page_info = timeline_media.getJSONObject("page_info");
                        boolean hasNextPage = page_info.getBoolean("has_next_page");
                        String nextPageCursor = "";
                        if (hasNextPage) {
                            nextPageCursor = page_info.getString("end_cursor");
                            listener.onNextPageInfo(true, nextPageCursor);
                        } else {
                            listener.onNextPageInfo(false, null);
                        }

                        // Get Edges aka POSTS
                        List<PostBean> postBeanList = new ArrayList<>();
                        JSONArray post_edges = timeline_media.getJSONArray("edges");
                        if (post_edges.length() > 0) {
                            for (int i = 0; i < post_edges.length(); i++) {
                                JSONObject node = post_edges.getJSONObject(i).getJSONObject("node");
                                String displayUrl = node.getString("display_url");
                                JSONObject locationObj = node.getJSONObject("location");
                                String location = "";
                                if (location != null) {
                                    location = locationObj.toString();
                                }
                                ArrayList<String> displayResources = new ArrayList<>();
                                JSONArray qualities = node.getJSONArray("display_resources");
                                for (int x = 0; x < qualities.length(); x++) {
                                    String src = post_edges.getJSONObject(i).getString("src");
                                    displayResources.add(src);
                                }

                                String caption = "";
                                JSONObject edge_media_to_caption = node.getJSONObject("edge_media_to_caption");
                                JSONArray edges_caption = edge_media_to_caption.getJSONArray("edges");
                                if (edges_caption.length() > 0) {
                                    caption = edges_caption
                                            .getJSONObject(0)
                                            .getJSONObject("node")
                                            .getString("text");
                                }

                                PostBean bean = new PostBean();
                                bean.setDisplayUrl(displayUrl);
                                bean.setVideo(node.getBoolean("is_video"));
                                bean.setLocation(location);
                                bean.setTakenAt(node.getLong("taken_at_timestamp"));
                                bean.setShortCode(node.getString("shortcode"));
                                bean.setDisplayResources(displayResources);
                                bean.setId(node.getString("id"));
                                bean.setOwnerInfo(node.getJSONObject("owner").getString("username"));
                                bean.setCaption(caption);
                                bean.setUserLikedIt(node.getBoolean("viewer_has_liked"));
                                bean.setUserSavedIt(node.getBoolean("viewer_has_saved"));

                                try {
                                    bean.setThumbnailSrc(node.getString("thumbnail_src"));
                                } catch (Exception e) {
                                    bean.setThumbnailSrc("");
                                }

                                try {
                                    bean.setLikeCount(node.getJSONObject("edge_media_preview_like").getLong("count"));
                                } catch (Exception e) {
                                    bean.setLikeCount(0);
                                }

                                try {
                                    bean.setCommentCount(node.getJSONObject("edge_media_to_comment").getLong("count"));
                                } catch (Exception e) {
                                    bean.setCommentCount(0);
                                }

                                postBeanList.add(bean);
                            }
                            listener.onRetrieved(postCount, postBeanList, response.body().toString());
                        } else {
                            listener.onRetrieved(post_edges.length(), postBeanList, response.body().toString());
                        }

                    } catch (JSONException e) {
                        e.printStackTrace();
                        listener.onFailedToRetrieve(InstaConfig.PARSE_ERROR_CODE, e.getMessage());
                    }
                } else {
                    listener.onFailedToRetrieve(InstaConfig.SERVER_ERROR_CODE, response.message());
                }
            }

            @Override
            public void onFailure(Call<JsonObject> call, Throwable t) {
                listener.onFailedToRetrieve(InstaConfig.CONNECTION_ERROR_CODE, t.getMessage());
                t.printStackTrace();
            }
        });

    }

    public void postDetails(InstaUser instaUser, String postUrl, OnPostInformationReceivedListener listener) {
        postUrl = postUrl + "?__a=1";

        Call<PostNormalBean> postCall = instapi.getService().getRawPostDetails(
                USER_AGENT,
                instaUser.getCookie(),
                instaUser.getCsrfToken(),
                postUrl
        );

        postCall.enqueue(new Callback<PostNormalBean>() {
            @Override
            public void onResponse(Call<PostNormalBean> call, Response<PostNormalBean> response) {
                if (response.isSuccessful()) {
                    PostNormalBean bean = response.body();
                    if (response.body() != null) {
                        listener.onReceive(bean, response.body().toString());
                    } else {
                        listener.onFailure(PARSE_ERROR_CODE, response.raw().toString());
                    }
                } else {
                    if (response.errorBody() != null) {
                        listener.onFailure(SERVER_ERROR_CODE, response.errorBody().toString());
                    } else {
                        listener.onFailure(UNKNOWN_ERROR_CODE, "UNKNOWN ERROR");
                    }
                }
            }

            @Override
            public void onFailure(Call<PostNormalBean> call, Throwable t) {
                t.printStackTrace();
                listener.onFailure(CONNECTION_ERROR_CODE, t.getMessage());
            }
        });


    }

}
