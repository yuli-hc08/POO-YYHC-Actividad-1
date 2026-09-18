package Ejercicio71;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 71: CONSTRUCTOR CON PARÁMETROS ===\n");

        // Instanciación enviando los datos directamente en el constructor
        Auto miAuto = new Auto("Toyota", "Corolla", 25000.0);
        miAuto.mostrarInformacion();
    }
}