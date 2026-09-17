package Ejercicio25;

public class Main {
    public static void main(String[] args) {
        // Objeto 1: Usando constructor vacío
        Libro libro1 = new Libro();
        libro1.titulo = "Cien años de soledad";
        libro1.autor = "Gabriel García Márquez";
        libro1.paginas = 417;

        // Objeto 2: Usando constructor con parámetros
        Libro libro2 = new Libro("1984", "George Orwell", 328);

        System.out.println("Libro 1 (vacio): " + libro1.titulo + " | Autor: " + libro1.autor + " | Paginas: " + libro1.paginas);
        System.out.println("Libro 2 (parametros): " + libro2.titulo + " | Autor: " + libro2.autor + " | Paginas: " + libro2.paginas);
    }
}