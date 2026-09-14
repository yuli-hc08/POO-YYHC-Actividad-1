package Ejercicio7;

public class Vehiculo {
    public String marca;
    public String modelo;
    public int velocidad;

    public void mostrarEstado() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidad: " + velocidad + " km/h");
    }
}