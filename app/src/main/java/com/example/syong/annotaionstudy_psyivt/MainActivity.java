package com.example.syong.annotaionstudy_psyivt;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.syong.annotation.PsyivtIntent;

@PsyivtIntent
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
