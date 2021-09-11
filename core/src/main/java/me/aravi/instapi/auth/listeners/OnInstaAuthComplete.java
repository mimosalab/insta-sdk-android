package me.aravi.instapi.auth.listeners;

import androidx.annotation.NonNull;

public interface OnInstaAuthComplete {

    void success(@NonNull String username, @NonNull String cookie, String path);

    void error(String message, int code);

}