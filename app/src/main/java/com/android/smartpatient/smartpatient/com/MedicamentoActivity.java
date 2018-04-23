package com.android.smartpatient.smartpatient.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import com.android.smartpatient.smartpatient.R;

import java.util.ArrayList;

public class MedicamentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicamento);

        String [] medicamento = {"Doflex", "Diovan", "Omeprazol", "Dipirona"};
        ListView listaMedicamento = (ListView) findViewById(R.id.lista_medicamento);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, medicamento);
        listaMedicamento.setAdapter(adapter);
    }

}
