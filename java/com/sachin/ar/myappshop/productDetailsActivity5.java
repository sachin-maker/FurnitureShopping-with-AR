package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productDetailsActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details5);
    }

    public void openAR5(View view) {
        Intent intent=new Intent(productDetailsActivity5.this,MainActivityAR5.class);
        startActivity(intent);
    }
}