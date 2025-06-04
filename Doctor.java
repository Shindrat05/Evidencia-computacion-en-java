public class Doctor {
    private String id;
    private String nombre;
    private String especialidad;

    public Doctor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public String toString() {
        return "Doctor: " + nombre + " (ID: " + id + ", Especialidad: " + especialidad + ")";
    }
}
