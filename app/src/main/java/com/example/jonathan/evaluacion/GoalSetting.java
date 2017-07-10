package com.example.jonathan.evaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.Arrays;
import java.util.List;

public class GoalSetting extends AppCompatActivity {

    private List<String> arraySpinner1 = Arrays.asList("Financiera.", "Interna.", "Aprendizaje.");
    private List<String> arraySpinner2 = Arrays.asList("Generar valor a los socios y grupos de interés.", "Operar de manera limpia y segura.");
    private List<String> arraySpinner3 = Arrays.asList("Ejecución presupuestal.", "Asegurar estructura organizacional.");
    private List<String> arraySpinner4 = Arrays.asList("Asegurar el fondeo oportuno de recursos.", "Aseguramiento ingeniería del proyecto.");

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goal_setting);

        Spinner spinner1 = (Spinner) findViewById(R.id.perspSpinner);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner1);
        spinner1.setAdapter(adapter1);

        Spinner spinner2 = (Spinner) findViewById(R.id.estrategicoSpinner);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner2);
        spinner2.setAdapter(adapter2);

        Spinner spinner3 = (Spinner) findViewById(R.id.indicadorSpinner);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner3);
        spinner3.setAdapter(adapter3);

        Spinner spinner4 = (Spinner) findViewById(R.id.apoyoSpinner);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, arraySpinner4);
        spinner4.setAdapter(adapter4);

    }
}
