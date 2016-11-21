package com.example.sakrofdez.androidcurse;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

public class SeleccionarLenguaje extends Activity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_lenguage);

        TextView textoSeleccionarIdioma = (TextView) findViewById(R.id.selecIdiom);
        ImageButton botonAtras = (ImageButton) findViewById(R.id.volverAtras);
        ImageButton botonEspañol = (ImageButton) findViewById(R.id.idiomaEspañol);
        ImageButton botonIngles = (ImageButton) findViewById(R.id.idiomaIngles);
        ImageButton botonFrances = (ImageButton) findViewById(R.id.idiomaIFrances);
        ImageButton botonAleman = (ImageButton) findViewById(R.id.idiomaAleman);
        ImageButton botonItalia = (ImageButton) findViewById(R.id.idiomaItalia);
        ImageButton botonArabe = (ImageButton) findViewById(R.id.idiomaArabe);

        if (CargandoApp.getCurrentLenguage() == "español") {
            textoSeleccionarIdioma.setText(R.string.textoSelIdiEspañol);
        }
        if (CargandoApp.getCurrentLenguage() == "english") {
            textoSeleccionarIdioma.setText(R.string.textoSelIdiIngles);
        }

        botonAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SeleccionarLenguaje.this, PantallaInicial.class);
                startActivity(intent);
            }
        });
        botonEspañol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenguajeAMedio = new Intent(SeleccionarLenguaje.this, SelectMedio.class);
                CargandoApp.setLenguage("español");
                startActivity(lenguajeAMedio);
            }
        });
        botonIngles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenguajeAMedio = new Intent(SeleccionarLenguaje.this, SelectMedio.class);
                CargandoApp.setLenguage("english");
                startActivity(lenguajeAMedio);
            }
        });
        botonFrances.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenguajeAMedio = new Intent(SeleccionarLenguaje.this, SelectMedio.class);
                CargandoApp.setLenguage("français");
                startActivity(lenguajeAMedio);
            }
        });
        botonItalia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenguajeAMedio = new Intent(SeleccionarLenguaje.this, SelectMedio.class);
                CargandoApp.setLenguage("italiano");
                startActivity(lenguajeAMedio);
            }
        });
        botonArabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenguajeAMedio = new Intent(SeleccionarLenguaje.this, SelectMedio.class);
                CargandoApp.setLenguage("العربي");
                startActivity(lenguajeAMedio);
            }
        });
        botonAleman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lenguajeAMedio = new Intent(SeleccionarLenguaje.this, SelectMedio.class);
                CargandoApp.setLenguage("deutsch");
                startActivity(lenguajeAMedio);
            }
        });


        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client = new GoogleApiClient.Builder(this).addApi(AppIndex.API).build();
    }

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    public Action getIndexApiAction() {
        Thing object = new Thing.Builder()
                .setName("SeleccionarLenguaje Page") // TODO: Define a title for the content shown.
                // TODO: Make sure this auto-generated URL is correct.
                .setUrl(Uri.parse("http://[ENTER-YOUR-URL-HERE]"))
                .build();
        return new Action.Builder(Action.TYPE_VIEW)
                .setObject(object)
                .setActionStatus(Action.STATUS_TYPE_COMPLETED)
                .build();
    }

    @Override
    public void onStart() {
        super.onStart();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        client.connect();
        AppIndex.AppIndexApi.start(client, getIndexApiAction());
    }

    @Override
    public void onStop() {
        super.onStop();

        // ATTENTION: This was auto-generated to implement the App Indexing API.
        // See https://g.co/AppIndexing/AndroidStudio for more information.
        AppIndex.AppIndexApi.end(client, getIndexApiAction());
        client.disconnect();
    }
}
