package com.example.robertuspamungkas.projectpam16.auth;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.robertuspamungkas.projectpam16.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.UserInfo;

public class UserProfile extends AppCompatActivity {
TextView nama,email;
    String name,emaili;
    Uri photoUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        if (user != null) {
            for (UserInfo profile : user.getProviderData()) {
                // Id of the provider (ex: google.com)
                String providerId = profile.getProviderId();

                // UID specific to the provider
                String uid = profile.getUid();

                // Name, email address, and profile photo Url
                name = profile.getDisplayName();
                emaili = profile.getEmail();
                photoUrl = profile.getPhotoUrl();
            };
        }

        nama=(TextView) findViewById(R.id.txtNama);
        email=(TextView) findViewById(R.id.txtEmail);
        ImageView img=(ImageView)findViewById(R.id.imageView);

        nama.setText(name);
        email.setText(emaili);
        img.setImageURI(photoUrl);
    }
}
