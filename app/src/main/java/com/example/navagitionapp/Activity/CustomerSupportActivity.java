package com.example.navagitionapp.Activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.navagitionapp.R;

public class CustomerSupportActivity extends AppCompatActivity {
    RelativeLayout back_customerSupport;
    EditText et_name,et_emailAddress,et_phoneNumber,et_otherInstructions;
    Button bt_send;
    String vName, vEmailAddress,vPhoneNumber,vOtherInstruction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_customer_support);

        et_name = findViewById (R.id.et_name);
        et_emailAddress = findViewById (R.id.et_emailAddress);
        et_phoneNumber = findViewById (R.id.et_phoneNumber);
        et_otherInstructions = findViewById (R.id.et_otherInstructions);
        back_customerSupport = findViewById (R.id.back_customerSupport);
        bt_send =findViewById (R.id.bt_send);


        bt_send.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                vName = et_name.getText ().toString ().trim ();
                vEmailAddress = et_emailAddress.toString ().trim ();
                vPhoneNumber = et_phoneNumber.getText ().toString ().trim ();
                vOtherInstruction =et_otherInstructions.getText ().toString ().trim ();

                if(vName.isEmpty ())
                {
                   et_name.setError ("Can't be empty");
                   et_name.requestFocus ();
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
                else if (vOtherInstruction.isEmpty ())
                {
                    et_otherInstructions.setError ("Can't be empty");
                    et_otherInstructions.requestFocus ();
                }
            }
        });

        back_customerSupport.setOnClickListener (new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                finish ();
            }
        });
    }
}