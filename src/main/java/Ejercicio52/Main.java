package Ejercicio52;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 52: FACTURA SIMPLE ===\n");

        FacturaSimple factura = new FacturaSimple(1001, "Carlos Gómez", 200.0);

        System.out.println("--- FACTURA ORIGINAL ---");
        factura.mostrarFactura();

        System.out.println("\nAplicando descuento del 10%...");
        factura.aplicarDescuento10();

        System.out.println("\n--- FACTURA CON DESCUENTO ---");
        factura.mostrarFactura();
    }
}