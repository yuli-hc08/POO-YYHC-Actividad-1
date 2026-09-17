package Ejercicio36;

public class Puerta {
    public String material;
    public boolean abierta;

    // Constructor
    public Puerta(String material) {
        this.material = material;
        this.abierta = false; // Inicia cerrada por defecto
    }

    public void abrir() {
        this.abierta = true;
    }

    public void cerrar() {
        this.abierta = false;
    }

    public void mostrarEstado() {
        if (this.abierta) {
            System.out.println("La puerta de " + material + " está ABIERTA.");
        } else {
            System.out.println("La puerta de " + material + " está CERRADA.");
        }
    }
}