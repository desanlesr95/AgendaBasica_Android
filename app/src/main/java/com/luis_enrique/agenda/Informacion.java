package com.luis_enrique.agenda;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Informacion extends AppCompatActivity {
    LinearLayout l;
    TextView t[];
    String datos[];
    ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        Bundle b=getIntent().getExtras();
        l=(LinearLayout)findViewById(R.id.l);
        t=new TextView[4];
        i=(ImageView)findViewById(R.id.img);
        for (int i=0;i<4;i++) {
            t[i] = new TextView(this);
            t[i].setHeight(80);
            t[i].setWidth(110);
        }
        switch (b.getString("imagen")){
            case "1":
                break;
        }
        Toast.makeText(this,b.getString("nombre"),Toast.LENGTH_SHORT).show();
        t[0].setText("Nombre: "+b.getString("nombre"));
        t[1].setText("Direccion: " + b.getString("direccion"));
        t[2].setText("Email: " + b.getString("email"));
        t[3].setText("Telefono: "+b.getString("tel"));
        for (int i=0;i<4;i++) {
            l.addView(t[i]);
        }

    }

}
