package Ejercicio32;

public class Main {
    public static void main(String[] args) {
        // Creamos dos productos usando el método fábrica estático
        Producto p1 = Producto.crearProductoBasico("Cuaderno");
        Producto p2 = Producto.crearProductoBasico("Lápiz");

        System.out.println("Producto 1: " + p1.nombre + " | Precio: $" + p1.precio + " | Cantidad: " + p1.cantidad);
        System.out.println("Producto 2: " + p2.nombre + " | Precio: $" + p2.precio + " | Cantidad: " + p2.cantidad);
    }
}