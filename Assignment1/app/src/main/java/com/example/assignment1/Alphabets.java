package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class Alphabets extends AppCompatActivity {
    ImageView img;
    String alphabet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabets);
        img=findViewById(R.id.imageView);
        alphabet=getIntent().getStringExtra("input");
        switch(alphabet){
            case"a":
                img.setImageResource(R.drawable.a);
                break;
            case"b":
                img.setImageResource(R.drawable.b);
                break;
            case"c":
                img.setImageResource(R.drawable.c);
                break;
            case"d":
                img.setImageResource(R.drawable.d);
                break;
            case"e":
                img.setImageResource(R.drawable.e);
                break;
            case"f":
                img.setImageResource(R.drawable.f);
                break;
            case"g":
                img.setImageResource(R.drawable.g);
                break;
            case"h":
                img.setImageResource(R.drawable.h);
                break;
            case"i":
                img.setImageResource(R.drawable.i);
                break;
            case"j":
                img.setImageResource(R.drawable.j);
                break;
            case"k":
                img.setImageResource(R.drawable.k);
                break;
            case"l":
                img.setImageResource(R.drawable.l);
                break;
            case"m":
                img.setImageResource(R.drawable.m);
                break;
            case"n":
                img.setImageResource(R.drawable.n);
                break;
            case"o":
                img.setImageResource(R.drawable.o);
                break;
            case"p":
                img.setImageResource(R.drawable.p);
                break;
            case"q":
                img.setImageResource(R.drawable.q);
                break;
            case"r":
                img.setImageResource(R.drawable.r);
                break;
            case"s":
                img.setImageResource(R.drawable.s);
                break;
            case"t":
                img.setImageResource(R.drawable.t);
                break;
            case"u":
                img.setImageResource(R.drawable.u);
                break;
            case"v":
                img.setImageResource(R.drawable.v);
                break;
            case"w":
                img.setImageResource(R.drawable.w);
                break;
            case"x":
                img.setImageResource(R.drawable.x);
                break;
            case"y":
                img.setImageResource(R.drawable.y);
                break;
            default:
                img.setImageResource(R.drawable.z);
        }

    }
}