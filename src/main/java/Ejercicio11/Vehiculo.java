package Ejercicio11;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidad;

    public void acelerar() {
        this.velocidad += 10;
    }

    public void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Velocidad actual: " + velocidad + " km/h");
    }
}