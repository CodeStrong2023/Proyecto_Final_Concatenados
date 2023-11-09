// Aquí se definira la clase Paciente 

package ingresar;

public class Paciente {
    
    // Aquí definimos los atributos de la clase Paciente, idPaciente, nombre, apellido, fechaNacimiento, dni, tipoSangre y especialidad requerida. 
    private int idPaciente;
    static int contadorPaciente;
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private String dni;
    private String tipoSangre;
    private String especialidad;
    
    
    // Creamos un constructor vacío
    Paciente() {

    }
    // Constructor
    public Paciente(int idPaciente, String tipoSangre, String especialidad, String nombre, String apellido, String dni, String fechaNacimiento) {

        
        Paciente.contadorPaciente++;
        this.idPaciente = Paciente.contadorPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.tipoSangre = tipoSangre;
        this.especialidad = especialidad;

    }
    
    // Getters and Setters
    public static int getContadorPaciente() {
        return contadorPaciente;
    }

    public static void setContadorPaciente(int aContadorPaciente) {
        contadorPaciente = aContadorPaciente;
    }
    
    public int getIdPaciente() {
        return this.idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }
    
    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTipoSangre() {
        return this.tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getEspecialidad() {
        return this.especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    // toString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("idPaciente=").append(idPaciente);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", dni=").append(dni);
        sb.append(", tipoSangre=").append(tipoSangre);
        sb.append(", especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

   


    
}
