package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddressNew extends AppCompatActivity {

    TextView TextView1,TextView2,TextView3,TextView4,TextView5,TextView6,TextView7,TextView8,TextView9;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address_new);
        TextView1=findViewById(R.id.textView1);
        TextView2=findViewById(R.id.textView2);
        TextView3=findViewById(R.id.textView3);
        TextView4=findViewById(R.id.textView4);
        TextView5=findViewById(R.id.textView5);
        TextView6=findViewById(R.id.textView6);
        TextView7=findViewById(R.id.textView7);
        TextView8=findViewById(R.id.textView8);
        TextView9=findViewById(R.id.textView9);
        button=findViewById(R.id.Button23);

        String  city1="City: " + getIntent().getExtras().getString("city1");
        String  locality1="Locality: " + getIntent().getExtras().getString("locality1");
        String  flatNo1="FlatNo: " + getIntent().getExtras().getString("flatNo1");
        String  pincode1="Pincode: " + getIntent().getExtras().getString("pincode1");
        String  landmark1="Landmark: " + getIntent().getExtras().getString("landmark1");
        String  name1="Name: " + getIntent().getExtras().getString("name1");
        String  mobileNo1="MobileNo: " + getIntent().getExtras().getString("mobileNo1");
        String  alternateMobileNo1="AlternateMobileNo: " + getIntent().getExtras().getString("alternateMobileNo1");
        String  selectedState="State: " + getIntent().getExtras().getString("selectedState");

        TextView1.setText(city1);
        TextView2.setText(locality1);
        TextView3.setText(flatNo1);
        TextView4.setText(pincode1);
        TextView5.setText(landmark1);
        TextView6.setText(name1);
        TextView7.setText(mobileNo1);
        TextView8.setText(alternateMobileNo1);
        TextView9.setText(selectedState);

        String mobile_no=TextView7.getText().toString();


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(AddressNew.this,OTPVerification.class);
                intent.putExtra("mobileNo1",mobile_no);
                startActivity(intent);finish();
            }
        });

    }


}