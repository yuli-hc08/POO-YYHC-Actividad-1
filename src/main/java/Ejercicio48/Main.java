package Ejercicio48;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 48: LECTURA Y CORRECCIÓN ===\n");

        System.out.println("1. EJEMPLO ERRADO:");
        System.out.println("public void actualizarPrecio(double nuevoPrecio) {");
        System.out.println("    double precio = nuevoPrecio; // ¡Error! Variable local que 'sombra' al atributo");
        System.out.println("}\n");

        System.out.println("2. EXPLICACIÓN DEL ERROR:");
        System.out.println("Al anteponer el tipo de dato ('double') dentro del método, el programador crea una variable local temporal que existe solo durante la ejecución del método. El atributo de la clase jamás cambia su valor. Para solucionar esto se debe asignar directamente al atributo usando 'this.precio = nuevoPrecio;'.\n");

        System.out.println("3. CÓDIGO CORREGIDO EN EJECUCIÓN:");
        Producto p = new Producto("Teclado Mecánico", 50.0);
        System.out.print("Antes: ");
        p.mostrarInfo();

        p.actualizarPrecio(75.0);
        System.out.print("Después: ");
        p.mostrarInfo();
    }
}