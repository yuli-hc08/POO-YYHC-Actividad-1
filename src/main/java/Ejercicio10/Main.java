package Ejercicio10;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria();
        cuenta1.numeroCuenta = "001-9876-A";
        cuenta1.titular = "Ana López";
        cuenta1.saldo = 1500.75;

        CuentaBancaria cuenta2 = new CuentaBancaria();
        cuenta2.numeroCuenta = "002-5432-B";
        cuenta2.titular = "Pedro Ramírez";
        cuenta2.saldo = 3200.00;

        System.out.println("--- Cuentas Bancarias Registradas ---");
        cuenta1.mostrarDetalles();
        cuenta2.mostrarDetalles();
    }
}