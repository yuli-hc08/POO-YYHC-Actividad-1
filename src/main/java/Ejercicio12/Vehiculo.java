package Ejercicio12;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidad;

    public void frenar() {
        if (this.velocidad >= 10) {
            this.velocidad -= 10;
        } else {
            this.velocidad = 0;
        }
    }

    public void mostrarEstado() {
        System.out.println("Vehículo: " + marca + " " + modelo + " | Velocidad actual: " + velocidad + " km/h");
    }
}