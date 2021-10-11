package me.aravi.instapi.auth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.security.crypto.EncryptedSharedPreferences;
import androidx.security.crypto.MasterKey;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.security.GeneralSecurityException;

import me.aravi.instapi.BuildConfig;
import me.aravi.instapi.databinding.ActivityInstaAuthBinding;


public class InstaAuthActivity extends AppCompatActivity {

    private ActivityInstaAuthBinding binding;
    private SharedPreferences auth_pref;
    private AlertDialog builder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInstaAuthBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        init();
    }

    @SuppressLint("SetJavaScriptEnabled")
    private void init() {
        auth_pref = getEncryptedPreference();

        WebSettings webSettings = binding.webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setNeedInitialFocus(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            webSettings.setForceDark(WebSettings.FORCE_DARK_AUTO);
        }

        binding.webView.setWebViewClient(webViewClient);
        binding.webView.loadUrl("https://www.instagram.com/accounts/login");
    }


    private WebViewClient webViewClient = new WebViewClient() {
        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
        }

        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            binding.webView.evaluateJavascript("(function checkUsername() {\n" +
                    "  let viewer = window._sharedData.config\n" +
                    "  let shared = window._sharedData\n" +
                    "  if (viewer.viewer != null){\n" +
                    "    var obj = {\n" +
                    "      csrftoken: viewer.csrf_token,\n" +
                    "      username : viewer.viewer.username,\n" +
                    "      id: viewer.viewer.id,\n" +
                    "      full_name: viewer.viewer.full_name,\n" +
                    "      profile_pic_url: viewer.viewer.profile_pic_url_hd,\n" +
                    "      is_private: viewer.viewer.is_private,\n" +
                    "      bio: viewer.viewer.biography,\n" +
                    "      rollout_hash: shared.rollout_hash\n" +
                    "    }\n" +
                    "    return obj;\n" +
                    "  }\n" +
                    "  else {\n" +
                    "    return null;\n" +
                    "  }\n" +
                    "})()", value -> {
                try {
                    // If yes
                    JSONObject obj = new JSONObject(value);
                    auth_pref.edit().putString("username", obj.getString("username")).apply();
                    auth_pref.edit().putString("name", obj.getString("full_name")).apply();
                    auth_pref.edit().putString("dp", obj.getString("profile_pic_url")).apply();
                    auth_pref.edit().putBoolean("private", obj.getBoolean("is_private")).apply();
                    auth_pref.edit().putString("bio", obj.getString("bio")).apply();
                    auth_pref.edit().putLong("userId", Long.parseLong(obj.getString("id"))).apply();
                    auth_pref.edit().putString("csrftoken", obj.getString("csrftoken")).apply();
                    auth_pref.edit().putString("rollout_hash", obj.getString("rollout_hash")).apply();
                    auth_pref.edit().putLong("login_time", System.currentTimeMillis()).apply();

                    String cookies = CookieManager.getInstance().getCookie("https://www.instagram.com");
                    auth_pref.edit().putString("cookie", cookies).apply();
                    auth_pref.edit().putBoolean("status", true).apply();

                    Intent returnIntent = new Intent();
                    returnIntent.putExtra("username", obj.getString("username"));
                    returnIntent.putExtra("full_name", obj.getString("full_name"));
                    returnIntent.putExtra("cookie", cookies);
                    setSuccessFinish(returnIntent);

                } catch (JSONException e) {
                    e.printStackTrace();
                }
            });
        }

        @Override
        public void onReceivedHttpError(WebView view, WebResourceRequest request, WebResourceResponse errorResponse) {
            super.onReceivedHttpError(view, request, errorResponse);
        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            return super.shouldOverrideUrlLoading(view, request);
        }
    };

    private SharedPreferences getEncryptedPreference() {
        try {
            MasterKey mainKey = new MasterKey.Builder(InstaAuthActivity.this)
                    .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
                    .build();
            return EncryptedSharedPreferences.create(this,
                    BuildConfig.LIBRARY_PACKAGE_NAME + ".auth",
                    mainKey,
                    EncryptedSharedPreferences.PrefKeyEncryptionScheme.AES256_SIV,
                    EncryptedSharedPreferences.PrefValueEncryptionScheme.AES256_GCM);

        } catch (GeneralSecurityException | IOException e) {
            e.printStackTrace();
            return getSharedPreferences("temp", MODE_PRIVATE);
        }
    }

    private void setSuccessFinish(Intent intent) {
        setResult(Activity.RESULT_OK, intent);
        finish();

    }

    private void setCancelFinish(Intent intent) {
        setResult(Activity.RESULT_CANCELED, intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        builder = new MaterialAlertDialogBuilder(this)
                .setTitle("Are you sure ?")
                .setMessage("This will abort your login process. Do you still want to cancel ?")
                .setPositiveButton("Abort", (dialog, which) -> setCancelFinish(null))
                .setNegativeButton("Resume", null)
                .show();
//        super.onBackPressed();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}