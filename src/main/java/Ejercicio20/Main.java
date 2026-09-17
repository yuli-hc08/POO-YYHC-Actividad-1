package Ejercicio20;

public class Main {
    public static void main(String[] args) {
        // Comparten: La misma estructura (atributos marca, modelo y color).
        // Se diferencian: En los valores especificos asignados a cada objeto.

        Carro c1 = new Carro();
        c1.marca = "Toyota";
        c1.modelo = "Corolla";
        c1.color = "Rojo";

        Carro c2 = new Carro();
        c2.marca = "Chevrolet";
        c2.modelo = "Onix";
        c2.color = "Negro";

        Carro c3 = new Carro();
        c3.marca = "Mazda";
        c3.modelo = "CX-30";
        c3.color = "Blanco";

        System.out.println("Carro 1: " + c1.marca + " " + c1.modelo + " " + c1.color);
        System.out.println("Carro 2: " + c2.marca + " " + c2.modelo + " " + c2.color);
        System.out.println("Carro 3: " + c3.marca + " " + c3.modelo + " " + c3.color);
    }
}