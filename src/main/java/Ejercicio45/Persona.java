package Ejercicio45;

public class Persona {
    public String nombre;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    // Método ubicado DENTRO de la clase (Corregido)
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre);
    }
}