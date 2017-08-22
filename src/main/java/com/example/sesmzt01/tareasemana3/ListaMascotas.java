package com.example.sesmzt01.tareasemana3;

/**
 * Created by sesmzt01 on 20/08/2017.
 */

public class ListaMascotas {

    private int jFoto;
    private String jNombre;
    private String jCalificacion;

    public ListaMascotas (int jFoto, String jNombre, String jCalificacion){

        this.jFoto = jFoto;
        this.jNombre= jNombre;
        this.jCalificacion = jCalificacion;
    }

    public int getjFoto() {
        return jFoto;
    }

    public void setjFoto(int jFoto) {
        this.jFoto = jFoto;
    }

    public String getjNombre() {
        return jNombre;
    }

    public void setjNombre(String jNombre) {
        this.jNombre = jNombre;
    }

    public String getjCalificacion() {
        return jCalificacion;
    }

    public void setjCalificacion(String jCalificacion) {
        this.jCalificacion = jCalificacion;
    }
}
