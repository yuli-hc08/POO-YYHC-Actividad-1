package Ejercicio62;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 62: DISEÑO DE LA CLASE BIBLIOTECA ===\n");

        System.out.println("1. ATRIBUTOS DEFINIDOS:");
        System.out.println("- nombre (String)");
        System.out.println("- direccion (String)");
        System.out.println("- cantidadLibros (int)\n");

        System.out.println("2. MÉTODOS DEFINIDOS:");
        System.out.println("- prestarLibro()");
        System.out.println("- mostrarInformacion()\n");

        System.out.println("3. OBJETOS REALES CONSTRUIDOS EN MEMORIA:");
        Biblioteca biblioCentral = new Biblioteca("Biblioteca Central", "Calle 10 # 5-20", 1500);
        Biblioteca biblioComunitaria = new Biblioteca("Biblioteca San José", "Carrera 15 # 40-12", 300);

        biblioCentral.mostrarInformacion();
        biblioCentral.prestarLibro();

        System.out.println();

        biblioComunitaria.mostrarInformacion();
        biblioComunitaria.prestarLibro();
    }
}