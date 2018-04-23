package com.android.smartpatient.smartpatient.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.smartpatient.smartpatient.R;

public class ExercicioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercicio);

        String [] exercicios = {"Pedalar", "Correr", "Nadar", "Musculação"};
        ListView listaExercicio = (ListView) findViewById(R.id.lista_exercicio);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, exercicios);
        listaExercicio.setAdapter(adapter);
    }
}
