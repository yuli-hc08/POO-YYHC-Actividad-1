package Ejercicio34;

public class Main {
    public static void main(String[] args) {
        // Libro original
        Libro original = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);

        // Copia del libro usando el constructor copia
        Libro copia = new Libro(original);

        System.out.println("--- LIBRO ORIGINAL ---");
        System.out.println("Título: " + original.titulo + " | Autor: " + original.autor + " | Páginas: " + original.paginas);

        System.out.println("\n--- LIBRO COPIA ---");
        System.out.println("Título: " + copia.titulo + " | Autor: " + copia.autor + " | Páginas: " + copia.paginas);
    }
}