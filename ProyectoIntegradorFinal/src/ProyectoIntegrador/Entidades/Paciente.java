
package ProyectoIntegrador.Entidades;

import java.util.ArrayList;

public class Paciente{
    private String nombre;
    private String apellido;
    private int dni;
    private int fechaNacimiento;
    private String tipoSangre;
    private ArrayList<String> especialidad; 
    
//Constructor
    public Paciente(String nombre, String apellido, int dni, int fechaNacimiento, String tipoSangre, ArrayList<String> especialidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.especialidad = especialidad;
    }
    
//Get-Set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public ArrayList<String> getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(ArrayList<String> especialidad) {
        this.especialidad = especialidad;
    }
    
//Funciones
    public void agregarEspecialidad(String nuevaEspecialidad){
        this.especialidad.add(nuevaEspecialidad);
    }
    
}
