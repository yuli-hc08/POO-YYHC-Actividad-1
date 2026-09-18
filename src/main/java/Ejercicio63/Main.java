package Ejercicio63;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 63: DISEÑO DE LA CLASE HOSPITAL ===\n");

        System.out.println("1. ATRIBUTOS DEFINIDOS:");
        System.out.println("- nombre (String)");
        System.out.println("- ciudad (String)");
        System.out.println("- camasDisponibles (int)\n");

        System.out.println("2. MÉTODOS DEFINIDOS:");
        System.out.println("- ingresarPaciente()");
        System.out.println("- mostrarInformacion()\n");

        System.out.println("3. OBJETOS REALES CONSTRUIDOS EN MEMORIA:");
        Hospital hospGeneral = new Hospital("Hospital General", "Bogotá", 25);
        Hospital hospNorte = new Hospital("Clínica del Norte", "Medellín", 2);

        hospGeneral.mostrarInformacion();
        hospGeneral.ingresarPaciente();

        System.out.println();

        hospNorte.mostrarInformacion();
        hospNorte.ingresarPaciente();
        hospNorte.ingresarPaciente();
        hospNorte.ingresarPaciente(); // Intento sin camas libres
    }
}