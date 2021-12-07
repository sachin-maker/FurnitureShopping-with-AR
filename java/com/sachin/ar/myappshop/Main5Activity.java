package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Main5Activity extends AppCompatActivity {
    SliderView sliderView;
    int[] images = {R.drawable.sofa,
            R.drawable.sofa_1,
            R.drawable.sofa_2,
            R.drawable.sofa_3,
            R.drawable.sofa_4,
            R.drawable.sofa_5,
            R.drawable.sofa_6,
            R.drawable.sofa_7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        getWindow().getDecorView().setSystemUiVisibility( View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }

    public void openAR(View view) {
        Intent intent=new Intent(Main5Activity.this,MainActivityAR.class);
        startActivity(intent);
    }

    public void buyActivity(View view) {
        Intent intent=new Intent(Main5Activity.this,AddressActivity.class);
        startActivity(intent);
    }
}
