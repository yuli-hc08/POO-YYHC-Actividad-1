package Ejercicio4;

public class CuentaBancaria {
    public String titular;
    public double saldo;

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Deposito de $" + cantidad + " realizado. Saldo actual: $" + saldo);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro de $" + cantidad + " realizado. Saldo restante: $" + saldo);
        } else {
            System.out.println("Fondos insuficientes para retirar $" + cantidad);
        }
    }
}