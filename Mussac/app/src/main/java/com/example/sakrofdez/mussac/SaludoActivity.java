package com.example.sakrofdez.androidcurse;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);

        //Localizar los controles
        txtSaludo = (TextView) findViewById(R.id.txtSaludo);

        //Recuperamos la informacion pasada en el intent enviada por MainActivity
        Bundle bundle = this.getIntent().getExtras();

        //Ahora construimos el mensaje a mostrar
        txtSaludo.setText("Hola " + bundle.getString("NOMBRE"));
    }
}
