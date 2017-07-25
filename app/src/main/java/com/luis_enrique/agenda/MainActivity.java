package com.luis_enrique.agenda;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView t[];
    ImageView img[];
    String datos[][];
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t=new TextView[5];
        img=new ImageView[5];
        t[0]=(TextView)findViewById(R.id.t1);
        t[1]=(TextView)findViewById(R.id.t2);
        t[2]=(TextView)findViewById(R.id.t3);
        t[3]=(TextView)findViewById(R.id.t4);
        t[4]=(TextView)findViewById(R.id.t5);
        img[0]=(ImageView)findViewById(R.id.i1);
        img[1]=(ImageView)findViewById(R.id.i2);
        img[2]=(ImageView)findViewById(R.id.i3);
        img[3]=(ImageView)findViewById(R.id.i4);
        img[4]=(ImageView)findViewById(R.id.i5);
        for (int i=0;i<5;i++){
            img[i].setOnClickListener(this);
        }
        datos=new String[5][4];
        datos[0][0]="Kame Sen'nin";
        datos[0][1]="Kame house";
        datos[0][2]="MaestroRoshi@dragoball.com";
        datos[0][3]="165-139-180-44";
        datos[1][0]="Son Goku";
        datos[1][1]="La Montaña Paozu";
        datos[1][2]="Son.Goku@dragoball.com";
        datos[1][3]="175-334-416-62";
        datos[2][0]="Bruce Banner";
        datos[2][1]="Marvel";
        datos[2][2]="hulk@marvel.com";
        datos[2][3]="1234-1234-1962";
        datos[3][0]="Vegeta";
        datos[3][1]="Planeta Plant/Vegeta";
        datos[3][2]="Principe.vegeta@dragoball.com";
        datos[3][3]="165-2852-578-60";
        datos[4][0]="Tony Stark";
        datos[4][1]="New York";
        datos[4][2]="ironman@marvel.com";
        datos[4][3]="165-2852-578-62";

    }

    @Override
    public void onClick(View v) {
        Intent i=new Intent(this,Informacion.class);
        switch (v.getId()){
            case R.id.i1:
                i.putExtra("nombre",datos[0][0]);
                i.putExtra("direccion",datos[0][1]);
                i.putExtra("email",datos[0][2]);
                i.putExtra("tel",datos[0][3]);
                i.putExtra("imagen","1");
                startActivity(i);
                break;
            case R.id.i2:
                i.putExtra("nombre",datos[1][0]);
                i.putExtra("direccion",datos[1][1]);
                i.putExtra("email",datos[1][2]);
                i.putExtra("tel",datos[1][3]);
                i.putExtra("imagen","2");
                startActivity(i);
                break;
            case R.id.i3:
                i.putExtra("nombre",datos[2][0]);
                i.putExtra("direccion",datos[2][1]);
                i.putExtra("email",datos[2][2]);
                i.putExtra("tel",datos[2][3]);
                i.putExtra("imagen","3");
                startActivity(i);
                break;
            case R.id.i4:
                i.putExtra("nombre",datos[3][0]);
                i.putExtra("direccion",datos[3][1]);
                i.putExtra("email",datos[3][2]);
                i.putExtra("tel",datos[3][3]);
                i.putExtra("imagen","4");
                startActivity(i);
                break;
            case R.id.i5:
                i.putExtra("nombre",datos[4][0]);
                i.putExtra("direccion",datos[4][1]);
                i.putExtra("email",datos[4][2]);
                i.putExtra("tel",datos[4][3]);
                i.putExtra("imagen","5");
                startActivity(i);
                break;

        }
    }
}
