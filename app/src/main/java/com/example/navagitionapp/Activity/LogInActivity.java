package com.example.navagitionapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class LogInActivity extends AppCompatActivity {
    ImageView logo_imageView;
    TextView skip_textView;
    TextView forgot_password_textView;
    LinearLayout registerNow;
    Button login_myAccount_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_log_in);

        forgot_password_textView = findViewById (R.id.forgot_password_textView);
        skip_textView = findViewById (R.id.skip_textView);
        registerNow = findViewById (R.id.registerNow);
        logo_imageView = findViewById (R.id.logo_imageView);
        registerNow.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LogInActivity.this, RegisterActivity.class);
                startActivity (intent);
            }
        });

        forgot_password_textView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LogInActivity.this, ForgotPasswordActivity.class);
                startActivity (intent);
            }
        });

        logo_imageView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LogInActivity.this, Main2Activity.class);
                startActivity (intent);
            }
        });


        login_myAccount_button = findViewById (R.id.login_myAccount_button);
        login_myAccount_button.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LogInActivity.this, AddNewAddressActivity.class);
                startActivity (intent);
            }
        });


        skip_textView = findViewById (R.id.skip_textView);
        skip_textView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (LogInActivity.this, CustomerSupportActivity.class);
                startActivity (intent);
            }
        });
    }
}