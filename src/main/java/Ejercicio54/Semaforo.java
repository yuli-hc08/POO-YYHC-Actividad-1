package Ejercicio54;

public class Semaforo {
    public String colorActual;

    public Semaforo(String colorInicial) {
        this.colorActual = colorInicial;
    }

    public void cambiarColor(String nuevoColor) {
        this.colorActual = nuevoColor;
        System.out.println("El semáforo ha cambiado a: " + colorActual);
    }

    public void mostrarEstado() {
        System.out.println("Color actual: " + colorActual);
    }
}