
package ingresar;

/**
 * 
 * Seccion encargada de ejecutar el programa.
 * 
 * @author Concatenados
 * 
 */
   
public class Hospital {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
}
