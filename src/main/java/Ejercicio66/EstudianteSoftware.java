package Ejercicio66;

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

    public void aprobarMateria(int creditosMateria) {
        this.creditosAprobados += creditosMateria;
        System.out.println(nombre + " aprobó una materia de " + creditosMateria + " créditos. Total créditos acumulados: " + creditosAprobados);
    }

    public void mostrarInformacion() {
        System.out.println("Estudiante: " + nombre + " | Código: " + codigo + " | Semestre: " + semestre + " | Créditos: " + creditosAprobados);
    }
}