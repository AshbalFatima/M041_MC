package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityLearn extends AppCompatActivity {
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learn);

        a=findViewById(R.id. a);
        a.setOnClickListener((View.OnClickListener) this);

        b=findViewById(R.id. b);
        b.setOnClickListener((View.OnClickListener) this);

        c=findViewById(R.id. c);
        c.setOnClickListener((View.OnClickListener) this);

        d=findViewById(R.id. d);
        d.setOnClickListener((View.OnClickListener) this);

        e=findViewById(R.id. e);
        e.setOnClickListener((View.OnClickListener) this);

        f=findViewById(R.id. f);
        f.setOnClickListener((View.OnClickListener) this);

        g=findViewById(R.id. g);
        g.setOnClickListener((View.OnClickListener) this);

        h=findViewById(R.id. h);
        h.setOnClickListener((View.OnClickListener) this);

        i=findViewById(R.id. i);
        i.setOnClickListener((View.OnClickListener) this);

        j=findViewById(R.id. j);
        j.setOnClickListener((View.OnClickListener) this);

        k=findViewById(R.id. k);
        k.setOnClickListener((View.OnClickListener) this);

        l=findViewById(R.id. l);
        l.setOnClickListener((View.OnClickListener) this);

        m=findViewById(R.id. m);
        m.setOnClickListener((View.OnClickListener) this);

        n=findViewById(R.id. n);
        n.setOnClickListener((View.OnClickListener) this);

        o=findViewById(R.id. o);
        o.setOnClickListener((View.OnClickListener) this);

        p=findViewById(R.id. p);
        p.setOnClickListener((View.OnClickListener) this);

        q=findViewById(R.id. q);
        q.setOnClickListener((View.OnClickListener) this);

        r=findViewById(R.id. r);
        r.setOnClickListener((View.OnClickListener) this);

        s=findViewById(R.id. s);
        s.setOnClickListener((View.OnClickListener) this);

        t=findViewById(R.id. t);
        t.setOnClickListener((View.OnClickListener) this);

        u=findViewById(R.id. u);
        u.setOnClickListener((View.OnClickListener) this);

        v=findViewById(R.id. v);
        v.setOnClickListener((View.OnClickListener) this);

        w=findViewById(R.id. w);
        w.setOnClickListener((View.OnClickListener) this);

        x=findViewById(R.id. x);
        x.setOnClickListener((View.OnClickListener) this);

        y=findViewById(R.id. y);
        y.setOnClickListener((View.OnClickListener) this);

        z=findViewById(R.id. z);
        z.setOnClickListener((View.OnClickListener) this);
    }

    @Override
    public void onClick(View view){
        Intent itt=new Intent(ActivityLearn.this , Alphabets.class);
    }
}