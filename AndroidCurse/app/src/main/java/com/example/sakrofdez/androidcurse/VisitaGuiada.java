package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class VisitaGuiada extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita_guiada);

        ImageButton botonAtras = (ImageButton) findViewById(R.id.botonAtras);
        final Intent VisitaGuiadaASelecTipo = new Intent(this, SelectTipoVisita.class);

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(VisitaGuiadaASelecTipo);
            }
        });
        
    }
}
