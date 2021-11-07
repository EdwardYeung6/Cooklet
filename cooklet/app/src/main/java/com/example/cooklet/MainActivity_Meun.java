package com.example.cooklet;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity_Meun extends AppCompatActivity {
   /* int[] images_beef = {R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef};

    int[] images_fish = {R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish, R.drawable.type_fish};

    int[] image_chicken = {R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken, R.drawable.type_chicken};

    int[] image_pork = {R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork, R.drawable.type_pork};

    int[] image_lamp = {R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp, R.drawable.type_lamp};

    int[] image_duck = {R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck, R.drawable.type_duck};

    int[] image_vegetable = {R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable, R.drawable.type_vegetable};

    int[][] image_list = {images_beef, images_fish, image_chicken, image_duck, image_lamp, image_pork, image_vegetable};*/

    String[] version = {"Android Alpha", "Android Beta", "Android Cupcake", "Android Donut", "Android Eclair", "Android Froyo", "Android Gingerbread", "Android Honeycomb", "Android Ice Cream Sandwich", "Android JellyBean", "Android Kitkat", "Android Lollipop", "Android Marshmallow", "Android Nougat"};

    String[] versionNumber = {"1.0", "1.1", "1.5", "1.6", "2.0", "2.2", "2.3", "3.0", "4.0", "4.1", "4.4", "5.0", "6.0", "7.0"};

    ListView lView;

    ListAdapter lAdapter;

    int[] images_group;

    Dataset d = new Dataset();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_meun);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            int value = extras.getInt("key");
            //The key argument here must match that used in the other activity
            images_group = d.getImage_list()[value];

        }



        lView = (ListView) findViewById(R.id.androidList_meun);

        lAdapter = new ListAdapter(MainActivity_Meun.this, version, versionNumber, images_group);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity_Meun.this, version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();

            }
        });
    }


    public void type_page(View view) {
        Intent intent = new Intent(MainActivity_Meun.this, MainActivity_Type.class);
        startActivity(intent);
    }
}