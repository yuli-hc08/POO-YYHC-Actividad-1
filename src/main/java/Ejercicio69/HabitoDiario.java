package Ejercicio69;

public class HabitoDiario {
    public String nombreHabito;
    public int metaMinutos;
    public boolean completado;

    public HabitoDiario(String nombreHabito, int metaMinutos) {
        this.nombreHabito = nombreHabito;
        this.metaMinutos = metaMinutos;
        this.completado = false;
    }

    public void mostrarInformacion() {
        System.out.println("Hábito: " + nombreHabito + " | Meta: " + metaMinutos + " mins | ¿Completado?: " + completado);
    }
}