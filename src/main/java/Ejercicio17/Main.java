package Ejercicio17;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.nombre = "Laura Torres";
        estudiante.carrera = "Ingeniería de Sistemas";
        estudiante.semestre = 2;

        System.out.println("--- Estado Inicial ---");
        estudiante.mostrarDetalles();

        System.out.println("\n--- Cambiando de Semestre ---");
        estudiante.cambiarSemestre(4);
        estudiante.mostrarDetalles();
    }
}