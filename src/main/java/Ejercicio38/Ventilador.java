package Ejercicio38;

public class Ventilador {
    public String marca;
    public int velocidad;
    public boolean encendido;

    // Constructor
    public Ventilador(String marca) {
        this.marca = marca;
        this.velocidad = 0;
        this.encendido = false; // Inicia apagado por defecto
    }

    public void encender() {
        this.encendido = true;
        if (this.velocidad == 0) {
            this.velocidad = 1; // Al encenderlo se establece una velocidad inicial
        }
        System.out.println("El ventilador " + marca + " se ha encendido.");
    }

    public void apagar() {
        this.encendido = false;
        this.velocidad = 0;
        System.out.println("El ventilador " + marca + " se ha apagado.");
    }

    public void subirVelocidad() {
        if (this.encendido) {
            this.velocidad++;
            System.out.println("Velocidad del ventilador " + marca + " aumentada a: " + this.velocidad);
        } else {
            System.out.println("No se puede subir la velocidad porque el ventilador está apagado.");
        }
    }
}