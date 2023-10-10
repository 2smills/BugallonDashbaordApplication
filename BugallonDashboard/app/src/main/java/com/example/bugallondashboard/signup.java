package com.example.bugallondashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class signup extends AppCompatActivity {

    private Button logInBtn;
    private ImageView animatedImage;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();

        logInBtn = findViewById(R.id.SignupBtn);
        animatedImage = findViewById(R.id.LogoImage);

        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openHomeActivity();
            }
        });

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        animatedImage.startAnimation(animation);
    }

    private void openHomeActivity() {
        Intent intent = new Intent(this, mainhome.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}
