package Ejercicio5;

public class Mascota {
    public String nombre;
    public String especie;
    public int edad;

    public void mostrarMascota() {
        System.out.println("--- Información de la Mascota ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad + " años");
    }
}