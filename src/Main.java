import gestion.GestionClientes;
import java.util.Scanner;
import modelos.Cliente;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    GestionClientes gestion =
            new GestionClientes();
            int opcion;

do {

    System.out.println(
            "\n===== MENU ====="
    );

    System.out.println(
            "1. Registrar cliente"
    );

    System.out.println(
            "2. Listar clientes"
    );

    System.out.println(
            "3. Buscar cliente"
    );

    System.out.println(
            "4. Eliminar cliente"
    );

    System.out.println(
        "5. Modificar telefono"
    );
    System.out.println(
            "6. Salir"
    );

    System.out.print(
            "Seleccione una opcion: "
    );

    opcion = sc.nextInt();
    sc.nextLine();

    switch (opcion) {

        case 1:

            System.out.print(
                    "Cedula: "
            );
            String cedula =
                    sc.nextLine();

            System.out.print(
                    "Nombre: "
            );
            String nombre =
                    sc.nextLine();

            System.out.print(
                    "Apellido: "
            );
            String apellido =
                    sc.nextLine();

            System.out.print(
                    "Telefono: "
            );
            String telefono =
                    sc.nextLine();

            System.out.print(
                    "Direccion: "
            );
            String direccion =
                    sc.nextLine();

            System.out.print(
                    "Licencia: "
            );
            String licencia =
                    sc.nextLine();

            Cliente nuevo =
                    new Cliente(
                            cedula,
                            nombre,
                            apellido,
                            telefono,
                            direccion,
                            licencia
                    );

            gestion.registrarCliente(
                    nuevo
            );

            break;

        case 2:

            gestion.listarClientes();

            break;

        case 3:

            System.out.print(
                    "Ingrese cedula: "
            );

            String buscar =
                    sc.nextLine();

            Cliente encontrado =
                    gestion.buscarCliente(
                            buscar
                    );

            if (encontrado != null) {

                System.out.println(
                        encontrado
                );

            } else {

                System.out.println(
                        "Cliente no encontrado."
                );

            }

            break;

        case 4:

            System.out.print(
                    "Cedula a eliminar: "
            );

            String eliminar =
                    sc.nextLine();

            boolean eliminado =
                    gestion.eliminarCliente(
                            eliminar
                    );

            if (eliminado) {

                System.out.println(
                        "Cliente eliminado."
                );

            } else {

                System.out.println(
                        "Cliente no encontrado."
                );

            }

            break;

            case 5:

    System.out.print(
            "Cedula del cliente: "
    );

    String cedulaModificar =
            sc.nextLine();

    System.out.print(
            "Nuevo telefono: "
    );

    String nuevoTelefono =
            sc.nextLine();

    boolean modificado =
            gestion.modificarTelefono(
                    cedulaModificar,
                    nuevoTelefono
            );

    if (modificado) {

        System.out.println(
                "Telefono actualizado."
        );

    } else {

        System.out.println(
                "Cliente no encontrado."
        );

    }

    break;

        case 6:

            System.out.println(
                    "Saliendo del sistema..."
            );

            break;

        default:

            System.out.println(
                    "Opcion invalida."
            );

    }

} while (opcion != 6);
    }
    }