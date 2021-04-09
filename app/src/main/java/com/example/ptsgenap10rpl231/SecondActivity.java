package com.example.ptsgenap10rpl231;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView name, phonenumber;

    String data1, data2;
    int myImage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        imageView = findViewById(R.id.imageView);
        name = findViewById(R.id.name);
        phonenumber = findViewById(R.id.phonenumber);

        getData();
        setData();
    }

    private void getData(){
        if (getIntent().hasExtra("myImage") && getIntent().hasExtra("data1") && getIntent().hasExtra("data2")){

            data1= getIntent().getStringExtra("data1");
            data2= getIntent().getStringExtra("data2");
            myImage= getIntent().getIntExtra("myImage", 1);

        }else {
            Toast.makeText(this, "No Data", Toast.LENGTH_SHORT).show();
        }
    }

    private void setData(){
        name.setText(data1);
        phonenumber.setText(data2);
        imageView.setImageResource(myImage);
    }
}