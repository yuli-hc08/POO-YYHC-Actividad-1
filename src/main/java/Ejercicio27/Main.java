package Ejercicio27;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("12345678", "Ana Martínez", 500000.0);

        System.out.println("Cuenta: " + cuenta1.numero + " | Titular: " + cuenta1.titular + " | Saldo: $" + cuenta1.saldo);
    }
}