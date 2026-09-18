package Ejercicio69;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 69: INSTANCIACIÓN MULTIPLE DE OBJETOS ===\n");

        // 1. Cinco objetos de EstudianteSoftware
        System.out.println("--- 5 ESTUDIANTES DE SOFTWARE ---");
        EstudianteSoftware est1 = new EstudianteSoftware("Carlos Pérez", "20261001", 3, 45);
        EstudianteSoftware est2 = new EstudianteSoftware("Ana Gómez", "20261002", 1, 15);
        EstudianteSoftware est3 = new EstudianteSoftware("Luis Martínez", "20261003", 5, 80);
        EstudianteSoftware est4 = new EstudianteSoftware("María Rodríguez", "20261004", 2, 30);
        EstudianteSoftware est5 = new EstudianteSoftware("Jorge Hernández", "20261005", 4, 60);

        est1.mostrarInformacion();
        est2.mostrarInformacion();
        est3.mostrarInformacion();
        est4.mostrarInformacion();
        est5.mostrarInformacion();

        // 2. Cinco objetos de HabitoDiario
        System.out.println("\n--- 5 HÁBITOS DIARIOS ---");
        HabitoDiario hab1 = new HabitoDiario("Hacer ejercicio", 45);
        HabitoDiario hab2 = new HabitoDiario("Leer un libro", 30);
        HabitoDiario hab3 = new HabitoDiario("Practicar Java", 60);
        HabitoDiario hab4 = new HabitoDiario("Meditar", 15);
        HabitoDiario hab5 = new HabitoDiario("Estudiar inglés", 40);

        hab1.mostrarInformacion();
        hab2.mostrarInformacion();
        hab3.mostrarInformacion();
        hab4.mostrarInformacion();
        hab5.mostrarInformacion();

        // 3. Cinco objetos de ServicioLavadero
        System.out.println("\n--- 5 SERVICIOS DE LAVADERO ---");
        ServicioLavadero lav1 = new ServicioLavadero("ABC-123", "Camioneta", "Lavado General", 45000.0);
        ServicioLavadero lav2 = new ServicioLavadero("XYZ-789", "Automóvil", "Sencillo", 25000.0);
        ServicioLavadero lav3 = new ServicioLavadero("MNO-456", "Moto", "Lavado con cera", 18000.0);
        ServicioLavadero lav4 = new ServicioLavadero("JKL-321", "Camioneta", "Polichado", 80000.0);
        ServicioLavadero lav5 = new ServicioLavadero("DEF-654", "Automóvil", "General y Chasis", 50000.0);

        lav1.mostrarInformacion();
        lav2.mostrarInformacion();
        lav3.mostrarInformacion();
        lav4.mostrarInformacion();
        lav5.mostrarInformacion();
    }
}