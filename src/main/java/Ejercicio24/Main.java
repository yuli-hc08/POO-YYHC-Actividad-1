package Ejercicio24;

public class Main {
    public static void main(String[] args) {
        // Creo el objeto directamente pasando los datos al constructor
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);

        System.out.println("Libro: " + libro1.titulo + " | Autor: " + libro1.autor + " | Páginas: " + libro1.paginas);
    }
}