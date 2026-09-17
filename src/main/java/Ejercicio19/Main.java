package Ejercicio19;

public class Main {
    public static void main(String[] args) {
        // Estudiante es la clase porque es el molde general.
        // est1 es el objeto porque ya es un estudiante real con datos concretos.
        Estudiante est1 = new Estudiante();
        est1.nombre = "Sofia Gomez";
        est1.carrera = "Ingeniería de Sistemas";
        est1.semestre = 3;

        System.out.println("Estudiante: " + est1.nombre + " | Carrera: " + est1.carrera + " | Semestre: " + est1.semestre);
    }
}