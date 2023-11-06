
package ProyectoIntegrador;

import ProyectoIntegrador.Entidades.Paciente;
import java.util.ArrayList;
import java.util.List;

public class ClinicaMedica {
    private List<Medico> medicos;
    private List<Paciente> pacientes;

    public ClinicaMedica() {
        medicos = new ArrayList<>();
        pacientes = new ArrayList<>();
    }

    public void agregarMedico(Medico medico) {
        medicos.add(medico);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public boolean verificarCredencialesUsuarioMedico(String nombreDeUsuario, String contraseña) {
        for (Medico medico : medicos) {
            if (medico.getNombreDeUsuario().equals(nombreDeUsuario) && medico.verificarContraseña(contraseña)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarCredencialesUsuarioPaciente(String nombreDeUsuario) {
        for (Paciente paciente : pacientes) {
            if (paciente.getNombreDeUsuario().equals(nombreDeUsuario)) {
                return true;
            }
        }
        return false;
    }

    public void menuUsuarioMedico() {
        // Código para el menú de opciones del usuario médico
    }

    public void menuUsuarioPaciente() {
        // Código para el menú de opciones del usuario paciente
    }
}