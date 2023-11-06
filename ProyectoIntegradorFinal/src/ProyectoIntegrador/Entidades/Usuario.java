
package ProyectoIntegrador.Entidades;

//Administrador que se encargara de la carga de pacientes

public class Usuario {
    private final int contraseña;

//Constructor
    public Usuario() {
        this.contraseña = 1234;
        //La contraseña va a ser dada por el Hospital
    }

//Funcion
    public boolean verificarContraseña(int contraseña) {
        return this.contraseña == contraseña;
    }

}
