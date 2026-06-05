package com.mycompany.escenario.a.modelos;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase de dominio que representa un Lote.
 * Es una clase "ciega, sorda y muda": no tiene Scanner ni System.out.
 */
public class Lote {
    private String idLote;
    private Productor productor;
    private List<Bobina> bobinas;

    public Lote(String idLote, Productor productor) {
        this.idLote = idLote;
        this.productor = productor;
        this.bobinas = new ArrayList<>();
    }

    public void agregarBobina(Bobina bobina) {
        this.bobinas.add(bobina);
    }

    // Getters y Setters
    public String getIdLote() {
        return idLote;
    }

    public void setIdLote(String idLote) {
        this.idLote = idLote;
    }

    public Productor getProductor() {
        return productor;
    }

    public void setProductor(Productor productor) {
        this.productor = productor;
    }

    public List<Bobina> getBobinas() {
        return bobinas;
    }

    public void setBobinas(List<Bobina> bobinas) {
        this.bobinas = bobinas;
    }
}
