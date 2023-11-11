package ingresar;

/**
 * 
 * Entidad que representa la abstraccion del usuario. 
 * 
 * @author Concatenados
 * 
 */

public class Usuario {

    private String usuario;
    private String pass;

    /**
     * Constructor de la clase Usuario.
     * @param usuario El nombre de usuario.
     * @param pass    La contraseña del usuario.
     */
    
    public Usuario(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }

    private void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    private void setPass(String pass) {
        this.pass = pass;
    }

    private String getUsuario() {
        return usuario;
    }

    private String getPass() {
        return pass;
    }
    
    Usuario admin = new Usuario("admin", "admin");
}
