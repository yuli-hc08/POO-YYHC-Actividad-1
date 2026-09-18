package Ejercicio68;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 68: NEGOCIO (LAVADERO DE VEHÍCULOS) ===\n");

        ServicioLavadero servicio = new ServicioLavadero("ABC-123", "Camioneta", "Lavado General y Polichado", 45000.0);

        System.out.println("--- REGISTRO DE INGRESO ---");
        servicio.mostrarInformacion();

        System.out.println("\n--- PROCESO DE LAVADO ---");
        servicio.finalizarLavado();

        System.out.println("\n--- ESTADO FINAL ---");
        servicio.mostrarInformacion();
    }
}