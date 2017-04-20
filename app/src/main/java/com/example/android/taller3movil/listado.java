package com.example.android.taller3movil;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class listado extends AppCompatActivity {

    private TableLayout t;
    private String aux;
    private ArrayList<Areas> a;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);
        t = (TableLayout)findViewById(R.id.tblListar);
        a = Datos.getArea();

        for (int j = 0; j < a.size(); j++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText(" "+(j+1));
            c2.setText(a.get(j).getOperacion());
            c3.setText(a.get(j).getDatos());
            c4.setText(""+a.get(j).getResultado());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            t.addView(fila);
        }

    }
    }
