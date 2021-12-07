package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class productDetailsActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_details3);
    }

    public void openAR3(View view) {
        Intent intent=new Intent(productDetailsActivity3.this,MainActivityAR3.class);
        startActivity(intent);
    }
}