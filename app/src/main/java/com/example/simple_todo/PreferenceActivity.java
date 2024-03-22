package com.example.simple_todo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PreferenceActivity extends AppCompatActivity {
    private Button btn1;
    private Button btn2;
    private Button btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.preference);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v1) {
                setContentView(R.layout.activity_main);
                setTheme(R.style.AppTheme);
                isDestroyed();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v2) {
                setContentView(R.layout.activity_main);
                setTheme(R.style.MyTheme1);
                isDestroyed();
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v3) {
                setContentView(R.layout.activity_main);
                setTheme(R.style.Theme_AppCompat_DayNight);
                isDestroyed();
            }
        });

    }
}