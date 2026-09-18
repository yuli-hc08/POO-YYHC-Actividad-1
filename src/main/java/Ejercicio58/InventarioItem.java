package Ejercicio58;

public class InventarioItem {
    public String nombre;
    public int cantidad;
    public double precioUnitario;

    public InventarioItem(String nombre, int cantidad, double precioUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }

    public double calcularValorTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + nombre);
        System.out.println("Cantidad en stock: " + cantidad);
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Valor total en inventario: $" + calcularValorTotal());
    }
}