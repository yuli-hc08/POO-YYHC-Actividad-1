package Ejercicio43;

public class Main {
    public static void main(String[] args) {
        // Máquina concreta (Instancia/Objeto)
        Computador miPC = new Computador("Dell", "Intel Core i7", 16);
        miPC.mostrarEspecificaciones();

        System.out.println("\n--- Explicación ---");
        System.out.println("El plano conceptual (la clase 'Computador') es únicamente la plantilla o molde abstracto que define la estructura y capacidades que tendrá un equipo (marca, procesador, RAM). La máquina concreta (el objeto o instancia) es la entidad física o real construida a partir de dicho plano, con datos y especificaciones específicas asignadas en memoria.");
    }
}