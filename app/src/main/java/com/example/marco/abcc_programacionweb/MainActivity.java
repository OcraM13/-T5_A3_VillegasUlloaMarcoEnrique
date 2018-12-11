package com.example.marco.abcc_programacionweb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirActividades(View v){

        Intent i;

        switch (v.getId()){
            case R.id.btn_altas:
                i = new Intent(this , Altas.class);
                break;
            case R.id.btn_bajas:
                i = new Intent(this , Bajas.class);
                break;
            case R.id.btn_cambios:
                i = new Intent(this , Cambios.class);
                break;
            case R.id.btn_consultas:
                i = new Intent(this , Consultas.class);
                break;
        }
    }
}
