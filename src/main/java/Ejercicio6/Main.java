package Ejercicio6;

import Ejercicio1.Estudiante;

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();
        estudiante1.nombre = "Carlos Gómez";
        estudiante1.codigo = "EST-2026-01";
        estudiante1.semestre = 3;

        estudiante1.mostrarInfo();
    }
}