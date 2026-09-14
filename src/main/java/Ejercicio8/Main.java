package Ejercicio8;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.nombre = "Laptop";
        p1.precio = 1200.50;
        p1.stock = 10;

        Producto p2 = new Producto();
        p2.nombre = "Mouse Gamer";
        p2.precio = 25.00;
        p2.stock = 50;

        Producto p3 = new Producto();
        p3.nombre = "Teclado Mecánico";
        p3.precio = 75.99;
        p3.stock = 30;

        System.out.println("--- Estados independientes de la clase Producto ---");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
    }
}