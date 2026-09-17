package Ejercicio23;

public class Main {
    public static void main(String[] args) {
        // Creo el objeto usando el constructor vacio
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.paginas = 417;

        System.out.println("Libro: " + libro1.titulo + " | Autor: " + libro1.autor + " | Páginas: " + libro1.paginas);
    }
}
