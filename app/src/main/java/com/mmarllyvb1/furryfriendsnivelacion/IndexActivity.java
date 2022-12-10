package com.mmarllyvb1.furryfriendsnivelacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class IndexActivity extends AppCompatActivity {

    ListView lista;
    String[][] datos ={
            {"Nombre", "Cualidad", "Edad"},
            {"Nombre", "Cualidad", "Edad"},
            {"Nombre", "Cualidad", "Edad"},
            {"Nombre", "Cualidad", "Edad"}
    };

    int [] datosImg = {R.drawable.perrito1, R.drawable.perrito2,
            R.drawable.perrito3, R.drawable.perrito4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_index);

        lista = (ListView) findViewById(R.id.lvAdopcion);

        lista.setAdapter(new Adaptador(this, datos, datosImg));
    }
}