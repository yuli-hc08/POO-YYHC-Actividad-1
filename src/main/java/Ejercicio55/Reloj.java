package Ejercicio55;

public class Reloj {
    public int hora;
    public int minuto;
    public int segundo;

    public Reloj(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostrarHora() {
        System.out.printf("Hora actual: %02d:%02d:%02d%n", hora, minuto, segundo);
    }
}