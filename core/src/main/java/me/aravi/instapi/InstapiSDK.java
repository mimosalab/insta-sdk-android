package me.aravi.instapi;

import static me.aravi.instapi.InstaConfig.USER_AGENT;

import android.content.Context;
import android.os.AsyncTask;

import org.json.JSONObject;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import me.aravi.instapi.auth.InstaUser;
import me.aravi.instapi.interfaces.OnAdvancedFollowResponse;
import me.aravi.instapi.interfaces.OnAdvancedLikeResponse;
import me.aravi.instapi.interfaces.OnFollowResponse;
import me.aravi.instapi.interfaces.OnLikeResponse;
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
     * Get user posts with max
     *
     * @param instaUser
     * @param callback
     */
    public void getUserPosts(InstaUser instaUser, int max, Callback<AllPosts> callback) {
        String queryHash = InstaConfig.QUERY_HASH_POSTS;
        String variables = "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + "}";
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
     * Usually the first query
     *
     * @param instaUser
     * @param max
     * @param callback
     */
    public void getFollowersList(InstaUser instaUser, int max, Callback<Followers> callback) {
        Call<Followers> followersCall = instapi.getService().getFollowers(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWERS,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + "}",
                USER_AGENT);
        followersCall.enqueue(callback);
    }


    /**
     * after is the pageInfo/end_cursor from the previous or first query
     *
     * @param instaUser
     * @param max
     * @param after
     * @param callback
     */
    public void getFollowersList(InstaUser instaUser, int max, String after, Callback<Followers> callback) {
        Call<Followers> followersCall = instapi.getService().getFollowers(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWERS,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + ",\"after\":\"" + after + "\"}",
                USER_AGENT);
        followersCall.enqueue(callback);
    }


    /**
     * Usually the first query
     *
     * @param instaUser
     * @param max
     * @param callback
     */
    public void getFollowingList(InstaUser instaUser, int max, Callback<Followers> callback) {
        Call<Followers> following = instapi.getService().getFollowing(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWING,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + "}",
                USER_AGENT);
        following.enqueue(callback);
    }

    /**
     * after is the pageInfo/end_cursor from the previous or first query
     *
     * @param instaUser
     * @param max
     * @param after
     * @param callback
     */
    public void getFollowingList(InstaUser instaUser, int max, String after, Callback<Followers> callback) {
        Call<Followers> following = instapi.getService().getFollowing(instaUser.getCookie(),
                instaUser.getCsrfToken(),
                InstaConfig.QUERY_HASH_FOLLOWING,
                "{\"id\":\"" + instaUser.getUserId() + "\",\"first\":" + max + ",\"after\":\"" + after + "\"}",
                USER_AGENT);
        following.enqueue(callback);
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
}
