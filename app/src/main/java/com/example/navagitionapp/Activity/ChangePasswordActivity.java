package com.example.navagitionapp.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class ChangePasswordActivity extends AppCompatActivity {
    RelativeLayout back_image;
    Button bt_changePassword;
    EditText et_oldPassword,et_newPassword, et_confirmPassword;
    String vOldPassword, vNewPassword, vConfirmPassword;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_change_password);

        back_image =findViewById (R.id.back_image);
        et_oldPassword = findViewById (R.id.et_oldPassword);
        et_newPassword = findViewById (R.id.et_newPassword);
        et_confirmPassword = findViewById (R.id.et_confirmPassword);
        bt_changePassword = findViewById (R.id.bt_changePassword);

        back_image.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        });





        bt_changePassword.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                vOldPassword = et_oldPassword.getText ().toString ().trim ();
                vNewPassword = et_newPassword.getText ().toString ().trim ();
                vConfirmPassword = et_confirmPassword.getText ().toString ().trim ();
               if (vOldPassword.isEmpty ()){
                   et_oldPassword.setError ("Can't be empty");
                   et_oldPassword.requestFocus ();
               }

               else if (vNewPassword.isEmpty ()){
                    et_newPassword.setError ("Can't be empty");
                    et_newPassword.requestFocus ();
                }

               else if (vConfirmPassword.isEmpty ()){
                    et_confirmPassword.setError ("Can't be empty");
                    et_confirmPassword.requestFocus ();
                } 



            }
        });


    }
}