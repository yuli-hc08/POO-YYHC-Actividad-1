package Ejercicio10;

public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo: $" + saldo);
    }
}