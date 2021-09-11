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

import me.aravi.instapi.InstapiSDK;
import me.aravi.instapi.auth.InstaAuth;
import me.aravi.instapi.auth.InstaUser;
import me.aravi.instapi.models.profile.ProfileDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

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
                    getProfile(user);
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

    private void getProfile(InstaUser user) {
        InstapiSDK.getInstance(this).getInstaProfile(user, new Callback<ProfileDetails>() {
            @Override
            public void onResponse(Call<ProfileDetails> call, Response<ProfileDetails> response) {
                ProfileDetails profileDetails = response.body();
                if (profileDetails != null) {
                    Toast.makeText(MainActivity.this, "You have :" + profileDetails.getGraphql().getUser().getEdgeFollowedBy().getCount().toString() + " Followers", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<ProfileDetails> call, Throwable t) {

            }
        });
    }
}