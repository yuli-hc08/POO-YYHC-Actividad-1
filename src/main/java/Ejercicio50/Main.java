package Ejercicio50;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 50: LECTURA Y CORRECCIÓN ===\n");

        System.out.println("1. EJEMPLO ERRADO:");
        System.out.println("public static void main(String[] args) {");
        System.out.println("    Vehiculo miVehiculo; // Se declara la variable pero NUNCA se construye con 'new'");
        System.out.println("    // miVehiculo.encender(); // Error: la variable no ha sido inicializada");
        System.out.println("}\n");

        System.out.println("2. EXPLICACIÓN DEL ERROR:");
        System.out.println("Tener la clase definida no crea automáticamente instancias en memoria. En el método 'main' es indispensable usar la palabra clave 'new' para construir el objeto real. De lo contrario, la variable no referencia a ningún lugar válido en memoria.\n");

        System.out.println("3. CÓDIGO CORREGIDO EN EJECUCIÓN:");
        Vehiculo miVehiculo = new Vehiculo("Toyota", "Corolla"); // Se construye el objeto en memoria
        miVehiculo.encender();
    }
}