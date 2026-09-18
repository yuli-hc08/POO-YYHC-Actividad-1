package Ejercicio56;

public class Temperatura {
    public double celsius;

    public Temperatura(double celsius) {
        this.celsius = celsius;
    }

    public double obtenerFahrenheit() {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public void mostrarConversion() {
        System.out.println(celsius + "°C equivalen a " + obtenerFahrenheit() + "°F");
    }
}
