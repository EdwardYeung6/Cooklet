package com.example.cooklet;

import android.os.Bundle;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.cooklet.databinding.ActivityMainBinding;

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


}