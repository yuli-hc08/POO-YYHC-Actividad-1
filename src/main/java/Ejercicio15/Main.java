package Ejercicio15;

public class Main {
    public static void main(String[] args) {
        Producto producto = new Producto();
        producto.nombre = "Mouse Inalámbrico";
        producto.precio = 25.0;
        producto.stock = 15;

        System.out.println("--- Estado Inicial ---");
        producto.mostrarInformacion();

        System.out.println("\n--- Venta Exitosa (5 unidades) ---");
        producto.vender(5);
        producto.mostrarInformacion();

        System.out.println("\n--- Intento de Venta Fallida (20 unidades) ---");
        producto.vender(20);
        producto.mostrarInformacion();
    }
}