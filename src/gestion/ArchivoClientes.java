package gestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Cliente;

public class ArchivoClientes {
    public void guardarClienteTXT(Cliente cliente) {
        try {

            FileWriter escritor =
                    new FileWriter("clientes.txt", true);

            escritor.write(
                    cliente.getCedula() + "," +
                    cliente.getNombre() + "," +
                    cliente.getApellido() + "," +
                    cliente.getTelefono() + "," +
                    cliente.getDireccion() + "," +
                    cliente.getLicenciaConduccion() +
                    "\n"
            );

            escritor.close();

            System.out.println("Cliente guardado en TXT.");

        } catch (IOException e) {

            System.out.println(
                    "Error al guardar archivo."
            );

        }

    }
    public void reescribirTXT(
        ArrayList<Cliente> listaClientes
) {

    try {

        FileWriter escritor =
                new FileWriter(
                        "clientes.txt"
                );

        for (Cliente cliente : listaClientes) {

            escritor.write(
                    cliente.getCedula() + "," +
                    cliente.getNombre() + "," +
                    cliente.getApellido() + "," +
                    cliente.getTelefono() + "," +
                    cliente.getDireccion() + "," +
                    cliente.getLicenciaConduccion() +
                    "\n"
            );

        }
        

        escritor.close();

        System.out.println(
                "TXT actualizado correctamente."
        );

    } catch (IOException e) {

        System.out.println(
                "Error al actualizar TXT."
        );

    }

}
    public ArrayList<Cliente> cargarClientesTXT() {

    ArrayList<Cliente> lista =
            new ArrayList<>();

    try {

        BufferedReader lector =
                new BufferedReader(
                        new FileReader("clientes.txt")
                );

        String linea;

        while ((linea = lector.readLine()) != null) {

            String[] datos = linea.split(",");

            Cliente cliente = new Cliente(
                    datos[0],
                    datos[1],
                    datos[2],
                    datos[3],
                    datos[4],
                    datos[5]
            );

            lista.add(cliente);

        }

        lector.close();

    } catch (Exception e) {

        System.out.println(
                "Error cargando clientes."
        );

    }

    return lista;

}

}

