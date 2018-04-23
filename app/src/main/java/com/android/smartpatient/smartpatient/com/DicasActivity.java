package com.android.smartpatient.smartpatient.com;

import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.android.smartpatient.smartpatient.R;

import java.util.ArrayList;

public class DicasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dicas);

        String [] dicas = {"Os 13 Benefícios do Óleo de Cocô Para o Cabelo", "Propriedades Nutricionais e Medicinais do Óleo de Coco",
                "Chá Verde Com Gengibre e Canela Para Perder 3Kg em 7 Dias", "Os 10 Benefícios do Selênio Para Saúde"};
        final ListView listaDicas = (ListView) findViewById(R.id.lista_dicas);
        listaDicas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Snackbar.make(view, "Selecionado:" + listaDicas.getItemAtPosition(position), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, dicas);
        listaDicas.setAdapter(adapter);

        listaDicas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Snackbar.make(view, "Selecionado:" + listaDicas.getItemAtPosition(position), Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();


            }
        });

    }

}
