package Ejercicio42;

public class Curso {
    public String nombre;
    public int codigo;
    public int horas;

    // Constructor
    public Curso(String nombre, int codigo, int horas) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.horas = horas;
    }

    public void mostrarInfo() {
        System.out.println("Curso: " + nombre + " | Código: " + codigo + " | Horas: " + horas);
    }
}