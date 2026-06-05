package com.mycompany.escenario.a.vistas;

import java.util.Scanner;
import com.mycompany.escenario.a.modelos.Lote;
import com.mycompany.escenario.a.modelos.Bobina;

/**
 * Clase que maneja la entrada y salida de datos (I/O).
 * Aquí SI está permitido usar Scanner y System.out.println.
 */
public class ConsolaVista {
    private Scanner scanner;

    public ConsolaVista() {
        this.scanner = new Scanner(System.in);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public String pedirDatoString(String mensaje) {
        System.out.print(mensaje + ": ");
        return scanner.nextLine();
    }

    public double pedirDatoDouble(String mensaje) {
        System.out.print(mensaje + ": ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido.");
            scanner.next(); // Limpiar el buffer
            System.out.print(mensaje + ": ");
        }
        double valor = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el salto de línea
        return valor;
    }

    public void mostrarLote(Lote lote) {
        System.out.println("==== Datos del Lote ====");
        System.out.println("ID Lote: " + lote.getIdLote());
        System.out.println("Productor: " + lote.getProductor().getNombre());
        System.out.println("Cantidad de Bobinas: " + lote.getBobinas().size());
        for (Bobina b : lote.getBobinas()) {
            System.out.println(" - Bobina [" + b.getCodigo() + "] Peso: " + b.getPesoKg() + " kg");
        }
        System.out.println("========================");
    }
}
