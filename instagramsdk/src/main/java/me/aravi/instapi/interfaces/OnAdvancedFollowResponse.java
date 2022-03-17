package me.aravi.instapi.interfaces;

import androidx.annotation.Nullable;

import org.json.JSONObject;

public interface OnAdvancedFollowResponse {

    void onSuccess(@Nullable JSONObject response);

    void onFailure(String message);
}
