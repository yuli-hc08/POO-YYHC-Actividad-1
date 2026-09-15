package Ejercicio17;

public class Estudiante {
    public String nombre;
    public String carrera;
    public int semestre;

    public void cambiarSemestre(int nuevoSemestre) {
        if (nuevoSemestre > 0) {
            this.semestre = nuevoSemestre;
            System.out.println("Semestre actualizado correctamente a: " + nuevoSemestre);
        } else {
            System.out.println("Error: El semestre debe ser un número positivo.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Estudiante: " + nombre + " | Carrera: " + carrera + " | Semestre actual: " + semestre);
    }
}