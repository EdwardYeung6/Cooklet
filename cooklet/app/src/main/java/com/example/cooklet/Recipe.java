package com.example.cooklet;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private String food;
    private int id;
    private double rating;
    private String Type;
    private String intro;
    private String step[];
    private boolean favourite;


    public Recipe() {

    }

    public Recipe(String food, int id, double rating, String type, String intro, String[] step, boolean favourite) {
        this.food = food;
        this.id = id;
        this.rating = rating;
        Type = type;
        this.intro = intro;
        this.step = step;
        this.favourite = favourite;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }

    public String[] getStep() {
        return step;
    }

    public void setStep(String[] step) {
        this.step = step;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }
}