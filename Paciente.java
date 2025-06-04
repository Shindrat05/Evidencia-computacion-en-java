public class Paciente {
    private String id;
    private String nombre;

    public Paciente(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() { return id; }

    @Override
    public String toString() {
        return "Paciente: " + nombre + " (ID: " + id + ")";
    }
}
