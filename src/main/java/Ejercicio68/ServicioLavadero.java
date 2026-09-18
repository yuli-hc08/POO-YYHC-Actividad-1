package Ejercicio68;

public class ServicioLavadero {
    public String placa;
    public String tipoVehiculo; // Ej: Automóvil, Camioneta, Moto
    public String tipoLavado;   // Ej: Sencillo, General, Polichado
    public double precio;
    public boolean completado;

    public ServicioLavadero(String placa, String tipoVehiculo, String tipoLavado, double precio) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoLavado = tipoLavado;
        this.precio = precio;
        this.completado = false; // Inicia en lavado por defecto
    }

    public void finalizarLavado() {
        this.completado = true;
        System.out.println("El servicio de lavado para el vehículo [" + placa + "] ha sido completado.");
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa + " | Tipo: " + tipoVehiculo + " | Servicio: " + tipoLavado + " | Precio: $" + precio + " | ¿Listo?: " + completado);
    }
}