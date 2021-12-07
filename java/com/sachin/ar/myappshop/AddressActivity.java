package com.sachin.ar.myappshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class AddressActivity extends AppCompatActivity {

    private String selectedState,stateList[];
    private Button saveBtn;
    private Spinner stateSpinner;
    private EditText city,locality,flatNo,pincode,landmark,name,mobileNo,alternateMobileNo;

    private boolean updateAddress=false;

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_address);


        saveBtn=findViewById(R.id.save_btn);
        city=findViewById(R.id.city);
        locality=findViewById(R.id.locality);
        flatNo=findViewById(R.id.flat_no);
        pincode=findViewById(R.id.pincode);
        landmark=findViewById(R.id.landmark);
        name=findViewById(R.id.name);
        mobileNo=findViewById(R.id.mobile_no);
        alternateMobileNo=findViewById(R.id.alternate_mobile_no);
        stateSpinner=findViewById(R.id.state_spinner);
        stateList=getResources().getStringArray(R.array.india_states);



        ArrayAdapter spinnerAdapter = new ArrayAdapter(this,android.R.layout.simple_spinner_item,stateList);
        spinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        stateSpinner.setAdapter(spinnerAdapter);
        stateSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                selectedState=stateList[i];

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });


        saveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String city1=city.getText().toString();
                String locality1=locality.getText().toString();
                String flatNo1=flatNo.getText().toString();
                String pincode1=pincode.getText().toString();
                String landmark1=landmark.getText().toString();
                String name1=name.getText().toString();
                String mobileNo1=mobileNo.getText().toString();
                String alternateMobileNo1=alternateMobileNo.getText().toString();

                Intent intent=new Intent(AddressActivity.this,AddressNew.class);
                intent.putExtra("city1",city1);
                intent.putExtra("locality1",locality1);
                intent.putExtra("flatNo1",flatNo1);
                intent.putExtra("pincode1",pincode1);
                intent.putExtra("landmark1",landmark1);
                intent.putExtra("name1",name1);
                intent.putExtra("mobileNo1",mobileNo1);
                intent.putExtra("alternateMobileNo1",alternateMobileNo1);
                intent.putExtra("selectedState",selectedState);
                startActivity(intent);
                finish();


            }
        });







    }
}