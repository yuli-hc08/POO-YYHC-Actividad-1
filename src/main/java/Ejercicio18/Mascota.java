package Ejercicio18;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void cumplirAnios() {
        this.edad++;
        System.out.println("¡Feliz cumpleaños " + nombre + "! Ahora tiene " + edad + " años.");
    }

    public void mostrarEstado() {
        System.out.println("Mascota: " + nombre + " | Especie: " + especie + " | Edad: " + edad + " años");
    }
}