package Ejercicio47;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 47: LECTURA Y CORRECCIÓN ===\n");

        System.out.println("1. EJEMPLO ERRADO:");
        System.out.println("Libro miLibro; // Solo declarada, vale null");
        System.out.println("miLibro.mostrarTitulo(); // Error\n");

        System.out.println("2. EXPLICACIÓN DEL ERROR:");
        System.out.println("Declarar una variable de tipo objeto sin usar 'new' no asigna memoria. Si intentamos llamar a un método desde una variable 'null' o no inicializada, Java genera un error (NullPointerException o variable no inicializada) porque el objeto no existe en memoria.\n");

        System.out.println("3. CÓDIGO CORREGIDO EN EJECUCIÓN:");
        Libro miLibro = new Libro("Cien años de soledad"); // Se instancia correctamente con 'new'
        miLibro.mostrarTitulo();
    }
}