package Ejercicio62;

public class Biblioteca {
    // Atributos
    public String nombre;
    public String direccion;
    public int cantidadLibros;

    // Constructor
    public Biblioteca(String nombre, String direccion, int cantidadLibros) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.cantidadLibros = cantidadLibros;
    }

    // Métodos
    public void prestarLibro() {
        if (cantidadLibros > 0) {
            cantidadLibros--;
            System.out.println("Se ha prestado un libro en " + nombre + ". Libros disponibles: " + cantidadLibros);
        } else {
            System.out.println("No hay libros disponibles en " + nombre);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Biblioteca: " + nombre + " | Dirección: " + direccion + " | Cantidad de Libros: " + cantidadLibros);
    }
}