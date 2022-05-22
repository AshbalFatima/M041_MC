package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ActivityExam extends AppCompatActivity implements View.OnClickListener{
    Button ch1,ch2,ch3,ch4,buttonEnd;
    public int que=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        ch1=findViewById(R.id.button5);
        ch2=findViewById(R.id.button6);
        ch3=findViewById(R.id.button7);
        ch4=findViewById(R.id.button8);
        buttonEnd=findViewById(R.id.button4);

        ch1.setOnClickListener(this);
        ch2.setOnClickListener(this);
        ch3.setOnClickListener(this);
        ch4.setOnClickListener(this);
        buttonEnd.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        ImageView quesImg=findViewById(R.id.imageView2);

        if(view.getId()==R.id.button4) {
            Intent intent = new Intent(ActivityExam.this, MainActivity.class);
            startActivity(intent);
        }
        if(que==1)
        {
            quesImg.setImageResource(R.drawable.globe);
            ch1.setText("Sun");
            ch2.setText("Globe");
            ch3.setText("Garlic");
            ch4.setText("Apple");

            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            ch1.setBackgroundColor(Color.parseColor("#063934") );
            ch2.setBackgroundColor(Color.parseColor("#063934") );
            ch3.setBackgroundColor(Color.parseColor("#063934") );
            ch4.setBackgroundColor(Color.parseColor("#063934") );
            if(view.getId()==R.id.button6)
            {
                que++;
            }
            else
            {
                view.setEnabled(false);
                view.setBackgroundColor(Color.parseColor("#C0392B") );//red
            }

        }
        if(que==2)
        {
            quesImg.setImageResource(R.drawable.helicopter);
            ch1.setText("mask");
            ch2.setText("Girl");
            ch3.setText("Helicopter");
            ch3.setTextSize(12);
            ch4.setText("Zebra");

            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            ch1.setBackgroundColor(Color.parseColor("#063934") );
            ch2.setBackgroundColor(Color.parseColor("#063934") );
            ch3.setBackgroundColor(Color.parseColor("#063934") );
            ch4.setBackgroundColor(Color.parseColor("#063934") );

            if(view.getId()==R.id.button7)
            {
                que++;
            }
            else
            {
                view.setEnabled(false);
                view.setBackgroundColor(Color.parseColor("#C0392B") );//red
            }
        }
        if(que==3)
        {
            quesImg.setImageResource(R.drawable.apple);
            ch1.setText("Apple");
            ch2.setText("Orange");
            ch3.setTextSize(16);
            ch3.setText("Tree");
            ch4.setText("Cat");

            ch1.setEnabled(true);
            ch2.setEnabled(true);
            ch3.setEnabled(true);
            ch4.setEnabled(true);
            ch1.setBackgroundColor(Color.parseColor("#063934") );
            ch2.setBackgroundColor(Color.parseColor("#063934") );
            ch3.setBackgroundColor(Color.parseColor("#063934") );
            ch4.setBackgroundColor(Color.parseColor("#063934") );

            if(view.getId()==R.id.button5)
            {
                que++;
            }
            else
            {
                view.setEnabled(false);
                view.setBackgroundColor(Color.parseColor("#C0392B") );//red
            }
        }



    }
}