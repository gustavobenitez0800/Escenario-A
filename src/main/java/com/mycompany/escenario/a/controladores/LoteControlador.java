package com.mycompany.escenario.a.controladores;

import com.mycompany.escenario.a.modelos.Bobina;
import com.mycompany.escenario.a.modelos.Lote;
import com.mycompany.escenario.a.modelos.Productor;
import com.mycompany.escenario.a.vistas.ConsolaVista;

/**
 * Controlador que orquesta la interacción entre la Vista (Consola) y el Modelo (Clases de dominio).
 */
public class LoteControlador {
    private ConsolaVista vista;

    public LoteControlador(ConsolaVista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        vista.mostrarMensaje("Bienvenido al sistema de registro de Lotes");

        String nombreProductor = vista.pedirDatoString("Ingrese el nombre del productor");
        String ubiProductor = vista.pedirDatoString("Ingrese la ubicación del productor");
        Productor productor = new Productor(nombreProductor, ubiProductor);

        String idLote = vista.pedirDatoString("Ingrese el ID del lote");
        Lote lote = new Lote(idLote, productor);

        boolean agregarMas = true;
        while (agregarMas) {
            String codBobina = vista.pedirDatoString("Ingrese el código de la bobina (o 'fin' para terminar)");
            if (codBobina.equalsIgnoreCase("fin")) {
                agregarMas = false;
            } else {
                double peso = vista.pedirDatoDouble("Ingrese el peso de la bobina (kg)");
                Bobina bobina = new Bobina(codBobina, peso);
                lote.agregarBobina(bobina);
                vista.mostrarMensaje("Bobina agregada exitosamente.");
            }
        }

        vista.mostrarMensaje("\n--- Resumen del Lote Registrado ---");
        vista.mostrarLote(lote);
    }
}
