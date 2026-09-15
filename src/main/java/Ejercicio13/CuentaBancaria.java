package Ejercicio13;

public class CuentaBancaria {
    public String numeroCuenta;
    public String titular;
    public double saldo;

    public void consignar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Consignación exitosa: $" + valor);
        } else {
            System.out.println("El valor a consignar debe ser mayor a 0.");
        }
    }

    public void mostrarDetalles() {
        System.out.println("Cuenta: " + numeroCuenta + " | Titular: " + titular + " | Saldo actual: $" + saldo);
    }
}