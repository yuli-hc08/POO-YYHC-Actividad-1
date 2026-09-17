package Ejercicio44;

public class Main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("Carlos Ruíz", 45, "Hipertensión");
        paciente1.mostrarFicha();

        System.out.println("\n--- Explicación ---");
        System.out.println("'Crear un paciente' representa una idea del dominio o mundo real (pensar en la persona y sus datos clínicos que ingresan al sistema). 'Instanciar la clase Paciente' es la acción técnica concreta en programación donde reservamos memoria en la máquina usando la palabra clave 'new'. Aunque están ligadas, una es la representación conceptual del problema y la otra es la instrucción técnica en Java.");
    }
}