package me.aravi.instapi.interfaces;

import androidx.annotation.Nullable;

import java.util.List;

import me.aravi.instapi.bean.PostBean;

public interface OnPostsUpdated {

    void onRetrieved(int post_count, List<PostBean> postList, @Nullable String rawResponse);

    void onNextPageInfo(boolean hasNextPage, @Nullable String cursor);

    void onFailedToRetrieve(int errorCode, String errorMessage);
}
