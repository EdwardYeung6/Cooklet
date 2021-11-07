package com.example.cooklet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity_Type extends AppCompatActivity {

    GridView simpleGrid;
    int[] icon = {R.drawable.type_beef, R.drawable.type_fish, R.drawable.type_chicken, R.drawable.type_duck, R.drawable.type_lamp, R.drawable.type_pork, R.drawable.type_vegetable};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_type);

        simpleGrid = (GridView) findViewById(R.id.GridView_type); // init GridView
        // Create an object of CustomAdapter and set Adapter to GirdView
        Type_icon_adapter customAdapter = new Type_icon_adapter(getApplicationContext(), icon);
        simpleGrid.setAdapter(customAdapter);
        // implement setOnItemClickListener event on GridView
        simpleGrid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // set an Intent to Another Activity
                Intent intent = new Intent(MainActivity_Type.this, MainActivity_Meun.class);
                intent.putExtra("key", position); // put image data in Intent
                startActivity(intent); // start Intent
            }
        });
    }

   /* public void to_meun_page(View view) {
        Intent intent = new Intent(MainActivity_Type.this, MainActivity_Meun.class);
        startActivity(intent);
    }
*/
    public void type_page(View view) {
        Intent intent = new Intent(MainActivity_Type.this, MainActivity_Type.class);
        startActivity(intent);
    }
}