package Ejercicio64;

public class Tienda {
    // Atributos
    public String nombre;
    public String tipo;
    public double ventasTotales;

    // Constructor
    public Tienda(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ventasTotales = 0.0;
    }

    // Métodos
    public void realizarVenta(double monto) {
        if (monto > 0) {
            ventasTotales += monto;
            System.out.println("Venta registrada por $" + monto + " en " + nombre);
        } else {
            System.out.println("El monto registrado no es válido.");
        }
    }

    public void mostrarInformacion() {
        System.out.println("Tienda: " + nombre + " | Tipo: " + tipo + " | Ventas Totales: $" + ventasTotales);
    }
}