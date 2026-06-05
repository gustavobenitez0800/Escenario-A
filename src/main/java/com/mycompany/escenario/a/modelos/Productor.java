package com.mycompany.escenario.a.modelos;

/**
 * Clase de dominio que representa un Productor.
 * Es una clase "ciega, sorda y muda": no tiene Scanner ni System.out.
 */
public class Productor {
    private String nombre;
    private String ubicacion;

    public Productor(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
