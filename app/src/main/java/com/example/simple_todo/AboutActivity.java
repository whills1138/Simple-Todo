package com.example.simple_todo;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class AboutActivity extends AppCompatActivity {
    private Button extra1;
    private TextView extra2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        extra1 = findViewById(R.id.extra1);
        extra1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View view) {
            Intent intent = new Intent();
            intent.setData(Uri.parse("https://franklylying.site"));
            intent.setAction(Intent.ACTION_VIEW);
            startActivity(intent);
        }
    });
        final TextView textView = findViewById(R.id.extra2);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                copybutton copybutton = new copybutton(getApplicationContext(),textView);
                copybutton.init();
            }
        });
}
}