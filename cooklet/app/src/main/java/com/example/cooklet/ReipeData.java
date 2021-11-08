package com.example.cooklet;

public class ReipeData {
    //Recipe recipe=new Recipe();
    String r1_step[]={"step1","step2","step3"};
    String[] prepare={"beef","salt","pepper"};
    double[] value={20,3,3};
    String[] measurement={"g","g","g"};
    Recipe r1=new Recipe("stick", 0001, 4.5, "Beef", "Cooked Beef ", r1_step, false,prepare,value,measurement);
}
