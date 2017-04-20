package com.example.android.taller3movil;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;

public class ACuadrado extends AppCompatActivity {

    private EditText cajaAreaLado;
    private ArrayAdapter<String> adapter;
    private Intent i;
    private Bundle b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acuadrado);

        cajaAreaLado = (EditText)findViewById(R.id.txtvdl);
        i = new Intent(this, resultadoCuadrado.class);
        b = new Bundle();
    }

    public void borrar(View v){
        cajaAreaLado.setText("");
        cajaAreaLado.requestFocus();
    }

    public void calcularAC(View v){
        String tipo = getString(R.string.areaC);
        if(cajaAreaLado.getText().toString().isEmpty()){
            cajaAreaLado.setError(getResources().getString(R.string.error_1));
        }else {
            double l, result;
            String lado;

            l = Double.parseDouble(cajaAreaLado.getText().toString());
            lado = cajaAreaLado.getText().toString();
            result = l * l;

            b.putDouble("L", result);
            i.putExtras(b);

            startActivity(i);

            Areas p = new Areas(tipo, lado, result);
            p.guardar();
        }
    }
}
