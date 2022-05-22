package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLearn extends AppCompatActivity implements View.OnClickListener{
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        //buttonExam=findViewById(R.id. button30);

        a=findViewById(R.id. a);
        a.setOnClickListener(this);

        b=findViewById(R.id. b);
        b.setOnClickListener(this);

        c=findViewById(R.id. c);
        c.setOnClickListener( this);

        d=findViewById(R.id. d);
        d.setOnClickListener( this);

        e=findViewById(R.id. e);
        e.setOnClickListener( this);

        f=findViewById(R.id. f);
        f.setOnClickListener(this);

        g=findViewById(R.id. g);
        g.setOnClickListener(this);

        h=findViewById(R.id. h);
        h.setOnClickListener(this);

        i=findViewById(R.id. i);
        i.setOnClickListener(this);

        j=findViewById(R.id. j);
        j.setOnClickListener(this);

        k=findViewById(R.id. k);
        k.setOnClickListener(this);

        l=findViewById(R.id. l);
        l.setOnClickListener(this);

        m=findViewById(R.id. m);
        m.setOnClickListener(this);

        n=findViewById(R.id. n);
        n.setOnClickListener(this);

        o=findViewById(R.id. o);
        o.setOnClickListener(this);

        p=findViewById(R.id. p);
        p.setOnClickListener(this);

        q=findViewById(R.id. q);
        q.setOnClickListener(this);

        r=findViewById(R.id. r);
        r.setOnClickListener(this);

        s=findViewById(R.id. s);
        s.setOnClickListener(this);

        t=findViewById(R.id. t);
        t.setOnClickListener(this);

        u=findViewById(R.id. u);
        u.setOnClickListener(this);

        v=findViewById(R.id. v);
        v.setOnClickListener(this);

        w=findViewById(R.id. w);
        w.setOnClickListener(this);

        x=findViewById(R.id. x);
        x.setOnClickListener(this);

        y=findViewById(R.id. y);
        y.setOnClickListener(this);

        z=findViewById(R.id. z);
        z.setOnClickListener(this);
    }

    @Override
    public void onClick(View view){
        Intent itt=new Intent(ActivityLearn.this , Alphabets.class);
        switch(view.getId()){
            case R.id.a:
                itt.putExtra("input","a");
                break;
            case R.id.b:
                itt.putExtra("input","b");
                break;
            case R.id.c:
                itt.putExtra("input","c");
                break;
            case R.id.d:
                itt.putExtra("input","d");
                break;
            case R.id.e:
                itt.putExtra("input","e");
                break;
            case R.id.f:
                itt.putExtra("input","f");
                break;
            case R.id.g:
                itt.putExtra("input","g");
                break;
            case R.id.h:
                itt.putExtra("input","h");
                break;
            case R.id.i:
                itt.putExtra("input","i");
                break;
            case R.id.j:
                itt.putExtra("input","j");
                break;
            case R.id.k:
                itt.putExtra("input","k");
                break;
            case R.id.l:
                itt.putExtra("input","l");
                break;
            case R.id.m:
                itt.putExtra("input","m");
                break;
            case R.id.n:
                itt.putExtra("input","n");
                break;
            case R.id.o:
                itt.putExtra("input","o");
                break;
            case R.id.p:
                itt.putExtra("input","p");
                break;
            case R.id.q:
                itt.putExtra("input","q");
                break;
            case R.id.r:
                itt.putExtra("input","r");
                break;
            case R.id.s:
                itt.putExtra("input","s");
                break;
            case R.id.t:
                itt.putExtra("input","t");
                break;
            case R.id.u:
                itt.putExtra("input","u");
                break;
            case R.id.v:
                itt.putExtra("input","v");
                break;
            case R.id.w:
                itt.putExtra("input","w");
                break;
            case R.id.x:
                itt.putExtra("input","x");
                break;
            case R.id.y:
                itt.putExtra("input","y");
                break;
            default:
                itt.putExtra("input","z");
        }
        startActivity(itt);

    }

}