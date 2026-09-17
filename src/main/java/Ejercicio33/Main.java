package Ejercicio33;

public class Main {
    public static void main(String[] args) {
        Libro libroOriginal = new Libro("Rayuela", "Julio Cortázar", 600);

        // Usamos el constructor copia pasando el libro original
        Libro libroCopia = new Libro(libroOriginal);

        System.out.println("Original: " + libroOriginal.titulo + " | Autor: " + libroOriginal.autor);
        System.out.println("Copia: " + libroCopia.titulo + " | Autor: " + libroCopia.autor);
    }
}
