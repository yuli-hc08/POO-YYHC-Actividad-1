package Ejercicio12;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        auto.marca = "Mazda";
        auto.modelo = "3";
        auto.velocidad = 15; // Velocidad inicial

        System.out.println("--- Estado Inicial ---");
        auto.mostrarEstado();

        System.out.println("\n--- Frenando primera vez (-10) ---");
        auto.frenar();
        auto.mostrarEstado(); // Queda en 5 km/h

        System.out.println("\n--- Frenando segunda vez (-10, no debe bajar de 0) ---");
        auto.frenar();
        auto.mostrarEstado(); // Queda en 0 km/h
    }
}