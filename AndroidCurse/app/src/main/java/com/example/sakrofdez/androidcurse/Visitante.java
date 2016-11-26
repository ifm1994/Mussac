package com.example.sakrofdez.androidcurse;

import java.util.Locale;

/**
 * Created by Sakro Fdez on 26/11/2016.
 */
public class Visitante {
    private String idiomaAsignado = "";
    private String medioPreferido = "";

    public Visitante(){
        this.idiomaAsignado = Locale.getDefault().getDisplayLanguage();
    }

    public String getIdiomaAsignado() {
        return idiomaAsignado;
    }

    public void setIdiomaAsignado(String idiomaAsignado) {
        this.idiomaAsignado = idiomaAsignado;
    }

    public String getMedioPreferido() {
        return medioPreferido;
    }

    public void setMedioPreferido(String medioPreferido) {
        this.medioPreferido = medioPreferido;
    }


}
