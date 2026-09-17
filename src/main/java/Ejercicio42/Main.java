package Ejercicio42;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Programación Orientada a Objetos", 101, 60);
        Curso curso2 = new Curso("Bases de Datos", 102, 45);

        curso1.mostrarInfo();
        curso2.mostrarInfo();

        System.out.println("\n--- Explicación ---");
        System.out.println("Ambos objetos pertenecen a la misma clase 'Curso' porque comparten el mismo molde o plantilla (la misma estructura de atributos y métodos). Aunque tengan datos particulares diferentes (distinto nombre o código), ambos son instancias creadas a partir de la misma definición general.");
    }
}