package Ejercicio30;

public class Estudiante {
    public String nombre;
    public String codigo;
    public int semestre;

    // Constructor vacío
    public Estudiante() {
    }

    // Constructor con nombre y código
    public Estudiante(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    // Constructor con nombre, código y semestre
    public Estudiante(String nombre, String codigo, int semestre) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
    }
}