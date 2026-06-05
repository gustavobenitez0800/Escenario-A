
package com.mycompany.escenario.a;

import com.mycompany.escenario.a.controladores.LoteControlador;
import com.mycompany.escenario.a.vistas.ConsolaVista;

/**
 *
 * @author gusta
 */
public class EscenarioA {

    public static void main(String[] args) {
        // Inicializamos la Vista y el Controlador
        ConsolaVista vista = new ConsolaVista();
        LoteControlador controlador = new LoteControlador(vista);
        
        // Arrancamos el sistema
        controlador.iniciar();
    }
}
