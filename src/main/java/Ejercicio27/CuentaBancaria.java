package Ejercicio27;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public double saldo;

    // Constructor con numero, titular y saldo inicial
    public CuentaBancaria(String numero, String titular, double saldoInicial) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
    }
}