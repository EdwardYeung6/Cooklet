package com.example.cooklet;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListView;

public class MainActivity_Prepare extends AppCompatActivity {

    int[] value;
    Dataset data = new Dataset();


    ListView lView;


    ReipeData r_data=new ReipeData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prepare);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getIntArray("key");

        }

        lView = (ListView) findViewById(R.id.prepare_data);

       // String temp = r_data.value.toString();
        preparation_adapter p=new preparation_adapter(getApplicationContext(),r_data.r1.getPrepare(), r_data.value,r_data.measurement);
        lView.setAdapter(p);
    }

    public void to_step(View view){
        Intent intent = new Intent(MainActivity_Prepare.this, Instruction.class);
        int temp= r_data.r1.getId();
        intent.putExtra("key", temp);
        startActivity(intent);
    }
}