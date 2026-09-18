package Ejercicio73;

public class Vehiculo {
    public String placa;
    public String marca;
    public double precioLavado;

    // Constructor con parámetros
    public Vehiculo(String placa, String marca, double precioLavado) {
        this.placa = placa;
        this.marca = marca;
        this.precioLavado = precioLavado;
    }

    // Constructor Copia
    public Vehiculo(Vehiculo otroVehiculo) {
        this.placa = otroVehiculo.placa;
        this.marca = otroVehiculo.marca;
        this.precioLavado = otroVehiculo.precioLavado;
    }

    public void mostrarInformacion() {
        System.out.println("Vehículo [" + placa + "] - Marca: " + marca + " | Precio Lavado: $" + precioLavado);
    }
}