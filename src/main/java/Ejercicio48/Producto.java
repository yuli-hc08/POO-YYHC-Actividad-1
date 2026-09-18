package Ejercicio48;

public class Producto {
    public String nombre;
    public double precio; // Atributo de la clase

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método corregido: asigna directamente al atributo sin redeclarar la variable
    public void actualizarPrecio(double nuevoPrecio) {
        this.precio = nuevoPrecio; // Modifica el atributo de la clase
    }

    public void mostrarInfo() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio);
    }
}