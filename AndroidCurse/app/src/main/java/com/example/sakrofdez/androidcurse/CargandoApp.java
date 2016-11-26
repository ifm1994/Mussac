package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Locale;

public class CargandoApp extends AppCompatActivity {

    final Handler handler = new Handler();
    Visitante visitante  = new Visitante();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading);



        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent3 = new Intent (CargandoApp.this, PantallaInicial.class);
                startActivity(intent3);
            }
        }, 3000);
    }
}
