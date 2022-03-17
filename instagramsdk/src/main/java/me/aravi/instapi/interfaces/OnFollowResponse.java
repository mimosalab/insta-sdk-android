package me.aravi.instapi.interfaces;

import androidx.annotation.Nullable;

public interface OnFollowResponse {
    void onSuccess(@Nullable  String response);
    void onFailure(String message);
}
