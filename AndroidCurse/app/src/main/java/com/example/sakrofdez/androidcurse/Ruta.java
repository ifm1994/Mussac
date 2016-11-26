package com.example.sakrofdez.androidcurse;

/**
 * Created by Sakro Fdez on 26/11/2016.
 */

public class Ruta {

    private int [] recorrido_vg;
    private String descripcion = "";


    public Ruta(int[] recorrido_vg, String descripcion) {
        this.recorrido_vg = recorrido_vg;
        this.descripcion = descripcion;
    }

    public int[] getRecorrido_vg() {
        return recorrido_vg;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
