package com.sachin.ar.myappshop;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Main2Activity extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.banners,
            R.drawable.banners1,
            R.drawable.banners2,
            R.drawable.banners3,
            R.drawable.banners4,
            R.drawable.banners5,
           };

    LinearLayout personLinearLayout;
    FloatingActionButton favorite;
    CardView cactusCardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        personLinearLayout = findViewById(R.id.person_linear_layout);
        favorite = findViewById(R.id.favorite);
        cactusCardView = findViewById(R.id.cactus_card_view);
        personLinearLayout.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main3Activity.class);
            startActivity(intent);
        });
        favorite.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main4Activity.class);
            startActivity(intent);
        });
        cactusCardView.setOnClickListener(view -> {
            Intent intent = new Intent(getApplicationContext(), Main5Activity.class);
            startActivity(intent);

        });

        sliderView = findViewById(R.id.image_slider1);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();
    }

    public void openDetails2(View view) {
        Intent intent = new Intent(getApplicationContext(), productDetailsActivity2.class);
        startActivity(intent);
    }

    public void openDetails3(View view) {
        Intent intent = new Intent(getApplicationContext(), productDetailsActivity3.class);
        startActivity(intent);
    }

    public void openDetails4(View view) {
        Intent intent = new Intent(getApplicationContext(), productDetailsActivity4.class);
        startActivity(intent);
    }

    public void openDetails5(View view) {
        Intent intent = new Intent(getApplicationContext(), productDetailsActivity5.class);
        startActivity(intent);
    }

    public void openDetails6(View view) {
        Intent intent = new Intent(getApplicationContext(), productDetailsActivity6.class);
        startActivity(intent);
    }

}
