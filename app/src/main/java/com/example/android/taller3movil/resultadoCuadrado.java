package com.example.android.taller3movil;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class resultadoCuadrado extends AppCompatActivity {

    private TextView resultado;
    private Bundle b;
    private String aux;
    private double l;
    private Intent i;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_cuadrado);

        resultado = (TextView)findViewById(R.id.txtResultadoCuadrado);
        b = getIntent().getExtras();
        l = b.getDouble("L");
        aux = ""+l;
        resultado.setText(aux);
    }

    public void regresar(View v){

        i = new Intent(this, ACuadrado.class);
        startActivity(i);

    }
}
