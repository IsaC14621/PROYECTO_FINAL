package gestion;

import java.util.ArrayList;
import modelos.Cliente;

public class GestionClientes {

    private ArrayList<Cliente> listaClientes;
    private ArchivoClientes archivo = new ArchivoClientes();
    
    // Constructor
    public GestionClientes() {

        listaClientes = archivo.cargarClientesTXT();
    }
public boolean registrarCliente(
        Cliente cliente
) {

    if (
            buscarCliente(
                    cliente.getCedula().trim()
            ) != null
    ) {

        return false;

    }

    listaClientes.add(
            cliente
    );

    return true;

}
public void listarClientes() {

    if (listaClientes.isEmpty()) {

        System.out.println("No hay clientes registrados.");

    } else {

        for (Cliente cliente : listaClientes) {

            System.out.println(cliente);

        }

    }

}
public Cliente buscarCliente(String cedula) {

    for (Cliente cliente : listaClientes) {

        if (cliente.getCedula().trim().equals(cedula.trim())) {

            return cliente;

        }

    }

    return null;

}

public boolean eliminarCliente(String cedula) {

    Cliente clienteEliminar =
            buscarCliente(cedula);

    if (clienteEliminar != null) {

        listaClientes.remove(clienteEliminar);
        archivo.reescribirTXT(listaClientes);
        return true;

    }

    return false;

}
public boolean modificarTelefono(
        String cedula,
        String nuevoTelefono
) {

    Cliente cliente =
            buscarCliente(cedula);

    if (cliente != null) {

        cliente.setTelefono(
                nuevoTelefono
        );

        archivo.reescribirTXT(
                listaClientes
        );

        return true;

    }

    return false;

}
public boolean modificarTelefonoCliente(String cedula,
                                        String nuevoTelefono) {

    Cliente cliente =
            buscarCliente(cedula);

    if (cliente != null) {

        cliente.setTelefono(nuevoTelefono);

        return true;

    }

    return false;

}
}

