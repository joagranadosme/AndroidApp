package com.example.jonathan.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void adminClick(View view){
        Toast.makeText(view.getContext(), "Admin click", Toast.LENGTH_LONG).show();
        //Iniciando la actividad
        Intent intent = new Intent(this, BossActivity.class);
        startActivity(intent);
    }

    public void benefClick(View view){
        Toast.makeText(view.getContext(), "Beneficio click", Toast.LENGTH_LONG).show();
    }

    public void performanceClick(View view){
        Toast.makeText(view.getContext(), "Performance click", Toast.LENGTH_LONG).show();
    }

    public void compenClick(View view){
        Toast.makeText(view.getContext(), "Compensacion click", Toast.LENGTH_LONG).show();
    }


}
