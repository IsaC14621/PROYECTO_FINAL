import gestion.GestionClientes;
import gestion.GestionVehiculos;
import java.util.Scanner;
import modelos.Camioneta;
import modelos.Carro;
import modelos.Cliente;
import modelos.ContratoRenting;
import modelos.Moto;
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
            "8. Buscar vehiculo"
    );

    System.out.println(
            "9. Alquilar vehiculos"
    );

    System.out.println(
            "10. Devolver vehiculo"
    );

    System.out.println(
            "11. Eliminar vehiculo"
    );

    System.out.println(
            "12. Crear contrato"
    );

    System.out.println(
            "13. Salir"
    );

    System.out.print(
            "Seleccione una opcion: "
    );

   while (true) {

    if (sc.hasNextInt()) {
        opcion = sc.nextInt();
        sc.nextLine();

        if (opcion >= 1 && opcion <= 11) {
            break; // opción válida
        } else {
            System.out.println("Opcion invalida. Intente nuevamente.");
        }

    } else {
        System.out.println("Entrada no valida. Debe ingresar un numero.");
        sc.nextLine(); // limpiar entrada incorrecta
    }
}
    switch (opcion) {

        case 1:

            System.out.print(
                    "Cedula: "
            );
            String cedula =
                    sc.nextLine();
                    if (
        gestion.buscarCliente(
                cedula
        ) != null
) {

    System.out.println(
            "La cedula ya existe."
    );

    break;

}

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

            boolean clienteRegistrado =
        gestion.registrarCliente(
                nuevo
        );

if (clienteRegistrado) {

    System.out.println(
            "Cliente registrado."
    );

} else {

    System.out.println(
            "La cedula ya existe."
    );

}

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
        "Tipo de vehiculo:"
);

System.out.println(
        "1. Carro"
);

System.out.println(
        "2. Moto"
);

System.out.println(
        "3. Camioneta"
);

int tipoVehiculo =
        sc.nextInt();

sc.nextLine();

System.out.print(
        "Placa:"
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

    double precioPorDia =
            sc.nextDouble();

    sc.nextLine();

   Vehiculo vehiculo;

if (tipoVehiculo == 1) {

    System.out.print(
            "Numero de puertas: "
    );

    int numeroPuertas =
            sc.nextInt();

    sc.nextLine();

    vehiculo =
            new Carro(
                    placa,
                    marca,
                    modelo,
                    precioPorDia,
                    numeroPuertas
            );

} else if (
        tipoVehiculo == 2
) {

    System.out.print(
            "Cilindraje: "
    );

    int cilindraje =
            sc.nextInt();

    sc.nextLine();

    vehiculo =
            new Moto(
                    placa,
                    marca,
                    modelo,
                    precioPorDia,
                    cilindraje
            );

} else {

    System.out.print(
        "Capacidad de carga: "
);

double capacidadCarga =
        sc.nextDouble();

sc.nextLine();

vehiculo =
        new Camioneta(
                placa,
                marca,
                modelo,
                precioPorDia,
                capacidadCarga
        );

}

boolean registrado =
        gestionVehiculos
                .registrarVehiculo(
                        vehiculo
                );

if (registrado) {

    System.out.println(
            "Vehiculo registrado."
    );

} else {

    System.out.println(
            "La placa ya existe."
    );

}
    break;



case 7:

    gestionVehiculos
            .listarVehiculos();

    break;

    case 8:

    System.out.print(
            "Ingrese placa: "
    );

    String placaBuscar =
            sc.nextLine();

    Vehiculo vehiculoBuscado =
            gestionVehiculos
                    .buscarVehiculo(
                            placaBuscar
                    );

    if (vehiculoBuscado != null) {

        System.out.println(
                vehiculoBuscado
        );

    } else {

        System.out.println(
                "Vehiculo no encontrado."
        );

    }

    break;

case 9:

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

    case 10:

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

    case 11:

    System.out.print(
            "Placa del vehiculo: "
    );

    String placaEliminar =
            sc.nextLine();

    boolean vehiculoEliminado =
            gestionVehiculos
                    .eliminarVehiculo(
                            placaEliminar
                    );

    if (vehiculoEliminado) {

        System.out.println(
                "Vehiculo eliminado."
        );

    } else {

        System.out.println(
                "Vehiculo no encontrado."
        );

    }

    break;

    case 12:

    System.out.print(
            "Cedula del cliente: "
    );

    String cedulaContrato =
            sc.nextLine();

    Cliente cliente =
            gestion.buscarCliente(
                    cedulaContrato
            );
            if (cliente == null) {

    System.out.println(
            "Cliente no encontrado."
    );

    System.out.println(
            "Registrando nuevo cliente..."
    );

    System.out.print(
            "Nombre: "
    );

    String nombreNuevo =
            sc.nextLine();

    System.out.print(
            "Apellido: "
    );

    String apellidoNuevo =
            sc.nextLine();

    System.out.print(
            "Telefono: "
    );

    String telefonoNuevo =
            sc.nextLine();

    System.out.print(
            "Direccion: "
    );

    String direccionNueva =
            sc.nextLine();

    System.out.print(
            "Licencia: "
    );

    String licenciaNueva =
            sc.nextLine();

    cliente =
            new Cliente(
                    cedulaContrato,
                    nombreNuevo,
                    apellidoNuevo,
                    telefonoNuevo,
                    direccionNueva,
                    licenciaNueva
            );

    gestion.registrarCliente(
            cliente
    );

    System.out.println(
            "Cliente registrado correctamente."
    );

}

    Vehiculo vehiculoContrato;

while (true) {

    System.out.print(
            "Placa del vehiculo: "
    );

    String placaContrato =
            sc.nextLine();

    vehiculoContrato =
            gestionVehiculos.buscarVehiculo(
                    placaContrato
            );

    if (vehiculoContrato != null) {

        break;

    }

    System.out.println(
            "Vehiculo no encontrado."
    );

    System.out.println(
            "Ingrese una placa valida."
    );

}
        if (vehiculoContrato == null) {

    System.out.println(
            "Vehiculo no encontrado."
    );

    break;

}

    System.out.print(
            "Dias de alquiler: "
    );

    int dias =
            sc.nextInt();

    sc.nextLine();

    if ( vehiculoContrato.isDisponible()) {

       float totalPagar =
        (float)
        (dias *
        vehiculoContrato.getPrecioPorDia());

ContratoRenting contrato =
        new ContratoRenting(
                1,
                cliente,
                vehiculoContrato,
                dias,
                totalPagar,
                "ACTIVO"
        );
        vehiculoContrato.setDisponible(
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


        case 13:

            System.out.println(
                    "Saliendo del sistema..."
            );

            break;

        default:

            System.out.println(
                    "Opcion invalida."
            );

    }

} while (opcion != 13);
    }
    }