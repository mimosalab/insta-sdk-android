package me.aravi.instapi.example;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

import me.aravi.instapi.InstapiSDK;
import me.aravi.instapi.auth.InstaAuth;
import me.aravi.instapi.auth.InstaUser;
import me.aravi.instapi.example.databinding.ActivityMainBinding;
import me.aravi.instapi.interfaces.OnFollowResponse;
import me.aravi.instapi.interfaces.OnSimpleResponse;
import me.aravi.instapi.models.profile.ProfileDetails;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private InstaAuth iAuth;
    private InstapiSDK instapiSDK;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        iAuth = InstaAuth.getInstance(this);
        instapiSDK = InstapiSDK.getInstance(this);

        ActivityResultLauncher<Intent> result = registerForActivityResult(new ActivityResultContracts.StartActivityForResult(), new ActivityResultCallback<ActivityResult>() {
            @Override
            public void onActivityResult(ActivityResult result) {
                if (result.getResultCode() == Activity.RESULT_OK) {
                    InstaUser user = iAuth.getCurrentUser();
                    binding.infoText.setText(user.toString());
                    getProfile(user);
                } else {
                    Toast.makeText(MainActivity.this, "Couldn't complete", Toast.LENGTH_SHORT).show();
                }
            }
        });

        binding.loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.launch(iAuth.startAuth());
            }
        });


        binding.followButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                long userId = Long.parseLong(Objects.requireNonNull(binding.followIdBox.getText()).toString());
                instapiSDK.followAccount(userId, iAuth.getCurrentUser(), new OnFollowResponse() {
                    @Override
                    public void onSuccess(@Nullable String response) {
                        Toast.makeText(MainActivity.this, "Success :" + response, Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailure(String message) {
                        Toast.makeText(MainActivity.this, "Error :" + message, Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

    }

    private void getProfile(InstaUser user) {
        instapiSDK.getInstaProfile(user, new Callback<ProfileDetails>() {
            @Override
            public void onResponse(Call<ProfileDetails> call, Response<ProfileDetails> response) {
                ProfileDetails profileDetails = response.body();
                if (profileDetails != null) {
                    binding.profileInfoText.setText(profileDetails.getGraphql().getUser().toString());
                    binding.privacySwitch.setChecked(profileDetails.getGraphql().getUser().getIsPrivate());
                    binding.privacySwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                        @Override
                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                            instapiSDK.setAccountPrivacy(isChecked, iAuth.getCurrentUser(), new OnSimpleResponse() {
                                @Override
                                public void success(@Nullable String message) {
                                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                                }

                                @Override
                                public void failure(@Nullable String message) {
                                    Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
                                }
                            });
                        }
                    });
                }
            }

            @Override
            public void onFailure(Call<ProfileDetails> call, Throwable t) {
                binding.infoText.setText(t.getMessage());

            }
        });
    }
}