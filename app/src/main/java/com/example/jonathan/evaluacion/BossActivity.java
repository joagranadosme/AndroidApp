package com.example.jonathan.evaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BossActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boss);

        BossFragment bossFragment = (BossFragment) getSupportFragmentManager().findFragmentById(R.id.boss_container);

        if(bossFragment == null){
            bossFragment = BossFragment.newInstance();
            getSupportFragmentManager().beginTransaction().add(R.id.boss_container, bossFragment).commit();
        }
    }
}
