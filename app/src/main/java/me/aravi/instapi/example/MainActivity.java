package me.aravi.instapi.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import me.aravi.instapi.instauth.InstaAuth;
import me.aravi.instapi.instauth.InstaUser;

public class MainActivity extends AppCompatActivity {

    private InstaAuth iAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iAuth = InstaAuth.getInstance(this);
        ActivityResultLauncher<Intent> result = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    InstaUser user = iAuth.getCurrentUser();
                    Toast.makeText(MainActivity.this, "User :" + user.getCsrfToken(), Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Couldn't complete", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.login_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.launch(iAuth.startAuth());
            }
        });


    }

    private void startAuth() {

    }
}