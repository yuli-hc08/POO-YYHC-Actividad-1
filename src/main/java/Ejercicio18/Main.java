package Ejercicio18;

public class Main {
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.nombre = "Rocky";
        mascota.especie = "Perro";
        mascota.edad = 3;

        System.out.println("--- Estado Inicial ---");
        mascota.mostrarEstado();

        System.out.println("\n--- Celebrando Cumpleaños ---");
        mascota.cumplirAnios();

        System.out.println("\n--- Estado Final ---");
        mascota.mostrarEstado();
    }
}