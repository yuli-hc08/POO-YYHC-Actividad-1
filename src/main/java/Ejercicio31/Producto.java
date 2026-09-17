package Ejercicio31;

public class Producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    // Método fábrica estático
    public static Producto crearProductoBasico(String nombre) {
        return new Producto(nombre, 1000.0, 1);
    }
}