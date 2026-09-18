package Ejercicio56;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 56: TEMPERATURA ===\n");

        Temperatura temp1 = new Temperatura(25.0);
        temp1.mostrarConversion();

        Temperatura temp2 = new Temperatura(0.0);
        temp2.mostrarConversion();

        Temperatura temp3 = new Temperatura(100.0);
        temp3.mostrarConversion();
    }
}