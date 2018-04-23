package com.android.smartpatient.smartpatient.com;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.smartpatient.smartpatient.R;

public class AlimentacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alimentacao);

        String [] alimentacao = {"Mamão", "Abacaxi", "Arroz", "Salada"};
        ListView listaAlimentos = (ListView) findViewById(R.id.lista_alimentacao);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alimentacao);
        listaAlimentos.setAdapter(adapter);
    }
}
