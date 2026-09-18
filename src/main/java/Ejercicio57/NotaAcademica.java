package Ejercicio57;

public class NotaAcademica {
    public String asignatura;
    public double nota1;
    public double nota2;
    public double nota3;

    public NotaAcademica(String asignatura, double nota1, double nota2, double nota3) {
        this.asignatura = asignatura;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public double calcularDefinitiva() {
        return (nota1 + nota2 + nota3) / 3.0;
    }

    public void mostrarReporte() {
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Nota 1: " + nota1 + " | Nota 2: " + nota2 + " | Nota 3: " + nota3);
        System.out.printf("Nota Definitiva: %.2f%n", calcularDefinitiva());
    }
}