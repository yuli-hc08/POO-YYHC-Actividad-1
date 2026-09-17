package Ejercicio35;

public class Main {
    public static void main(String[] args) {
        Lampara miLampara = new Lampara("Philips");

        // Probamos los métodos y mostramos el estado
        miLampara.mostrarEstado();
        miLampara.encender();
        miLampara.mostrarEstado();
        miLampara.apagar();
        miLampara.mostrarEstado();
    }
}