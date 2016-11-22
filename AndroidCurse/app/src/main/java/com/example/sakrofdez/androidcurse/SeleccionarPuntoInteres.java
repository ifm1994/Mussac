package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SeleccionarPuntoInteres extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccionar_punto_interes);

        ImageButton botonAtras = (ImageButton) findViewById(R.id.botonAtras);
        Button botonEntSala = (Button) findViewById(R.id.botonEntradaSala);
        Button botonBaños = (Button) findViewById(R.id.botonBaños);
        Button botonEntradaSal = (Button) findViewById(R.id.botonEntraSal);
        Button botonSalEme = (Button) findViewById(R.id.botonSalEme);
        final Intent atras = new Intent(this,SelectTipoVisita.class);
        final Intent irEntradaSala = new Intent(this,ElegirOrigenEntradaSalida.class);
        final Intent irBaños = new Intent(this,ElegirOrigenBanio.class);
        final Intent irEntradaSal = new Intent(this,ElegirOrigenEntradaSalidaMuseo.class);
        final Intent irSalEme = new Intent(this,ElegirOrigenSalidaEmergencia.class);

        botonAtras.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(atras);
            }
        });
        botonEntSala.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(irEntradaSala);
            }
        });
        botonBaños.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(irBaños);
            }
        });
        botonEntradaSal.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(irEntradaSal);
            }
        });
        botonSalEme.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                startActivity(irSalEme);
            }
        });


    }
}
