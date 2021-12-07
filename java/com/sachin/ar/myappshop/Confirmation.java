package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.UUID;

public class Confirmation extends AppCompatActivity {

    TextView orderId;
    private String order_id;
    ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);

        orderId=findViewById(R.id.order_id);
        button=findViewById(R.id.continue_shopping_btn);

        order_id = UUID.randomUUID().toString().substring(0, 28);
        orderId.setText("Order ID " + order_id);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Confirmation.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}