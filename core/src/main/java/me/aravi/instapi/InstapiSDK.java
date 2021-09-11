package me.aravi.instapi;

import android.content.Context;
import android.os.AsyncTask;

import me.aravi.instapi.auth.InstaUser;
import me.aravi.instapi.models.allposts.AllPosts;
import me.aravi.instapi.models.post.PostDetails;
import me.aravi.instapi.models.profile.ProfileDetails;
import retrofit2.Call;
import retrofit2.Callback;

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


    public void getPostDetailsWith(InstaUser instaUser, String shortCode, Callback<PostDetails> callback) {
        Call<PostDetails> postDetailsCall = instapi.getService().getPostDetails(instaUser.getCookie(), instaUser.getCsrfToken(), USER_AGENT, shortCode);
        AsyncTask.execute(() -> postDetailsCall.enqueue(callback));
    }

}
