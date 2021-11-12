package com.example.cooklet;



import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class IntroductionActivity extends AppCompatActivity {
    int[] value;
    Dataset data=new Dataset();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getIntArray("key");

        }
        int[] temp_list=data.getImage_list()[value[0]];

        setBackground(findViewById(R.id.intro_background), getDrawable(temp_list[value[1]]));

    }

    private static void setBackground(ImageView view, Drawable d){
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
            view.setBackgroundDrawable(d);
        } else {
            view.setBackground(d);
        }
    }
}