package Ejercicio30;

public class Main {
    public static void main(String[] args) {
        // Objeto 1: Usando el constructor vacío
        Estudiante e1 = new Estudiante();
        e1.nombre = "Sofia Gomez";
        e1.codigo = "20241001";
        e1.semestre = 1;

        // Objeto 2: Usando el constructor con nombre y código
        Estudiante e2 = new Estudiante("Mateo Rios", "20241002");
        e2.semestre = 3;

        // Objeto 3: Usando el constructor con nombre, código y semestre
        Estudiante e3 = new Estudiante("Valeria Lopez", "20241003", 5);

        System.out.println("Estudiante 1 (vacío): " + e1.nombre + " | Código: " + e1.codigo + " | Semestre: " + e1.semestre);
        System.out.println("Estudiante 2 (2 parámetros): " + e2.nombre + " | Código: " + e2.codigo + " | Semestre: " + e2.semestre);
        System.out.println("Estudiante 3 (3 parámetros): " + e3.nombre + " | Código: " + e3.codigo + " | Semestre: " + e3.semestre);
    }
}