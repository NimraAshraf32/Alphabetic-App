package com.example.shiftingactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button a;
private Button b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=findViewById(R.id.A);
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , A.class);
                startActivity(intent);
            }
        });
        b=findViewById(R.id.B);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , B.class);
                startActivity(intent);
            }
        });
        c=findViewById(R.id.C);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , C.class);
                startActivity(intent);
            }
        });
        d=findViewById(R.id.D);
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , D.class);
                startActivity(intent);
            }
        });
        e=findViewById(R.id.E);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , E.class);
                startActivity(intent);
            }
        });
        f=findViewById(R.id.F);
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , F.class);
                startActivity(intent);
            }
        });
        g=findViewById(R.id.G);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , G.class);
                startActivity(intent);
            }
        });
        h=findViewById(R.id.H);
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , H.class);
                startActivity(intent);
            }
        });
        i=findViewById(R.id.I);
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , I.class);
                startActivity(intent);
            }
        });
        j=findViewById(R.id.J);
        j.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , J.class);
                startActivity(intent);
            }
        });
        k=findViewById(R.id.K);
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , K.class);
                startActivity(intent);
            }
        });
        l=findViewById(R.id.L);
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , L.class);
                startActivity(intent);
            }
        });
        m=findViewById(R.id.M);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , M.class);
                startActivity(intent);
            }
        });
        n=findViewById(R.id.N);
        n.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , N.class);
                startActivity(intent);
            }
        });
        o=findViewById(R.id.O);
        o.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , O.class);
                startActivity(intent);
            }
        });
        p=findViewById(R.id.P);
        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , P.class);
                startActivity(intent);
            }
        });
        q=findViewById(R.id.Q);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , Q.class);
                startActivity(intent);
            }
        });
        r=findViewById(R.id.R);
        r.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , rFOR.class);
                startActivity(intent);
            }
        });
        s=findViewById(R.id.S);
        s.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , S.class);
                startActivity(intent);
            }
        });
        t=findViewById(R.id.T);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , T.class);
                startActivity(intent);
            }
        });
        u=findViewById(R.id.U);
        u.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , U.class);
                startActivity(intent);
            }
        });
        v=findViewById(R.id.V);
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , V.class);
                startActivity(intent);
            }
        });
        w=findViewById(R.id.W);
        w.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , W.class);
                startActivity(intent);
            }
        });
        x=findViewById(R.id.X);
        x.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , X.class);
                startActivity(intent);
            }
        });
        y=findViewById(R.id.Y);
        y.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , Y.class);
                startActivity(intent);
            }
        });
        z=findViewById(R.id.Z);
        z.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this , Z.class);
                startActivity(intent);
            }
        });


    }
}