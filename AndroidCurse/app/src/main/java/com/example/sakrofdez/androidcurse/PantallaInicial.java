package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PantallaInicial extends AppCompatActivity {

    private Button botomSiguiente;
    private TextView texto1;
    private TextView texto2;

    @Override
    public void onBackPressed() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicial_mussac);

        texto1 = (TextView) findViewById(R.id.textoPaginaInicial1);
        texto2 = (TextView) findViewById(R.id.textoPaginaInicial2);

        if(CargandoApp.getCurrentLenguage() == "español"){
            texto1.setText(R.string.textoActividad1Español);
            texto2.setText(R.string.texto2Actividad1Español);
        }
        if (CargandoApp.getCurrentLenguage() == "english"){
            texto1.setText(R.string.textoActividad1Ingles);
            texto2.setText(R.string.texto2Actividad1Ingles);
        }

        MediaPlayer mp = MediaPlayer.create(this, R.raw.bienvenido);
        mp.start();


        botomSiguiente = (Button) findViewById(R.id.botonSiguiente);

        botomSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                Intent intent3 = new Intent (PantallaInicial.this, SeleccionarLenguaje.class);
                startActivity(intent3);
            }
        });


    }
}
