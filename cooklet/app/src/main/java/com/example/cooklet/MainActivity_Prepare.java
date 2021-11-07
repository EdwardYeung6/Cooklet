package com.example.cooklet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity_Prepare extends AppCompatActivity {

    int[] value;
    Dataset data=new Dataset();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prepare);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getIntArray("key");

        }
        //int[] temp_list=data.getImage_list()[value[0]];
    }
}