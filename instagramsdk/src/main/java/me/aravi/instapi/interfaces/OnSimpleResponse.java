package me.aravi.instapi.interfaces;

import androidx.annotation.Nullable;

public interface OnSimpleResponse {

    void success(@Nullable String message);
    void failure(@Nullable String message);
}
