package me.aravi.instapi.interfaces;

import androidx.annotation.Nullable;

import org.json.JSONObject;

public interface OnAdvancedLikeResponse {

    void OnSuccess(@Nullable JSONObject response);

    void OnFailed(String message);
}
