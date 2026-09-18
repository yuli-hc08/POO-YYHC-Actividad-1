package Ejercicio64;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 64: DISEÑO DE LA CLASE TIENDA ===\n");

        System.out.println("1. ATRIBUTOS DEFINIDOS:");
        System.out.println("- nombre (String)");
        System.out.println("- tipo (String)");
        System.out.println("- ventasTotales (double)\n");

        System.out.println("2. MÉTODOS DEFINIDOS:");
        System.out.println("- realizarVenta(double monto)");
        System.out.println("- mostrarInformacion()\n");

        System.out.println("3. OBJETOS REALES CONSTRUIDOS EN MEMORIA:");
        Tienda tienda1 = new Tienda("Éxito", "Supermercado");
        Tienda tienda2 = new Tienda("Panamericana", "Librería y Papelería");

        tienda1.mostrarInformacion();
        tienda1.realizarVenta(150.50);
        tienda1.mostrarInformacion();

        System.out.println();

        tienda2.mostrarInformacion();
        tienda2.realizarVenta(89.90);
        tienda2.mostrarInformacion();
    }
}