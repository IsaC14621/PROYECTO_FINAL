import gestion.GestionClientes;
import gestion.GestionVehiculos;
import java.util.Scanner;
import modelos.Carro;
import modelos.Cliente;
import modelos.ContratoRenting;
import modelos.Vehiculo;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    GestionClientes gestion =
            new GestionClientes();
            int opcion;

    GestionVehiculos gestionVehiculos = new GestionVehiculos();
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
            "6. Registrar vehiculo"
    );

    System.out.println(
            "7. Listar vehiculos"
    );

    System.out.println(
            "8. Alquilar vehiculos"
    );

    System.out.println(
            "9. Devolver vehiculo"
    );

    System.out.println(
            "10. Crear contrato"
    );

    System.out.println(
            "11. Salir"
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

    System.out.print(
            "Placa: "
    );

    String placa =
            sc.nextLine();

    System.out.print(
            "Marca: "
    );

    String marca =
            sc.nextLine();

    System.out.print(
            "Modelo: "
    );

    int modelo;

while (true) {

    try {
        modelo =
                Integer.parseInt(
                        sc.nextLine()
                );

        break;

    } catch (
            NumberFormatException e
    ) {

        System.out.println(
                "Ingrese un numero valido."
        );

    }
}
    System.out.print(
            "Precio por dia: "
    );
    System.out.print(
        "Numero de puertas: "
);

    double precioPorDia =
            sc.nextDouble();

    sc.nextLine();

    int numeroPuertas =
        sc.nextInt();
sc.nextLine();

    Carro carro = new Carro( placa, marca, modelo,  precioPorDia, numeroPuertas );

    gestionVehiculos
            .registrarVehiculo(
                    carro
            );

    break;



case 7:

    gestionVehiculos
            .listarVehiculos();

    break;
case 8:

    System.out.print(
            "Placa del vehiculo: "
    );

    String placaAlquilar =
            sc.nextLine();

    boolean alquilado =
            gestionVehiculos
                    .alquilarVehiculo(
                            placaAlquilar
                    );

    if (alquilado) {

        System.out.println(
                "Vehiculo alquilado."
        );

    } else {

        System.out.println(
                "Vehiculo no disponible."
        );

    }

    break;

    case 9:

    System.out.print(
            "Placa del vehiculo: "
    );

    String placaDevolver =
            sc.nextLine();

    boolean devuelto =
            gestionVehiculos
                    .devolverVehiculo(
                            placaDevolver
                    );

    if (devuelto) {

        System.out.println(
                "Vehiculo devuelto."
        );

    } else {

        System.out.println(
                "No se pudo devolver."
        );

    }

    break;

    case 10:

    System.out.print(
            "Cedula del cliente: "
    );

    String cedulaContrato =
            sc.nextLine();

    Cliente cliente =
            gestion.buscarCliente(
                    cedulaContrato
            );

    System.out.print(
            "Placa del vehiculo: "
    );

    String placaContrato =
            sc.nextLine();

    Vehiculo vehiculo =
            gestionVehiculos.buscarVehiculo(
                    placaContrato
            );

    System.out.print(
            "Dias de alquiler: "
    );

    int dias =
            sc.nextInt();

    sc.nextLine();

    if (cliente != null
            && vehiculo != null
            && vehiculo.isDisponible()) {

       float totalPagar =
        (float)
        (dias *
        vehiculo.getPrecioPorDia());

ContratoRenting contrato =
        new ContratoRenting(
                1,
                cliente,
                vehiculo,
                dias,
                totalPagar,
                "ACTIVO"
        );
        vehiculo.setDisponible(
                false
        );

        System.out.println(
                contrato
        );

    } else {

        System.out.println(
                "No se pudo crear el contrato."
        );

    }

    break;
        case 11:

            System.out.println(
                    "Saliendo del sistema..."
            );

            break;

        default:

            System.out.println(
                    "Opcion invalida."
            );

    }

} while (opcion != 11);
    }
    }