package Ejercicio41;

public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Ana Gómez", "Desarrolladora", 3500.0);
        emp1.mostrarInfo();

        System.out.println("\n--- Explicación ---");
        System.out.println("Modelar con clases y objetos es mejor que usar variables sueltas porque nos permite agrupar la información y las acciones de un empleado en un solo lugar. Con variables sueltas, administrar datos de múltiples empleados se vuelve desordenado y propenso a errores. Usar clases mantiene el código estructurado, limpio y fácil de reutilizar.");
    }
}