package com.example.bugallondashboard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();

            new Handler().postDelayed(() -> {


                Intent i = new Intent(MainActivity.this, signin.class);
                startActivity(i);

                overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

                finish();
            }, 3000);
        }
    }
}