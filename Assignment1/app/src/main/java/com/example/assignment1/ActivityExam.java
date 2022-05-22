package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ActivityExam extends AppCompatActivity implements View.OnClickListener{
    Button ch1,ch2,ch3,ch4,buttonEnd;
    TextView txt;
    public int que=1;
    public int done=0;
    private static final String TAG="ActivityExam";
    //RelativeLayout relativeLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam);

        ch1=findViewById(R.id.button5);
        ch2=findViewById(R.id.button6);
        ch3=findViewById(R.id.button7);
        ch4=findViewById(R.id.button8);
        buttonEnd=findViewById(R.id.button4);
        txt=findViewById(R.id.textView5);

        ch1.setOnClickListener(this);
        ch2.setOnClickListener(this);
        ch3.setOnClickListener(this);
        ch4.setOnClickListener(this);
        buttonEnd.setOnClickListener(this);
        txt.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        ImageView quesImg=findViewById(R.id.imageView2);

       // ch1.setEnabled(true);
        //ch2.setEnabled(true);
       // ch3.setEnabled(true);
       // ch4.setEnabled(true);
       // ch1.setBackgroundColor(Color.parseColor("#063934") );
       // ch2.setBackgroundColor(Color.parseColor("#063934") );
       // ch3.setBackgroundColor(Color.parseColor("#063934") );
       // ch4.setBackgroundColor(Color.parseColor("#063934") );


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
           // txt.setText("do");

            if(view.getId()==R.id.button6)
            {
                que++;
            }
            else
            {
                //view.setEnabled(false);
                //view.setBackgroundColor(Color.parseColor("#C0392B") );//red
                //txt.setText("Wrong");
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
           // txt.setText("do");


            if(view.getId()==R.id.button7)
            {

                que++;
            }
            else
            {
                //view.setEnabled(false);
                //view.setBackgroundColor(Color.parseColor("#C0392B") );//red
               // txt.setText("Wrong");
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
          //  txt.setText("do");


            if(view.getId()==R.id.button5)
            {

                que++;

            }
            else
            {
                //view.setEnabled(false);
                //view.setBackgroundColor(Color.parseColor("#C0392B") );//red
              //  txt.setText("Wrong");
            }
        }
        if(que==4)
        {
            quesImg.setImageResource(R.drawable.icecream);
            ch1.setText("Zip");
            ch2.setText("Pillow");
            ch3.setText("Tree");
            ch4.setText("Ice-cream");
            ch4.setTextSize(13);
           // txt.setText("do");


            if(view.getId()==R.id.button8)
            {

                que++;

            }
            else
            {
                //view.setEnabled(false);
               // view.setBackgroundColor(Color.parseColor("#C0392B") );//red
              //  txt.setText("Wrong");
            }
        }
        if(que==5)
        {
            quesImg.setImageResource(R.drawable.tree);
            ch1.setText("Glass");
            ch2.setText("Tree");
            ch3.setText("Phone");
            ch4.setText("Sofa");
            //ch4.setTextSize(12);
         //   txt.setText("do");

            if(view.getId()==R.id.button6)
            {

                que++;
                done=1;

            }
            else
            {
              //  view.setEnabled(false);
             //   view.setBackgroundColor(Color.parseColor("#C0392B") );//red
              //  txt.setText("Wrong");
            }
        }
        if(done==1)
        {
            Intent intent = new Intent(ActivityExam.this, ActivityEnd.class);
            startActivity(intent);
        }

    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Exam");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Exam");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Exam");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Exam");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Exam");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Exam");
    }
}