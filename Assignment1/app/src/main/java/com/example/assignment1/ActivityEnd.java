package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityEnd extends AppCompatActivity {
    Button btnmain;
    private static final String TAG="ActivityEnd";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        btnmain=findViewById(R.id.button9);
        btnmain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityEnd.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
    @Override

    protected void onStart(){
        super.onStart();
        Log.d(TAG, " onStart End");
    }

    @Override

    protected void onResume(){
        super.onResume();
        Log.d(TAG, " onResume End");
    }

    @Override

    protected void onPause(){
        super.onPause();
        Log.d(TAG, " onPause End");
    }

    @Override

    protected void onStop(){
        super.onStop();
        Log.d(TAG, " onStop End");
    }

    @Override

    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, " onDestroy End");
    }

    @Override

    protected void onRestart(){
        super.onRestart();
        Log.d(TAG, " onRestart End");
    }

}