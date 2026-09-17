package Ejercicio46;

// Clase con su nombre bien definido (Corregido)
public class Mascota {
    public String nombre;
    public String especie;

    public Mascota(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public void mostrarDatos() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie);
    }
}