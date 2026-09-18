package Ejercicio59;

public class UsuarioSistema {
    public String nombreUsuario;
    public String clave;
    public boolean activo;

    public UsuarioSistema(String nombreUsuario, String clave) {
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.activo = false; // Inicia desactivado por defecto
    }

    public void activar() {
        this.activo = true;
        System.out.println("El usuario " + nombreUsuario + " ha sido activado.");
    }

    public void desactivar() {
        this.activo = false;
        System.out.println("El usuario " + nombreUsuario + " ha sido desactivado.");
    }

    public void mostrarEstado() {
        System.out.println("Usuario: " + nombreUsuario + " | ¿Activo?: " + activo);
    }
}