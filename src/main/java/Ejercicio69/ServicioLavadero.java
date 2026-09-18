package Ejercicio69;

public class ServicioLavadero {
    public String placa;
    public String tipoVehiculo;
    public String tipoLavado;
    public double precio;
    public boolean completado;

    public ServicioLavadero(String placa, String tipoVehiculo, String tipoLavado, double precio) {
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
        this.tipoLavado = tipoLavado;
        this.precio = precio;
        this.completado = false;
    }

    public void mostrarInformacion() {
        System.out.println("Placa: " + placa + " | Tipo: " + tipoVehiculo + " | Servicio: " + tipoLavado + " | Precio: $" + precio + " | ¿Listo?: " + completado);
    }
}