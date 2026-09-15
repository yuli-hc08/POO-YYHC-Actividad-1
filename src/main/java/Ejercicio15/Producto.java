package Ejercicio15;

public class Producto {
    public String nombre;
    public double precio;
    public int stock;

    public void vender(int cantidad) {
        if (cantidad > 0 && cantidad <= this.stock) {
            this.stock -= cantidad;
            System.out.println("Venta realizada: " + cantidad + " unidad(es) de " + nombre);
        } else if (cantidad > this.stock) {
            System.out.println("Error: No hay suficiente stock. Solicitadas: " + cantidad + " | Disponibles: " + this.stock);
        } else {
            System.out.println("La cantidad a vender debe ser mayor a 0.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre + " | Precio: $" + precio + " | Stock disponible: " + stock);
    }
}