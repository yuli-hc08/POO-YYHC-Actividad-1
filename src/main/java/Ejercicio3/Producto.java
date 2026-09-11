package Ejercicio3;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void mostrarProducto() {
        System.out.println("Producto: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock + " unidades");
    }
}