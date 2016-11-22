package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;

public class VisitaLibre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita_libre);

        ImageButton botonAtras = (ImageButton) findViewById(R.id.botonAtras);
        ImageButton botonAlante = (ImageButton) findViewById(R.id.botonAlante);
        RadioButton num1 = (RadioButton) findViewById(R.id.checkNum1);
        RadioButton num2 = (RadioButton) findViewById(R.id.checkNum2);
        RadioButton num3 = (RadioButton) findViewById(R.id.checkNum3);
        RadioButton num4 = (RadioButton) findViewById(R.id.checkNum4);
        RadioButton num5 = (RadioButton) findViewById(R.id.checkNum5);
        RadioButton num6 = (RadioButton) findViewById(R.id.checkNum6);
        RadioButton num7 = (RadioButton) findViewById(R.id.checkNum7);
        RadioButton num8 = (RadioButton) findViewById(R.id.checkNum8);
        final Intent visitaLibreASelectTipo = new Intent(this, SelectTipoVisita.class);
        final Intent visitaLibreANumero = new Intent(this, PantallaNumeroX.class);
        int numeroSeleccionado = 0;
        final Bundle bundle = new Bundle();


        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(visitaLibreASelectTipo);
            }
        });

        if(num1.isChecked()){
            numeroSeleccionado = 1;
        }
        if(num2.isChecked()){
            numeroSeleccionado = 2;
        }
        if(num3.isChecked()){
            numeroSeleccionado = 3;
        }
        if(num4.isChecked()){
            numeroSeleccionado = 4;
        }
        if(num5.isChecked()){
            numeroSeleccionado = 5;
        }
        if(num6.isChecked()){
            numeroSeleccionado = 6;
        }
        if(num7.isChecked()){
            numeroSeleccionado = 7;
        }
        if(num8.isChecked()){
            numeroSeleccionado = 8;
        }


        final int finalNumeroSeleccionado = numeroSeleccionado;
        botonAlante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (finalNumeroSeleccionado != 0){

                }else{
                    bundle.putInt("numeroSeleccionado", finalNumeroSeleccionado);
                    visitaLibreANumero.putExtras(bundle);
                    startActivity(visitaLibreANumero);
                }

            }
        });
    }
}


