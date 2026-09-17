package Ejercicio36;

public class Main {
    public static void main(String[] args) {
        Puerta miPuerta = new Puerta("Madera");

        // Probamos los métodos y mostramos el estado
        miPuerta.mostrarEstado();
        miPuerta.abrir();
        miPuerta.mostrarEstado();
        miPuerta.cerrar();
        miPuerta.mostrarEstado();
    }
}