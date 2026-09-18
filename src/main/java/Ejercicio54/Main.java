package Ejercicio54;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 54: SEMÁFORO ===\n");

        Semaforo semaforo = new Semaforo("Rojo");
        semaforo.mostrarEstado();

        System.out.println("\nCambiando a verde...");
        semaforo.cambiarColor("Verde");

        System.out.println("\nCambiando a amarillo...");
        semaforo.cambiarColor("Amarillo");

        System.out.println("\nCambiando a rojo...");
        semaforo.cambiarColor("Rojo");
    }
}