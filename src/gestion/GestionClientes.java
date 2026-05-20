package gestion;

import java.util.ArrayList;
import modelos.Cliente;

public class GestionClientes {

    private ArrayList<Cliente> listaClientes;

    // Constructor
    public GestionClientes() {

        listaClientes = new ArrayList<>();

    }
public void registrarCliente(Cliente cliente) {

    listaClientes.add(cliente);

    System.out.println("Cliente registrado correctamente.");

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
public Cliente buscarClientePorCedula(String cedula) {

    for (Cliente cliente : listaClientes) {

        if (cliente.getCedula().equals(cedula)) {

            return cliente;

        }

    }

    return null;

}
public boolean existeCliente(String cedula) {

    for (Cliente cliente : listaClientes) {

        if (cliente.getCedula().equals(cedula)) {

            return true;

        }

    }

    return false;

}
public boolean eliminarCliente(String cedula) {

    Cliente clienteEliminar =
            buscarClientePorCedula(cedula);

    if (clienteEliminar != null) {

        listaClientes.remove(clienteEliminar);

        return true;

    }

    return false;


}
public boolean modificarTelefonoCliente(String cedula,
                                        String nuevoTelefono) {

    Cliente cliente =
            buscarClientePorCedula(cedula);

    if (cliente != null) {

        cliente.setTelefono(nuevoTelefono);

        return true;

    }

    return false;

}
}

