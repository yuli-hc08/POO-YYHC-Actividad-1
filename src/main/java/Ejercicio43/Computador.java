package Ejercicio43;

public class Computador {
    public String marca;
    public String procesador;
    public int ramGB;

    // Constructor
    public Computador(String marca, String procesador, int ramGB) {
        this.marca = marca;
        this.procesador = procesador;
        this.ramGB = ramGB;
    }

    public void mostrarEspecificaciones() {
        System.out.println("Computador " + marca + " | Procesador: " + procesador + " | RAM: " + ramGB + " GB");
    }
}
