package me.aravi.instapi;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONObject;

import me.aravi.instapi.auth.InstaUser;
import me.aravi.instapi.models.allposts.AllPosts;
import me.aravi.instapi.models.post.PostDetails;
import me.aravi.instapi.models.profile.ProfileDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import static me.aravi.instapi.InstaConfig.USER_AGENT;

public class InstapiSDK {
    private static InstapiSDK instance;
    private Context context;
    private Instapi instapi;

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

    /**
     * Gets the profile information like username, full name and followers/following stats
     *
     * @param instaUser
     * @param callback
     */
    public void getInstaProfile(InstaUser instaUser, Callback<ProfileDetails> callback) {
        Call<ProfileDetails> userInfo = instapi.getService().getUser(
                instaUser.getUsername(),
                instaUser.getCookie(),
                instaUser.getCsrfToken(),
                USER_AGENT);
        AsyncTask.execute(() -> userInfo.enqueue(callback));
    }

    /**
     * Gets 9 recent posts of the user
     *
     * @param instaUser
     * @param callback
     */
    public void getRecentPosts(InstaUser instaUser, Callback<AllPosts> callback) {
        String queryHash = InstaConfig.QUERY_HASH_POSTS;
        String variables = "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":9}";
        Call<AllPosts> userPostCall = instapi.getService().getAllPosts(instaUser.getCookie(), instaUser.getCsrfToken(), queryHash, variables, USER_AGENT);
        AsyncTask.execute(() -> userPostCall.enqueue(callback));
    }


    /**
     * Gets post details with the shortcode of the post
     *
     * @param instaUser
     * @param shortCode
     * @param callback
     */
    public void getPostDetailsWith(InstaUser instaUser, String shortCode, Callback<PostDetails> callback) {
        Call<PostDetails> postDetailsCall = instapi.getService().getPostDetails(instaUser.getCookie(), instaUser.getCsrfToken(), USER_AGENT, shortCode);
        AsyncTask.execute(() -> postDetailsCall.enqueue(callback));
    }

    /**
     * Likes a post with short code
     *
     * @param shortCode
     * @param instaUser
     * @param likeResponse
     */
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


    /**
     * Puts like on post with PostId
     *
     * @param postId
     * @param instaUser
     * @param likeResponse
     */
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

}
