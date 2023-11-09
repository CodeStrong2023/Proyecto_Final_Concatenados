// Definimos una clase Usuario, para manejar usuarios y contraseñas ademas de niveles de acceso.
package ingresar;

import java.util.ArrayList;

public class Usuario {

    // Sus atributos serán usuario y pass
    private String usuario;
    private String pass;

    // Método Constructor
    public Usuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    // Getters and Setters
    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private void setPass(String pass) {
        this.pass = pass;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public String getPass() {
        return this.pass;
    } 
}
