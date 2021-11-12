package com.example.cooklet;

import android.content.Context;
import android.content.Intent;
//import android.support.v4.view.PagerAdapter;
//import android.support.v4.view.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    LinearLayout Layout_bars;
    TextView[] bottomBars;
    int[] screens;
    Button Back,Home;
    ViewPager vp;
    MainActivity2.MyViewPagerAdapter myvpAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        screens = new int[]{
                R.layout.activity_introduction,
                R.layout.activity_preparation
        };
        vp = (ViewPager) findViewById(R.id.view_pager);
        Layout_bars = (LinearLayout) findViewById(R.id.layoutBars);
        Back = (Button) findViewById(R.id.back);
        Home = (Button) findViewById(R.id.home);
        myvpAdapter = new MainActivity2.MyViewPagerAdapter();
        vp.setAdapter(myvpAdapter);
        vp.addOnPageChangeListener(viewPagerPageChangeListener);
        ColoredBars(0);
    }

    public void back(View view) {
        startActivity(new Intent(MainActivity2.this, MainActivity2.class));
    }

    private void ColoredBars(int thisScreen) {
        int[] colorsInactive = getResources().getIntArray(R.array.two_dot_on_page_not_active);
        int[] colorsActive = getResources().getIntArray(R.array.two_dot_on_page_active);
        bottomBars = new TextView[screens.length];

        Layout_bars.removeAllViews();
        for (int i = 0; i < bottomBars.length; i++) {
            bottomBars[i] = new TextView(this);
            bottomBars[i].setTextSize(100);
            bottomBars[i].setText(Html.fromHtml("¯"));
            Layout_bars.addView(bottomBars[i]);
            bottomBars[i].setTextColor(colorsInactive[thisScreen]);
        }
        if (bottomBars.length > 0)
            bottomBars[thisScreen].setTextColor(colorsActive[thisScreen]);
    }

    private int getItem(int i) {
        return vp.getCurrentItem() + i;
    }

    ViewPager.OnPageChangeListener viewPagerPageChangeListener = new ViewPager.OnPageChangeListener() {

        @Override
        public void onPageSelected(int position) {
            ColoredBars(position);
            if (position == screens.length - 1) {
                Back.setVisibility(View.GONE);
                Home.setBackground(getDrawable(R.drawable.borderless_ripple));
            } else {
                Back.setVisibility(View.VISIBLE);
                Home.setBackground(getDrawable(R.drawable.white_button));
            }
        }

        @Override
        public void onPageScrolled(int arg0, float arg1, int arg2) {

        }

        @Override
        public void onPageScrollStateChanged(int arg0) {

        }
    };

    public void homeFromIntro(View view) {
        startActivity(new Intent(MainActivity2.this, MainActivity.class));
    }

    public class MyViewPagerAdapter extends PagerAdapter {
        private LayoutInflater inflater;

        public MyViewPagerAdapter() {
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            inflater = (LayoutInflater) getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View view = inflater.inflate(screens[position], container, false);
            container.addView(view);
            return view;
        }

        @Override
        public int getCount() {
            return screens.length;
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            View v = (View) object;
            container.removeView(v);
        }

        @Override
        public boolean isViewFromObject(View v, Object object) {
            return v == object;
        }
    }

    public void openInstruction(View view) {
        Intent intent = new Intent(this, Instruction.class);
        startActivity(intent);
    }
}