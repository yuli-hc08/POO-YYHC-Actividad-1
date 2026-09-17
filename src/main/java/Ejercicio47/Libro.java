package Ejercicio47;

public class Libro {
    public String titulo;

    // Constructor
    public Libro(String titulo) {
        this.titulo = titulo;
    }

    public void mostrarTitulo() {
        System.out.println("Título del libro: " + titulo);
    }
}