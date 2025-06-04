import java.util.*;

public class SistemaCitas {
    private List<Doctor> doctores = new ArrayList<>();
    private List<Paciente> pacientes = new ArrayList<>();
    private List<Cita> citas = new ArrayList<>();

    public void agregarDoctor(Doctor doctor) {
        doctores.add(doctor);
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    public void crearCita(Cita cita) {
        citas.add(cita);
    }

    public Doctor buscarDoctorPorId(String id) {
        for (Doctor d : doctores) {
            if (d.getId().equals(id)) return d;
        }
        return null;
    }

    public Paciente buscarPacientePorId(String id) {
        for (Paciente p : pacientes) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public void listarCitas() {
        for (Cita c : citas) {
            System.out.println("\n" + c);
        }
    }
}
