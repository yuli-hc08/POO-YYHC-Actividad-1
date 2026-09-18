package Ejercicio63;

public class Hospital {
    // Atributos
    public String nombre;
    public String ciudad;
    public int camasDisponibles;

    // Constructor
    public Hospital(String nombre, String ciudad, int camasDisponibles) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.camasDisponibles = camasDisponibles;
    }

    // Métodos
    public void ingresarPaciente() {
        if (camasDisponibles > 0) {
            camasDisponibles--;
            System.out.println("Paciente ingresado en " + nombre + ". Camas restantes: " + camasDisponibles);
        } else {
            System.out.println("No hay camas disponibles en " + nombre);
        }
    }

    public void mostrarInformacion() {
        System.out.println("Hospital: " + nombre + " | Ciudad: " + ciudad + " | Camas Disponibles: " + camasDisponibles);
    }
}