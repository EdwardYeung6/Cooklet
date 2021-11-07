package com.example.cooklet;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

   //private ActivityMainBinding binding;
    GridView simpleGrid;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());*/
        setContentView(R.layout.activity_main);
        //simpleGrid = (GridView) findViewById(R.id.GridView_type);

        //CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), logos);


    }

    public void to_meun_page(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity_Meun.class);
        startActivity(intent);
    }

    public void type_page(View view) {
        Intent intent = new Intent(MainActivity.this, MainActivity.class);
        startActivity(intent);
    }


}