package Ejercicio31;

public class Main {
    public static void main(String[] args) {
        // Creamos un producto básico invocando el método estático
        Producto p1 = Producto.crearProductoBasico("Cuaderno");

        System.out.println("Producto: " + p1.nombre + " | Precio: $" + p1.precio + " | Cantidad: " + p1.cantidad);
    }
}