package com.example.cooklet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity_Prepare extends AppCompatActivity {

    int[] value;
    Dataset data = new Dataset();


    ListView lView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prepare);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getIntArray("key");

        }
        ReipeData r_data=new ReipeData();
        lView = (ListView) findViewById(R.id.prepare_data);

       // String temp = r_data.value.toString();
        preparation_adapter p=new preparation_adapter(getApplicationContext(),r_data.r1.getPrepare(), r_data.value,r_data.measurement);
        lView.setAdapter(p);
    }
}