package Ejercicio40;

public class Pelicula {
    public String nombre;
    public String genero;
    public int minutos;

    // Constructor
    public Pelicula(String nombre, String genero, int minutos) {
        this.nombre = nombre;
        this.genero = genero;
        this.minutos = minutos;
    }

    public void mostrarFicha() {
        System.out.println("Película: " + nombre + " | Género: " + genero + " | Duración: " + minutos + " minutos");
    }
}