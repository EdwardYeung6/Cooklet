package com.example.cooklet;

import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
//import android.support.NotificationCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Step3Activity extends AppCompatActivity {

    public static CountDownTimer countDownTimer;
    public static long timeLeftInMilliseconds = 180000;
    public static boolean timerRunning;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step3);
    }
}