package Ejercicio34;

public class Libro {
    public String titulo;
    public String autor;
    public int paginas;

    // Constructor con parámetros
    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    // Constructor copia
    public Libro(Libro otroLibro) {
        this.titulo = otroLibro.titulo;
        this.autor = otroLibro.autor;
        this.paginas = otroLibro.paginas;
    }
}