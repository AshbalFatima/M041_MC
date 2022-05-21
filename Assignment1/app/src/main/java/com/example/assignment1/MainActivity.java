package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button buttonLearn,buttonExam,buttonRepo;

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
}