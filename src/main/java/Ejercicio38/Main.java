package Ejercicio38;

public class Main {
    public static void main(String[] args) {
        Ventilador miVentilador = new Ventilador("Samurai");

        System.out.println("Marca: " + miVentilador.marca + " | Encendido: " + miVentilador.encendido + " | Velocidad: " + miVentilador.velocidad);

        miVentilador.encender();
        miVentilador.subirVelocidad();
        miVentilador.subirVelocidad();
        miVentilador.apagar();

        System.out.println("Estado final - Encendido: " + miVentilador.encendido + " | Velocidad: " + miVentilador.velocidad);
    }
}