package Ejercicio53;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 53: RESERVA ===\n");

        Reserva miReserva = new Reserva("Ana Martínez", "15 de Octubre");

        System.out.println("--- ESTADO INICIAL ---");
        miReserva.mostrarEstado();

        System.out.println("\n--- CONFIRMACIÓN ---");
        miReserva.confirmar();
        miReserva.mostrarEstado();

        System.out.println("\n--- CANCELACIÓN ---");
        miReserva.cancelar();
        miReserva.mostrarEstado();
    }
}