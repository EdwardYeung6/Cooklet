package com.example.cooklet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity_Introduction extends AppCompatActivity {
    int[] value;
    Dataset data=new Dataset();
    //View v=R.id.introduction_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_introduction);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getIntArray("key");

        }
        int[] temp_list=data.getImage_list()[value[0]];

        setBackground(findViewById(R.id.introduction_view), getDrawable(temp_list[value[1]]));

    }

    private static void setBackground(View view, Drawable d){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackgroundDrawable(d);
        } else {
            view.setBackground(d);
        }
    }

    public void to_prepare(View view){
        Intent intent = new Intent(MainActivity_Introduction.this, MainActivity_Prepare.class);
        intent.putExtra("key", value); // put image data in Intent
        startActivity(intent);
    }
}