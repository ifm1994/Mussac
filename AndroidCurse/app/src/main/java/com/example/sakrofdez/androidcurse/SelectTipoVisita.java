package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SelectTipoVisita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_tipo_visita);

        ImageButton botonAtras = (ImageButton) findViewById(R.id.botonAtras);
        Button botonVisitaLibre = (Button) findViewById(R.id.botonVisLibre);
        Button botonVisitaGuiada = (Button) findViewById(R.id.botonVisGuiada);
        Button botonIrPuntoInteres = (Button) findViewById(R.id.botonPunInteres);
        final Intent tipoVisitaASelecLenguaje = new Intent (SelectTipoVisita.this, SeleccionarLenguaje.class);
        final Intent tipoVisitaAVisitaGuiada = new Intent (SelectTipoVisita.this, VisitaGuiada.class);
        final Intent tipoVisitaAVisitaLibre = new Intent (SelectTipoVisita.this, VisitaLibre.class);
        final Intent tipoVisitaAIrAPunto = new Intent (SelectTipoVisita.this, SeleccionarPuntoInteres.class);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                startActivity(tipoVisitaASelecLenguaje);
            }
        });
        botonVisitaGuiada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                startActivity(tipoVisitaAVisitaGuiada);
            }
        });
        botonVisitaLibre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                startActivity(tipoVisitaAVisitaLibre);
            }
        });
        botonIrPuntoInteres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick( View view){
                startActivity(tipoVisitaAIrAPunto);
            }
        });
    }
}
