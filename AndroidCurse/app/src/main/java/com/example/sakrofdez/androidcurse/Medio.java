package com.example.sakrofdez.androidcurse;

/**
 * Created by Sakro Fdez on 26/11/2016.
 */

public class Medio {

    private String ruta_archivo = "";
    private String formato = "";
    private String descripcion = "";

    public Medio(String ruta_archivo, String formato, String descripcion) {
        this.ruta_archivo = ruta_archivo;
        this.formato = formato;
        this.descripcion = descripcion;
    }

    public String getRuta_archivo() {
        return ruta_archivo;
    }

    public String getFormato() {
        return formato;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
