package Ejercicio35;

public class Lampara {
    public String marca;
    public boolean encendida;

    // Constructor
    public Lampara(String marca) {
        this.marca = marca;
        this.encendida = false; // Inicia apagada por defecto
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public void mostrarEstado() {
        if (this.encendida) {
            System.out.println("La lámpara " + marca + " está ENCENDIDA.");
        } else {
            System.out.println("La lámpara " + marca + " está APAGADA.");
        }
    }
}