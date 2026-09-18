package Ejercicio61;

public class Docente {
    // Atributos
    public String nombre;
    public String asignatura;
    public int horasLectivas;

    // Constructor
    public Docente(String nombre, String asignatura, int horasLectivas) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.horasLectivas = horasLectivas;
    }

    // Métodos
    public void ensenar() {
        System.out.println("El docente " + nombre + " está dictando la clase de " + asignatura + ".");
    }

    public void mostrarInformacion() {
        System.out.println("Docente: " + nombre + " | Asignatura: " + asignatura + " | Horas semanales: " + horasLectivas);
    }
}