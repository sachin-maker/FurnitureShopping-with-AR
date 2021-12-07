package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productDetailsActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details4);
    }

    public void openAR4(View view) {
        Intent intent=new Intent(productDetailsActivity4.this,MainActivityAR4.class);
        startActivity(intent);
    }

    public void openAR6(View view) {

    }
}