package Ejercicio46;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 46: LECTURA Y CORRECCIÓN ===\n");

        System.out.println("1. EJEMPLO ERRADO:");
        System.out.println("// Error: Omisión del nombre de la clase");
        System.out.println("public class {");
        System.out.println("    public String nombre;");
        System.out.println("}\n");

        System.out.println("2. EXPLICACIÓN DEL ERROR:");
        System.out.println("El compilador arroja '<identifier> expected'. En Java, la sintaxis exige colocar un nombre identificador válido inmediatamente después de la palabra clave 'class' para declarar la plantilla.\n");

        System.out.println("3. CÓDIGO CORREGIDO EN EJECUCIÓN:");
        Mascota miMascota = new Mascota("Firulais", "Perro");
        miMascota.mostrarDatos();
    }
}