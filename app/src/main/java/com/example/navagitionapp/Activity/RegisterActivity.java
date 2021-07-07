package com.example.navagitionapp.Activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class RegisterActivity extends AppCompatActivity {

    TextView terms_textView;
    EditText et_firstName,et_lastName,et_emailAddress,et_phoneNumber,et_password,et_conformPassword;
    Button bt_register;

    String  vFirstName, vLastName, vEmailAddress,  vPhoneNumber, vPassword, vConformPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_register);

        et_firstName =findViewById (R.id.et_firstName);
        et_lastName = findViewById (R.id.et_lastName);
        et_emailAddress = findViewById (R.id.et_emailAddress);
        et_phoneNumber = findViewById (R.id.et_phoneNumber);
        et_password = findViewById (R.id.et_password);
        et_conformPassword = findViewById (R.id.et_conformPassword);
        terms_textView = findViewById (R.id.terms_textView);
        bt_register = findViewById (R.id.bt_register);


        bt_register.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {

                vFirstName = et_firstName.getText (). toString ();
                vLastName = et_lastName.getText (). toString ();
                vEmailAddress = et_emailAddress.getText ().toString ().trim ();
                vPhoneNumber =et_phoneNumber.getText ().toString ().trim ();
                vPassword = et_password.getText ().toString ().trim ();
                vConformPassword =et_conformPassword.getText ().toString ().trim ();

                if (vFirstName.isEmpty ())
                {
                    et_firstName.setError ("Can't be empty");
                    et_firstName.requestFocus ();
                }

                else if (vLastName.isEmpty ())
                {
                    et_lastName.setError ("Can't be empty");
                    et_lastName.requestFocus ();
                }
                else if (vEmailAddress.isEmpty ())
                {
                    et_emailAddress.setError ("Can't be empty");
                    et_emailAddress.requestFocus ();
                }

                else if (vPhoneNumber.isEmpty ())
                {
                    et_phoneNumber.setError ("Can't be empty");
                    et_phoneNumber.requestFocus ();
                }
                else if (vPassword.isEmpty ())
                {
                    et_password.setError ("Can't be empty");
                    et_password.requestFocus ();
                }
                else if (vConformPassword.isEmpty ())
                {
                    et_conformPassword.setError ("Can't be empty");
                    et_conformPassword.requestFocus ();
                }

            }
        });


        terms_textView.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (RegisterActivity.this, TermsConditionsActivity.class );
                startActivity (intent);
            }
        });


    }
}