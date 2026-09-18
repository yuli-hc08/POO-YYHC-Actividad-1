package Ejercicio61;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 61: DISEÑO DE LA CLASE DOCENTE ===\n");

        System.out.println("1. ATRIBUTOS DEFINIDOS:");
        System.out.println("- nombre (String)");
        System.out.println("- asignatura (String)");
        System.out.println("- horasLectivas (int)\n");

        System.out.println("2. MÉTODOS DEFINIDOS:");
        System.out.println("- ensenar()");
        System.out.println("- mostrarInformacion()\n");

        System.out.println("3. OBJETOS REALES CONSTRUIDOS EN MEMORIA:");
        Docente doc1 = new Docente("John Arrieta", "Programación Orientada a Objetos", 20);
        Docente doc2 = new Docente("María López", "Cálculo Integral", 15);

        doc1.mostrarInformacion();
        doc1.ensenar();

        System.out.println();

        doc2.mostrarInformacion();
        doc2.ensenar();
    }
}