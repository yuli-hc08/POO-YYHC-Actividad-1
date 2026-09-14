package Ejercicio11;

public class Main {
    public static void main(String[] args) {
        Vehiculo auto = new Vehiculo();
        auto.marca = "Toyota";
        auto.modelo = "Corolla";
        auto.velocidad = 50;

        System.out.println("--- Estado Inicial ---");
        auto.mostrarEstado();

        System.out.println("\n--- Acelerando el vehículo ---");
        auto.acelerar();
        auto.mostrarEstado();

        auto.acelerar();
        auto.mostrarEstado();
    }
}