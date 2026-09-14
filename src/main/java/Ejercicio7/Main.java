package Ejercicio7;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo();
        vehiculo1.marca = "Toyota";
        vehiculo1.modelo = "Corolla";
        vehiculo1.velocidad = 80;

        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.marca = "Chevrolet";
        vehiculo2.modelo = "Spark";
        vehiculo2.velocidad = 0;

        System.out.println("--- Vehículo 1 ---");
        vehiculo1.mostrarEstado();

        System.out.println("\n--- Vehículo 2 ---");
        vehiculo2.mostrarEstado();
    }
}