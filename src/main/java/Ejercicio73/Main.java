package Ejercicio73;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 73: CONSTRUCTOR COPIA ===\n");

        // 1. Crear el objeto original
        Vehiculo vehiculoOriginal = new Vehiculo("XYZ-789", "Chevrolet", 35000.0);

        // 2. Crear una copia exacta usando el constructor copia
        Vehiculo vehiculoCopia = new Vehiculo(vehiculoOriginal);

        System.out.println("--- VEHÍCULO ORIGINAL ---");
        vehiculoOriginal.mostrarInformacion();

        System.out.println("\n--- VEHÍCULO COPIADO ---");
        vehiculoCopia.mostrarInformacion();
    }
}