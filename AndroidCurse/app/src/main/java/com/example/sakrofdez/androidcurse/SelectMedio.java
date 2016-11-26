package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SelectMedio extends AppCompatActivity {

    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_medio);


        final Visitante visitante = new Visitante();
        ImageButton botonAtras = (ImageButton) findViewById(R.id.volverAtras);
        Button botonAudio = (Button) findViewById(R.id.selectAudio);
        Button botonVideo = (Button) findViewById(R.id.selectVideo);
        Button botonTextoVideo = (Button) findViewById(R.id.selectTextoVideo);
        final Intent medioATipoVisita = new Intent (SelectMedio.this, SelectTipoVisita.class);
        final Intent medioASelectLenaguage = new Intent (SelectMedio.this, SeleccionarLenguaje.class);
        TextView titulo = (TextView) findViewById(R.id.selecMedio);



        if(visitante.getIdiomaAsignado() == "español"){
            titulo.setText(R.string.tituloSelMedioEspañol);
            botonAudio.setText(R.string.selecAudioEspañol);
            botonVideo.setText(R.string.selecVideoEspañol);
            botonTextoVideo.setText(R.string.selecTextoVideoEspañol);
        }
        if(visitante.getIdiomaAsignado() == "english"){
            titulo.setText(R.string.tituloSelMedioIngles);
            botonAudio.setText(R.string.selecAudioIngles);
            botonVideo.setText(R.string.selecVideoIngles);
            botonTextoVideo.setText(R.string.selecTextoVideoIngles);
        }

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                startActivity(medioASelectLenaguage);
            }
        });
        botonAudio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                visitante.setMedioPreferido("audio");
                startActivity(medioATipoVisita);
            }
        });
        botonVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                visitante.setMedioPreferido("video");
                startActivity(medioATipoVisita);
            }
        });
        botonTextoVideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                visitante.setMedioPreferido("textovideo");
                startActivity(medioATipoVisita);
            }
        });
    }

}
