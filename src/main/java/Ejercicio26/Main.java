package Ejercicio26;

public class Main {
    public static void main(String[] args) {
        // Objeto 1: Usando el constructor vacío
        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 2500000.0;
        p1.cantidad = 5;

        // Objeto 2: Usando el constructor con parámetros
        Producto p2 = new Producto("Mouse", 50000.0, 10);

        System.out.println("Producto 1 (vacio): " + p1.nombre + " | Precio: $" + p1.precio + " | Cantidad: " + p1.cantidad);
        System.out.println("Producto 2 (parametros): " + p2.nombre + " | Precio: $" + p2.precio + " | Cantidad: " + p2.cantidad);
    }
}