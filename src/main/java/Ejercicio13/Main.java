package Ejercicio13;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numeroCuenta = "123-4567-89";
        cuenta.titular = "Carlos Mendoza";
        cuenta.saldo = 500.0;

        System.out.println("--- Estado Inicial ---");
        cuenta.mostrarDetalles();

        System.out.println("\n--- Realizando consignación ---");
        cuenta.consignar(250.0);

        System.out.println("\n--- Estado Final ---");
        cuenta.mostrarDetalles();
    }
}