package Ejercicio9;

public class Main {
    public static void main(String[] args) {
        Mascota miMascota = new Mascota();
        miMascota.nombre = "Max";
        miMascota.especie = "Perro";
        miMascota.edad = 2;

        System.out.println("--- Estado Inicial ---");
        miMascota.mostrarEstado();

        miMascota.edad = 3;
        System.out.println("\n--- Primer Cambio de Edad ---");
        miMascota.mostrarEstado();

        miMascota.edad = 5;
        System.out.println("\n--- Segundo Cambio de Edad ---");
        miMascota.mostrarEstado();
    }
}