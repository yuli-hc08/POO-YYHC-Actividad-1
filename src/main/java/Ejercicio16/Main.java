package Ejercicio16;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.nombre = "Teclado Mecánico";
        producto.precio = 60.0;
        producto.stock = 10;

        System.out.println("--- Estado Inicial ---");
        producto.mostrarInformacion();

        System.out.println("\n--- Reabasteciendo Stock (+15) ---");
        producto.reabastecer(15);
        producto.mostrarInformacion();
    }
}