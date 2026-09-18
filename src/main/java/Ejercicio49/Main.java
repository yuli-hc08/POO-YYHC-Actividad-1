package Ejercicio49;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 49: LECTURA Y CORRECCIÓN ===\n");

        System.out.println("1. EJEMPLO ERRADO:");
        System.out.println("public void compararNota() {");
        System.out.println("    System.out.println(otroEstudiante.nota); // Error: no reconoce 'otroEstudiante'");
        System.out.println("}\n");

        System.out.println("2. EXPLICACIÓN DEL ERROR:");
        System.out.println("Un objeto no conoce a otros objetos en memoria a menos que reciba su referencia explícitamente como parámetro.\n");

        System.out.println("3. CÓDIGO CORREGIDO EN EJECUCIÓN:");
        Estudiante e1 = new Estudiante("Juan", 4.5);
        Estudiante e2 = new Estudiante("María", 3.8);

        e1.compararNotaCon(e2);
    }
}