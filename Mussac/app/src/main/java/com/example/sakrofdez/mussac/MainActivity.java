package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre;
    private Button btnAceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //esto lo hacemos para obtener una referencia a los controles de la interfaz (texto y boton)
        txtNombre = (EditText) findViewById(R.id.txtNombre);
        btnAceptar = (Button) findViewById(R.id.btnAceptar);

        //implementamos el evento click del boton
        btnAceptar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Creamos un Intent
                Intent intent = new Intent(MainActivity.this, SaludoActivity.class);

                //Creamos la informacion que se va a pasar entre las dos actividades
                Bundle bundle = new Bundle();
                bundle.putString("NOMBRE", txtNombre.getText().toString());

                //añadimos la informacion al intent
                intent.putExtras(bundle);

                //Iniciamos la nueva actividad
                startActivity(intent);
            }
        });
    }
}
