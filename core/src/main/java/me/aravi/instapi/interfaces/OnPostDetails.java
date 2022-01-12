package me.aravi.instapi.interfaces;

import me.aravi.instapi.PostBean;

public interface OnPostDetails {
    void onReceive(PostBean postBean, String raw);

    void onFailure(int errorCode, String message);
}
