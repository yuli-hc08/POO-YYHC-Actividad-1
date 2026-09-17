package Ejercicio25;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;

    // Constructor vacío
    public Libro() {
    }

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
}
