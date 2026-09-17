package Ejercicio37;

public class Main {
    public static void main(String[] args) {
        Celular miCelular = new Celular("Samsung", 45);

        System.out.println("Marca: " + miCelular.marca + " | Batería: " + miCelular.bateria + "% | Encendido: " + miCelular.prendido);

        miCelular.encender();
        miCelular.cargarBateria();
        miCelular.apagar();

        System.out.println("Estado final - Batería: " + miCelular.bateria + "% | Encendido: " + miCelular.prendido);
    }
}