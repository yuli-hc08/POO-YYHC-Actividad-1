package Ejercicio60;

public class Avion {
    public String aerolinea;
    public String destino;
    public int pasajeros;

    public Avion(String aerolinea, String destino, int pasajerosIniciales) {
        this.aerolinea = aerolinea;
        this.destino = destino;
        this.pasajeros = pasajerosIniciales;
    }

    public void abordar(int cantidad) {
        this.pasajeros += cantidad;
        System.out.println("Abordaron " + cantidad + " pasajeros. Total actual a bordo: " + pasajeros);
    }

    public void mostrarInformacion() {
        System.out.println("Aerolínea: " + aerolinea);
        System.out.println("Destino: " + destino);
        System.out.println("Pasajeros a bordo: " + pasajeros);
    }
}