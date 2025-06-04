import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Administrador admin = new Administrador("admin", "1234");
        SistemaCitas sistema = new SistemaCitas();

        System.out.print("Usuario: ");
        String usuario = sc.nextLine();
        System.out.print("Contraseña: ");
        String contraseña = sc.nextLine();

        if (!admin.autenticar(usuario, contraseña)) {
            System.out.println("Acceso denegado.");
            return;
        }

        System.out.println("Bienvenido al Sistema de Citas.");

        while (true) {
            System.out.println("\n1. Agregar Doctor\n2. Agregar Paciente\n3. Crear Cita\n4. Ver Citas\n5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = Integer.parseInt(sc.nextLine());

            switch (opcion) {
                case 1:
                    System.out.print("ID Doctor: ");
                    String idDoc = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombreDoc = sc.nextLine();
                    System.out.print("Especialidad: ");
                    String esp = sc.nextLine();
                    sistema.agregarDoctor(new Doctor(idDoc, nombreDoc, esp));
                    break;
                case 2:
                    System.out.print("ID Paciente: ");
                    String idPac = sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombrePac = sc.nextLine();
                    sistema.agregarPaciente(new Paciente(idPac, nombrePac));
                    break;
                case 3:
                    System.out.print("ID Cita: ");
                    String idCita = sc.nextLine();
                    System.out.print("Fecha y hora: ");
                    String fecha = sc.nextLine();
                    System.out.print("Motivo: ");
                    String motivo = sc.nextLine();
                    System.out.print("ID Doctor: ");
                    Doctor d = sistema.buscarDoctorPorId(sc.nextLine());
                    System.out.print("ID Paciente: ");
                    Paciente p = sistema.buscarPacientePorId(sc.nextLine());
                    if (d != null && p != null) {
                        sistema.crearCita(new Cita(idCita, fecha, motivo, d, p));
                    } else {
                        System.out.println("Doctor o paciente no encontrados.");
                    }
                    break;
                case 4:
                    sistema.listarCitas();
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
