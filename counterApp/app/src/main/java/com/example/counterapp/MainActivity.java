package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button buttonIncrease,ButtonDecrease,ButtonReset;
    TextView textview;
    int counter=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonIncrease=findViewById(R.id. button5);
        ButtonDecrease=findViewById(R.id. button8);
        ButtonReset=findViewById(R.id. button7);
        textview=findViewById(R.id. textView);
        buttonIncrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;
                textview.setText(Integer.toString(counter));
            }
        });
        ButtonDecrease.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;
                textview.setText(Integer.toString(counter));
            }
        });
        ButtonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter=0;
                textview.setText(Integer.toString(counter));
            }
        });
    }
}