package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productDetailsActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details2);
    }

    public void openAR1(View view) {
        Intent intent=new Intent(productDetailsActivity2.this,MainActivityAR2.class);
        startActivity(intent);
    }
}