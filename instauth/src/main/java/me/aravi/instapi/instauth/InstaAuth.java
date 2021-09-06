package me.aravi.instapi.instauth;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;

import java.io.IOException;
import java.security.GeneralSecurityException;

import static android.content.Context.MODE_PRIVATE;

public class InstaAuth {

    private static InstaAuth instance;
    private Context context;
    private SharedPreferences preferences;

    public static InstaAuth getInstance(Context context) {
        if (instance == null) {
            instance = new InstaAuth(context);
        }
        return instance;
    }

    private InstaAuth(Context context) {
        this.context = context;
        this.preferences = getEncryptedPreference();
    }

    public InstaUser getCurrentUser() {
        if (preferences.getBoolean("status", false)) {

            InstaUser instaUser = new InstaUser();
            instaUser.setUsername(preferences.getString("username", ""));
            instaUser.setFullName(preferences.getString("name", ""));
            instaUser.setUserId(preferences.getLong("userId", 0));
            instaUser.setBiography(preferences.getString("bio", ""));
            instaUser.setCsrfToken(preferences.getString("csrftoken", ""));
            instaUser.setPrivate(preferences.getBoolean("private", false));
            instaUser.setProfilePicUrl(preferences.getString("dp", ""));
            instaUser.setLoggedInAt(preferences.getLong("login_time", 0));

            return instaUser;
        } else {
            return null;
        }
    }

    public String getCookie() {
        return preferences.getString("cookie", null);
    }


    public Intent startAuth() {
        Intent intent = new Intent(context, InstaAuthActivity.class);
        return intent;
    }


    private SharedPreferences getEncryptedPreference() {
        try {
            MasterKey mainKey = new MasterKey.Builder(context)
                    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                    .build();
            return EncryptedSharedPreferences.create(
                    context,
                    BuildConfig.LIBRARY_PACKAGE_NAME + ".auth",
                    mainKey,
                    EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                    EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);

        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
            return context.getSharedPreferences("temp", MODE_PRIVATE);
        }
    }

}
