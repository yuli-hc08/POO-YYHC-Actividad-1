package Ejercicio69;

public class EstudianteSoftware {
    public String nombre;
    public String codigo;
    public int semestre;
    public int creditosAprobados;

    public EstudianteSoftware(String nombre, String codigo, int semestre, int creditosAprobados) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.semestre = semestre;
        this.creditosAprobados = creditosAprobados;
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre + " | Créditos: " + creditosAprobados);
    }
}