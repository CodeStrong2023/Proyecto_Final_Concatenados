// Aquí definimos la clase Main, desde aquí se ejecutara el programa principal
package ingresar;

// Importamos todos los paquetes necesarios
import ingresar.Paciente;
import ingresar.RegistroPacientes;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


// Definimos la clase main   

public class Hospital {
    
    public static void main(String[] args) {
        // Invocamos una ventana ejecutable que llama al JFrame Login
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        
    }
}


