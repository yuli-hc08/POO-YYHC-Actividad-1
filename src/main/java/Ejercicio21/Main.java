package Ejercicio21;

public class Main {
    public static void main(String[] args) {
        // Ambos tienen la misma edad (25), pero diferente nombre y ciudad.

        Persona p1 = new Persona();
        p1.nombre = "Carlos";
        p1.edad = 25;
        p1.ciudad = "Bogotá";

        Persona p2 = new Persona();
        p2.nombre = "Mariana";
        p2.edad = 25;
        p2.ciudad = "Medellín";

        System.out.println("Persona 1: " + p1.nombre + " | Edad: " + p1.edad + " | Ciudad: " + p1.ciudad);
        System.out.println("Persona 2: " + p2.nombre + " | Edad: " + p2.edad + " | Ciudad: " + p2.ciudad);
    }
}