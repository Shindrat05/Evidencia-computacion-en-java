public class Cita {
    private String id;
    private String fechaHora;
    private String motivo;
    private Doctor doctor;
    private Paciente paciente;

    public Cita(String id, String fechaHora, String motivo, Doctor doctor, Paciente paciente) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.doctor = doctor;
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Cita ID: " + id + "\nFecha y Hora: " + fechaHora +
               "\nMotivo: " + motivo + "\n" + doctor + "\n" + paciente;
    }
}
