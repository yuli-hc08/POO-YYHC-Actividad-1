package Ejercicio66;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 66: CONTEXTO ACADÉMICO (SOFTWARE) ===\n");

        EstudianteSoftware estudiante = new EstudianteSoftware("Carlos Pérez", "20261001", 3, 45);

        System.out.println("--- INFORMACIÓN INICIAL ---");
        estudiante.mostrarInformacion();

        System.out.println("\n--- REGISTRO DE MATERIA APROBADA ---");
        estudiante.aprobarMateria(4);

        System.out.println("\n--- ESTADO ACTUALIZADO ---");
        estudiante.mostrarInformacion();
    }
}