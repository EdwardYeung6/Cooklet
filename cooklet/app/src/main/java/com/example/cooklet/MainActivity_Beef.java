package com.example.cooklet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity_Beef extends AppCompatActivity {
    int[] images = {R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef, R.drawable.type_beef};

    String[] version = {"Android Alpha", "Android Beta", "Android Cupcake", "Android Donut", "Android Eclair", "Android Froyo", "Android Gingerbread", "Android Honeycomb", "Android Ice Cream Sandwich", "Android JellyBean", "Android Kitkat", "Android Lollipop", "Android Marshmallow", "Android Nougat"};

    String[] versionNumber = {"1.0", "1.1", "1.5", "1.6", "2.0", "2.2", "2.3", "3.0", "4.0", "4.1", "4.4", "5.0", "6.0", "7.0"};

    ListView lView;

    ListAdapter lAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_beef);

        lView = (ListView) findViewById(R.id.androidList_meun);

        lAdapter = new ListAdapter(MainActivity_Beef.this, version, versionNumber, images);

        lView.setAdapter(lAdapter);

        lView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Toast.makeText(MainActivity_Beef.this, version[i]+" "+versionNumber[i], Toast.LENGTH_SHORT).show();

            }
        });
    }
}