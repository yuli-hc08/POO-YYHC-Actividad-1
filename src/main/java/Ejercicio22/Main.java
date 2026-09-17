package Ejercicio22;

public class Main {
    public static void main(String[] args) {
        // Conclusión:
        // Libro es la plantilla porque define qué datos van a tener los libros.
        // Cada objeto (l1, l2, l3, l4) es un caso concreto porque guarda la información real de un libro en específico.

        Libro l1 = new Libro();
        l1.titulo = "Cien años de soledad";
        l1.autor = "Gabriel García Márquez";
        l1.paginas = 417;

        Libro l2 = new Libro();
        l2.titulo = "El principito";
        l2.autor = "Antoine de Saint-Exupéry";
        l2.paginas = 96;

        Libro l3 = new Libro();
        l3.titulo = "1984";
        l3.autor = "George Orwell";
        l3.paginas = 328;

        Libro l4 = new Libro();
        l4.titulo = "Don Quijote de la Mancha";
        l4.autor = "Miguel de Cervantes";
        l4.paginas = 863;

        System.out.println("Libro 1: " + l1.titulo + " | Autor: " + l1.autor);
        System.out.println("Libro 2: " + l2.titulo + " | Autor: " + l2.autor);
        System.out.println("Libro 3: " + l3.titulo + " | Autor: " + l3.autor);
        System.out.println("Libro 4: " + l4.titulo + " | Autor: " + l4.autor);
    }
}