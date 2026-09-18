package Ejercicio65;

public class EquipoDeFutbol {
    // Atributos
    public String nombre;
    public String ciudad;
    public int puntos;

    // Constructor
    public EquipoDeFutbol(String nombre, String ciudad, int puntosIniciales) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.puntos = puntosIniciales;
    }

    // Métodos
    public void ganarPartido() {
        puntos += 3;
        System.out.println("¡" + nombre + " ganó el partido! Suma 3 puntos. Total acumulado: " + puntos);
    }

    public void mostrarInformacion() {
        System.out.println("Equipo: " + nombre + " | Ciudad: " + ciudad + " | Puntos: " + puntos);
    }
}