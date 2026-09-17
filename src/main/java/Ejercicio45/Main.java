package Ejercicio45;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 45: LECTURA Y CORRECCIÓN ===\n");

        System.out.println("1. EJEMPLO ERRADO:");
        System.out.println("public class Persona {");
        System.out.println("    public String nombre;");
        System.out.println("}");
        System.out.println("// Error: Método fuera de los límites de la clase");
        System.out.println("public void saludar() {");
        System.out.println("    System.out.println(\"Hola\");");
        System.out.println("}\n");

        System.out.println("2. EXPLICACIÓN DEL ERROR:");
        System.out.println("El compilador arroja 'class, interface, enum, or record expected'. En Java todo método debe estar dentro del bloque delimitado por las llaves '{ }' de una clase. No pueden existir métodos huérfanos a nivel de paquete.\n");

        System.out.println("3. CÓDIGO CORREGIDO EN EJECUCIÓN:");
        Persona p = new Persona("Laura");
        p.saludar();
    }
}