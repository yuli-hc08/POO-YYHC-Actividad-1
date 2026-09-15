package Ejercicio14;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.numeroCuenta = "987-6543-21";
        cuenta.titular = "Andrea Gómez";
        cuenta.saldo = 500.0;

        System.out.println("--- Estado Inicial ---");
        cuenta.mostrarDetalles();

        System.out.println("\n--- Retiro Exitoso ($200.0) ---");
        cuenta.retirar(200.0);
        cuenta.mostrarDetalles();

        System.out.println("\n--- Intento de Retiro Fallido ($400.0) ---");
        cuenta.retirar(400.0);
        cuenta.mostrarDetalles();
    }
}