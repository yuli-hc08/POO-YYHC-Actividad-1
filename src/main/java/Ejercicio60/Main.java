package Ejercicio60;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 60: AVIÓN ===\n");

        Avion miAvion = new Avion("Avianca", "Madrid", 120);

        System.out.println("--- ESTADO INICIAL ---");
        miAvion.mostrarInformacion();

        System.out.println("\n--- ABORDAJE DE PASAJEROS ---");
        miAvion.abordar(35);

        System.out.println("\n--- ESTADO FINAL ---");
        miAvion.mostrarInformacion();
    }
}
