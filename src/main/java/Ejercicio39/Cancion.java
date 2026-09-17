package Ejercicio39;

public class Cancion {
    public String titulo;
    public String artista;
    public double duracion; // Expresada en minutos

    // Constructor
    public Cancion(String titulo, String artista, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    public void mostrarInfo() {
        System.out.println("Canción: " + titulo + " | Artista: " + artista + " | Duración: " + duracion + " min");
    }
}