package Ejercicio67;

public class HabitoDiario {
    public String nombreHabito;
    public int metaMinutos;
    public boolean completado;

    public HabitoDiario(String nombreHabito, int metaMinutos) {
        this.nombreHabito = nombreHabito;
        this.metaMinutos = metaMinutos;
        this.completado = false; // Inicia sin completar por defecto
    }

    public void marcarComoCompletado() {
        this.completado = true;
        System.out.println("¡Has completado la actividad diaria: " + nombreHabito + "!");
    }

    public void mostrarInformacion() {
        System.out.println("Hábito: " + nombreHabito + " | Meta: " + metaMinutos + " mins | ¿Completado?: " + completado);
    }
}