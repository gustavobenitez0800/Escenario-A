package com.mycompany.escenario.a.modelos;

/**
 * Clase de dominio que representa una Bobina.
 * Es una clase "ciega, sorda y muda": no tiene Scanner ni System.out.
 */
public class Bobina {
    private String codigo;
    private double pesoKg;

    public Bobina(String codigo, double pesoKg) {
        this.codigo = codigo;
        this.pesoKg = pesoKg;
    }

    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        this.pesoKg = pesoKg;
    }
}
