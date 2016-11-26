package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class VisitaLibre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita_libre);

        ImageButton botonAtras = (ImageButton) findViewById(R.id.botonAtras);
        ImageButton botonAlante = (ImageButton) findViewById(R.id.botonAlante);
//        RadioButton num1 = (RadioButton) findViewById(R.id.radioButton1);
//        RadioButton num2 = (RadioButton) findViewById(R.id.radioButton2);
//        RadioButton num3 = (RadioButton) findViewById(R.id.radioButton3);
//        RadioButton num4 = (RadioButton) findViewById(R.id.radioButton4);
//        RadioButton num5 = (RadioButton) findViewById(R.id.radioButton5);
//        RadioButton num6 = (RadioButton) findViewById(R.id.radioButton6);
//        RadioButton num7 = (RadioButton) findViewById(R.id.radioButton4);
//        RadioButton num8 = (RadioButton) findViewById(R.id.radioButton3);
//        final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
        int numeroSeleccionado = 0;

        final Intent visitaLibreASelectTipo = new Intent(this, SelectTipoVisita.class);
        final Intent visitaLibreANumero = new Intent(this, PantallaNumeroX.class);
        final Bundle bundle = new Bundle();


        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                rg.clearCheck();
                startActivity(visitaLibreASelectTipo);
            }
        });

//               if(rg.isSelected()){
//            for(int i=0;i< rg.){
//
//            }
//        }



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


