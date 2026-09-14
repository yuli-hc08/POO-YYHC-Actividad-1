package Ejercicio8;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock: " + stock + " unidades");
    }
}