package com.android.smartpatient.smartpatient.com;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.android.smartpatient.smartpatient.R;

public class retorno_consultas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retorno_consultas);

        String [] consulta = {"Dr. João, dia 25/06/2015 às 15h", "Dr. Pedro, dia 30/06/2015 às 9h",};
        ListView listaConsulta = (ListView) findViewById(R.id.lista_consulta);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, consulta);
        listaConsulta.setAdapter(adapter);
    }
}
