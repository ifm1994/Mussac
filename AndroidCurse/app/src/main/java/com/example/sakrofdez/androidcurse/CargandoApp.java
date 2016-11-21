package com.example.sakrofdez.androidcurse;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.Locale;

public class CargandoApp extends AppCompatActivity {

    public static String idiomaAsignado = Locale.getDefault().getDisplayLanguage();
    public static String medioPreferido = "";
    final Handler handler = new Handler();


    public static String getCurrentLenguage() {
        return idiomaAsignado;
    }

    public static void setLenguage(String someLenguage) {
        idiomaAsignado = someLenguage;
    }

    public static String getMedio(){
        return medioPreferido;
    }

    public static void setMedio(String medPreferido){
        medioPreferido = medPreferido;
    }

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
