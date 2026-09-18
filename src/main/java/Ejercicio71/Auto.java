package Ejercicio71;

public class Auto {
    public String marca;
    public String modelo;
    public double precio;

    // Constructor con parámetros
    public Auto(String marca, String modelo, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }

    public void mostrarInformacion() {
        System.out.println("Auto: " + marca + " " + modelo + " | Precio: $" + precio);
    }
}