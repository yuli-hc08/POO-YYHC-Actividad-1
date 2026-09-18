package Ejercicio65;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 65: DISEÑO DE LA CLASE EQUIPO DE FÚTBOL ===\n");

        System.out.println("1. ATRIBUTOS DEFINIDOS:");
        System.out.println("- nombre (String)");
        System.out.println("- ciudad (String)");
        System.out.println("- puntos (int)\n");

        System.out.println("2. MÉTODOS DEFINIDOS:");
        System.out.println("- ganarPartido()");
        System.out.println("- mostrarInformacion()\n");

        System.out.println("3. OBJETOS REALES CONSTRUIDOS EN MEMORIA:");
        EquipoDeFutbol equipo1 = new EquipoDeFutbol("Junior FC", "Barranquilla", 15);
        EquipoDeFutbol equipo2 = new EquipoDeFutbol("Millonarios", "Bogotá", 18);

        equipo1.mostrarInformacion();
        equipo1.ganarPartido();

        System.out.println();

        equipo2.mostrarInformacion();
        equipo2.ganarPartido();
    }
}