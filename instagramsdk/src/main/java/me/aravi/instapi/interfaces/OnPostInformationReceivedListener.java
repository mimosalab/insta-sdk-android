package me.aravi.instapi.interfaces;

import me.aravi.instapi.bean.post.PostNormalBean;

public interface OnPostInformationReceivedListener {

    void onReceive(PostNormalBean postBean, String raw);

    void onFailure(int errorCode, String message);
}
