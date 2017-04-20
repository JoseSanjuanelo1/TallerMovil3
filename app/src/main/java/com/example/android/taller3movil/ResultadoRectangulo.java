package com.example.android.taller3movil;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ResultadoRectangulo extends AppCompatActivity {

    private TextView resultado;
    private Bundle b;
    private String aux;
    private double l;
    private Intent i;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado_rectangulo);

        resultado = (TextView)findViewById(R.id.txtResultadoRectangulo);
        b = getIntent().getExtras();
        l = b.getDouble("L");
        aux = ""+l;
        resultado.setText(aux);
    }

    public void regresar(View v){

        i = new Intent(this, Rectangulo.class);
        startActivity(i);

    }
}
