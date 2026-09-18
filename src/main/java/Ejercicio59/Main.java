package Ejercicio59;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== EJERCICIO 59: USUARIO DEL SISTEMA ===\n");

        UsuarioSistema usuario = new UsuarioSistema("admin_root", "12345Pass");

        System.out.println("--- ESTADO INICIAL ---");
        usuario.mostrarEstado();

        System.out.println("\n--- ACTIVACIÓN ---");
        usuario.activar();
        usuario.mostrarEstado();

        System.out.println("\n--- DESACTIVACIÓN ---");
        usuario.desactivar();
        usuario.mostrarEstado();
    }
}