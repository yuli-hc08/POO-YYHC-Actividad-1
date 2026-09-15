package Ejercicio16;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void reabastecer(int cantidad) {
        if (cantidad > 0) {
            this.stock += cantidad;
            System.out.println("Reabastecimiento exitoso: +" + cantidad + " unidades de " + nombre);
        } else {
            System.out.println("La cantidad a reabastecer debe ser mayor a 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock actual: " + stock);
    }
}