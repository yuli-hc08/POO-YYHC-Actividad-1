package Ejercicio50;

public class Vehiculo {
    public String marca;
    public String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("El vehículo " + marca + " " + modelo + " está encendido.");
    }
}