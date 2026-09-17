package Ejercicio37;

public class Celular {
    public String marca;
    public int bateria;
    public boolean prendido;

    // Constructor
    public Celular(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
        this.prendido = false; // Inicia apagado por defecto
    }

    public void encender() {
        this.prendido = true;
        System.out.println("El celular " + marca + " se ha encendido.");
    }

    public void apagar() {
        this.prendido = false;
        System.out.println("El celular " + marca + " se ha apagado.");
    }

    public void cargarBateria() {
        this.bateria = 100;
        System.out.println("La batería de " + marca + " se ha cargado al 100%.");
    }
}