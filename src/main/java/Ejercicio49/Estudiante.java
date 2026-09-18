package Ejercicio49;

public class Estudiante {
    public String nombre;
    public double nota;

    public Estudiante(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public void compararNotaCon(Estudiante otroEstudiante) {
        if (this.nota > otroEstudiante.nota) {
            System.out.println(this.nombre + " tiene una nota mayor que " + otroEstudiante.nombre);
        } else if (this.nota < otroEstudiante.nota) {
            System.out.println(otroEstudiante.nombre + " tiene una nota mayor que " + this.nombre);
        } else {
            System.out.println(this.nombre + " y " + otroEstudiante.nombre + " tienen la misma nota");
        }
    }
}