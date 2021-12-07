package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class OTPVerification extends AppCompatActivity {

    TextView textView;
    EditText editText;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otpverification);
        textView=findViewById(R.id.phone_no);
        editText=findViewById(R.id.otp);
        button=findViewById(R.id.verify_btn);

        String mobile_no=getIntent().getExtras().getString("mobileNo1");
        textView.setText("Verification code has been sent to "+ mobile_no);

        String editTextOTP= (editText.getText().toString());
        int otp=123456;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                      Intent intent = new Intent(OTPVerification.this, Confirmation.class);
                      startActivity(intent);


            }
        });
    }
}