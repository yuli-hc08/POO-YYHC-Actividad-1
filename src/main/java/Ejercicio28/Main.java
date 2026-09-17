package Ejercicio28;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria c1 = new CuentaBancaria("1001", "Ana Martínez", 500000.0);
        CuentaBancaria c2 = new CuentaBancaria("1002", "Luis Pérez", 1200000.0);
        CuentaBancaria c3 = new CuentaBancaria("1003", "María Gomez", 350000.0);

        System.out.println("Cuenta 1: " + c1.numero + " | Titular: " + c1.titular + " | Saldo: $" + c1.saldo);
        System.out.println("Cuenta 2: " + c2.numero + " | Titular: " + c2.titular + " | Saldo: $" + c2.saldo);
        System.out.println("Cuenta 3: " + c3.numero + " | Titular: " + c3.titular + " | Saldo: $" + c3.saldo);
    }
}