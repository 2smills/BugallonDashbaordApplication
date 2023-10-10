package com.example.bugallondashboard;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class signin extends AppCompatActivity {

    private Button signInButton;
    private Button createAccountButton;
    private ImageView animatedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        getSupportActionBar().hide();

        signInButton = findViewById(R.id.btnSignIn);
        createAccountButton = findViewById(R.id.createAcc);
        animatedImage = findViewById(R.id.bugallonLogo);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSignUpActivity();
            }
        });

        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Get user input
                String email = ""; // Replace with your code to get the email
                String password = ""; // Replace with your code to get the password

                // Validate email and password
                if (isInputValid(email, password)) {
                    // Replace with your actual sign-in logic
                    boolean isSignInSuccessful = performSignIn();

                    if (isSignInSuccessful) {
                        openHomeActivity();
                    } else {
                        // Show an error message
                        Toast.makeText(signin.this, "Sign-in failed. Please check your credentials.", Toast.LENGTH_SHORT).show();
                    }
                } else {
                    // Show an error message
                    Toast.makeText(signin.this, "Please enter both email and password.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_in);
        Animation animation2 = AnimationUtils.loadAnimation(this, R.anim.slide_in);

        animatedImage.startAnimation(animation);
        signInButton.startAnimation(animation2);
    }

    // Replace this with your actual sign-in logic
    private boolean performSignIn() {
        // Replace this with your authentication logic
        // For example, you can check email and password against a database
        // If the credentials are correct, return true; otherwise, return false
        return true; // Successful sign-in for this example
    }

    // Add a validation check for email and password
    private boolean isInputValid(String email, String password) {
        return !email.isEmpty() && !password.isEmpty();
    }

    private void openHomeActivity() {
        Intent intent = new Intent(this, mainhome.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    private void openSignUpActivity() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

    public void onForgotPasswordClick(View view) {
        // Replace this with the code to navigate to the "Forgot Password" screen.

        // Example: Start a new activity for the "Forgot Password" screen
        Intent forgotPasswordIntent = new Intent(this, forgot_password.class);
        startActivity(forgotPasswordIntent);
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}
