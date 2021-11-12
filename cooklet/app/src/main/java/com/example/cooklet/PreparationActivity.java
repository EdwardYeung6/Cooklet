package com.example.cooklet;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class PreparationActivity extends AppCompatActivity {

    ListView lView;
    int[] value;
    Dataset data = new Dataset();
    ReipeData r_data=new ReipeData();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preparation);


       Bundle extras = getIntent().getExtras();
        if (extras != null) {
            value = extras.getIntArray("key");

        }

        lView = (ListView) findViewById(R.id.ingredientListView);
        preparation_adapter p=new preparation_adapter(getApplicationContext(),r_data.r1.getPrepare(), r_data.value,r_data.measurement);
        lView.setAdapter(p);

      /*  ListView ingredientListView = (ListView) findViewById(R.id.ingredientListView);

        Ingredients meat = new Ingredients("Meat",500, "g","Weight");
        Ingredients oil = new Ingredients("Oil", 1.5, "ml","Volume");

        ArrayList<Ingredients> ingredientList = new ArrayList<>();
        ingredientList.add(meat);
        ingredientList.add(oil);
        System.out.println("Adding the items");

        IngredientListAdapter adapter = new IngredientListAdapter(this,R.layout.adapter_view_layout, ingredientList);
        ingredientListView.setAdapter(adapter);
        System.out.println("Creating the adapter");*/
    }

    public void openInstruction(View view) {
        Intent intent = new Intent(PreparationActivity.this, MainActivity_Instruction.class);
        /*int temp= r_data.r1.getId();
        intent.putExtra("key", temp);*/
        startActivity(intent);
    }
}