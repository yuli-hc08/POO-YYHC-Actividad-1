package Ejercicio52;

public class FacturaSimple {
    public int numero;
    public String cliente;
    public double valor;

    public FacturaSimple(int numero, String cliente, double valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void aplicarDescuento10() {
        this.valor = this.valor * 0.90;
    }

    public void mostrarFactura() {
        System.out.println("Factura N°: " + numero);
        System.out.println("Cliente: " + cliente);
        System.out.println("Valor Total: $" + valor);
    }
}