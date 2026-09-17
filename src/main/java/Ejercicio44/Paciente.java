package Ejercicio44;

public class Paciente {
    public String nombre;
    public int edad;
    public String diagnostico;

    // Constructor
    public Paciente(String nombre, int edad, String diagnostico) {
        this.nombre = nombre;
        this.edad = edad;
        this.diagnostico = diagnostico;
    }

    public void mostrarFicha() {
        System.out.println("Paciente: " + nombre + " | Edad: " + edad + " años | Diagnóstico: " + diagnostico);
    }
}