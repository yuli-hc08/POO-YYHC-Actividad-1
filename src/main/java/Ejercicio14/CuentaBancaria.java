package Ejercicio14;

public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public void retirar(double valor) {
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Retiro exitoso de: $" + valor);
        } else if (valor > this.saldo) {
            System.out.println("Error: Saldo insuficiente para retirar $" + valor);
        } else {
            System.out.println("El valor a retirar debe ser mayor a 0.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo actual: $" + saldo);
    }
}