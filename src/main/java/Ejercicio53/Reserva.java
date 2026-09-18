package Ejercicio53;

public class Reserva {
    public String nombreCliente;
    public String fecha;
    public boolean activa;

    public Reserva(String nombreCliente, String fecha) {
        this.nombreCliente = nombreCliente;
        this.fecha = fecha;
        this.activa = false; // Inicia sin confirmar
    }

    public void confirmar() {
        this.activa = true;
        System.out.println("Reserva confirmada con éxito para " + nombreCliente);
    }

    public void cancelar() {
        this.activa = false;
        System.out.println("Reserva cancelada para " + nombreCliente);
    }

    public void mostrarEstado() {
        System.out.println("Cliente: " + nombreCliente + " | Fecha: " + fecha + " | ¿Activa?: " + activa);
    }
}