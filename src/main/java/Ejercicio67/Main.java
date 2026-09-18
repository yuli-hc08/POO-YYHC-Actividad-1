package Ejercicio67;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 67: VIDA COTIDIANA (HÁBITO DIARIO) ===\n");

        HabitoDiario miHabito = new HabitoDiario("Hacer ejercicio por la mañana", 45);

        System.out.println("--- ESTADO INICIAL ---");
        miHabito.mostrarInformacion();

        System.out.println("\n--- REGISTRO DE CUMPLIMIENTO ---");
        miHabito.marcarComoCompletado();

        System.out.println("\n--- ESTADO ACTUALIZADO ---");
        miHabito.mostrarInformacion();
    }
}