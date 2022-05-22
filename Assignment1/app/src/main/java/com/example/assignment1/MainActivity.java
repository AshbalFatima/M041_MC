package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonLearn,buttonExam,buttonRepo;
    private static final String TAG="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonLearn=findViewById(R.id. button);
        buttonExam=findViewById(R.id. button2);
        buttonRepo=findViewById(R.id. button3);

        buttonLearn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intmove = new Intent(MainActivity.this , ActivityLearn.class);
                startActivity(intmove);
            }

        });
        buttonExam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intmove = new Intent(MainActivity.this , ActivityExam.class);
                startActivity(intmove);
            }

        });

        buttonRepo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/areebamuzammil/M041_MC"));
                startActivity(browserIntent);
            }
        });

    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart Main");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume Main");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause Main");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop Main");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy Main");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart Main");
    }
}