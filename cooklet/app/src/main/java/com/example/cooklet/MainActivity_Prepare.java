package com.example.cooklet;


import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.text.DecimalFormat;


public class MainActivity_Prepare extends AppCompatActivity {

    AlertDialog.Builder dialogBuilder;



    int[] value;
    Dataset data = new Dataset();


    ListView lView;

   int weight_place=0;
//    boolean[] weight_place = new boolean[]{false, false};
    int volume_place=0;
    String[] weight = {"g","orz"};

    String[] volume = {"ml","cup"};

    ReipeData r_data=new ReipeData();

    //View checkBoxView = View.inflate(this, R.layout.converter, null);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_prepare);

        System.out.print(weight);
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
        Intent intent = new Intent(MainActivity_Prepare.this, MainActivity_Instruction.class);
       /* int temp= r_data.r1.getId();
        intent.putExtra("key", temp);*/
        startActivity(intent);
    }


    public void selectChange(View view){
        dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("Measurement Converter");
        String[] temp= {"Weight","Volume"};
        int temp_v=0;
        dialogBuilder.setItems(temp, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                if(which == 0){
                    changeWeight();
                }else{
                    changeVolume();
                }
            }
        });



        AlertDialog dialog = dialogBuilder.create();
        dialog.show();


    }



    public void changeWeight() {
        dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("Weight");
        dialogBuilder.setSingleChoiceItems(weight, weight_place, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                weight_place=which;
            }
        });

        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] x=r_data.measurement;
                double[] y=r_data.value;
                if(weight_place==0){

                    for(int i=0;i<x.length;i++){
                        if(x[i]=="orz"){
                            y[i]=y[i]*28.3495;
                            x[i]="g";
                        }
                    }

                }else{
                    for(int i=0;i<x.length;i++){
                        if(x[i]=="g"){
                            y[i]=y[i]/28.3495;
                            x[i]="orz";
                        }
                    }
                }
                preparation_adapter p=new preparation_adapter(getApplicationContext(),r_data.r1.getPrepare(), r_data.value,r_data.measurement);
                lView.setAdapter(p);
                dialog.dismiss();
            }
        });

        AlertDialog dialog = dialogBuilder.create();
        dialog.show();


    }


    public void changeVolume() {
        dialogBuilder = new AlertDialog.Builder(this);
        dialogBuilder.setTitle("Volume");
        dialogBuilder.setSingleChoiceItems(volume, volume_place, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                volume_place=which;
            }
        });

        dialogBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String[] x=r_data.measurement;
                double[] y=r_data.value;
                if(volume_place==0){

                    for(int i=0;i<x.length;i++){
                        if(x[i]=="cup"){
                            y[i]=y[i]*237;
                            x[i]="ml";
                        }

                    }

                }else{
                    for(int i=0;i<x.length;i++){
                        if(x[i]=="ml"){
                            y[i]=y[i]/237;
                            x[i]="cup";
                        }
                    }
                }
                preparation_adapter p=new preparation_adapter(getApplicationContext(),r_data.r1.getPrepare(), r_data.value,r_data.measurement);
                lView.setAdapter(p);
                dialog.dismiss();
            }
        });

        AlertDialog dialog = dialogBuilder.create();
        dialog.show();


    }



}