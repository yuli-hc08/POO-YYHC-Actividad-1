package Ejercicio41;

public class Empleado {
    public String nombre;
    public String cargo;
    public double salario;

    // Constructor
    public Empleado(String nombre, String cargo, double salario) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void mostrarInfo() {
        System.out.println("Empleado: " + nombre + " | Cargo: " + cargo + " | Salario: $" + salario);
    }
}