package gestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Cliente;
import modelos.ContratoRenting;
import modelos.Vehiculo;

public class GestionContratos {
     private ArrayList<ContratoRenting>
            listaContratos;

            private final String ARCHIVO =
        "contratos.txt";

        private int contadorContratos = 1;
    public GestionContratos() {

        listaContratos =
                new ArrayList<>();

                cargarContratosTXT();
    }

    public boolean registrarContrato(
            ContratoRenting contrato
    ) {

        for (
                ContratoRenting c
                : listaContratos
        ) {

            if (
                    c.getCliente()
                            .getCedula()
                            .equals(
                                    contrato
                                            .getCliente()
                                            .getCedula()
                            )
                    &&
                    c.getEstadoContrato()
                            .equals(
                                    "ACTIVO"
                            )
            ) {

                return false;

            }

        }

        listaContratos.add(
                contrato
        );
        guardarContratoTXT(contrato);
        return true;

    }
    public void guardarContratoTXT(
        ContratoRenting contrato
) {

    try {

        FileWriter escritor =
                new FileWriter(
                        ARCHIVO,
                        true
                );

        escritor.write(
                contrato.getIdContrato()
                + ","
                + contrato.getCliente().getCedula()
                + ","
                + contrato.getVehiculo().getPlaca()
                + ","
                + contrato.getCantidadDias()
                + ","
                + contrato.getTotalPagar()
                + ","
                + contrato.getEstadoContrato()
                + "\n"
        );

        escritor.close();

    } catch (IOException e) {

        System.out.println(
                "Error guardando contrato."
        );

    }

}
public void cargarContratosTXT() {

    listaContratos.clear();

    try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {

        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split(",");

            int id = Integer.parseInt(datos[0]);
            String cedula = datos[1];
            String placa = datos[2];
            int dias = Integer.parseInt(datos[3]);
            float total = Float.parseFloat(datos[4]);
            String estado = datos[5];

            Cliente cliente = new Cliente();
            cliente.setCedula(cedula);

            Vehiculo vehiculo = new Vehiculo();
            vehiculo.setPlaca(placa);

            ContratoRenting contrato = new ContratoRenting(
                    id,
                    cliente,
                    vehiculo,
                    dias,
                    total,
                    estado
            );

            listaContratos.add(contrato);
        }

        System.out.println("Contratos cargados correctamente.");

    } catch (IOException e) {
        System.out.println("Error cargando contratos: " + e.getMessage());
    }
}

   public void informeGeneral() {

    float ingresos = 0;

    System.out.println(
            "\nCONTRATOS ACTIVOS:"
    );

    for (
            ContratoRenting contrato
            : listaContratos
    ) {

        if (
                contrato
                        .getEstadoContrato()
                        .equalsIgnoreCase(
                                "ACTIVO"
                        )
        ) {

            System.out.println(
                    contrato
            );

        }

    }

    System.out.println(
            "\nCONTRATOS FINALIZADOS:"
    );

    for (
            ContratoRenting contrato
            : listaContratos
    ) {

        if (
                contrato
                        .getEstadoContrato()
                        .equalsIgnoreCase(
                                "FINALIZADO"
                        )
        ) {

            System.out.println(
                    contrato
            );

        }

        ingresos +=
                contrato.getTotalPagar();

    }

    System.out.println(
            "\nTOTAL INGRESOS: "
            + ingresos
    );

}

public void finalizarContrato(String placa) {

    for (ContratoRenting contrato : listaContratos) {

        if (contrato.getVehiculo().getPlaca().equalsIgnoreCase(placa)
                && contrato.getEstadoContrato().equals("ACTIVO")) {

            contrato.setEstadoContrato("FINALIZADO");

        }
    }

    actualizarArchivo(); 
}
public void imprimir(
        Cliente cliente
) {

    System.out.println(
            cliente
    );

}

public void imprimir(
        Vehiculo vehiculo
) {

    System.out.println(
            vehiculo
    );

}

public void imprimir(
        ContratoRenting contrato
) {

    System.out.println(
            contrato
    );

}

public void eliminarContratosCliente(
        String cedula
) {

    listaContratos.removeIf(
            contrato ->
                    contrato.getCliente()
                            .getCedula()
                            .equalsIgnoreCase(
                                    cedula
                            )
    );

}

public int generarId() {

    return contadorContratos++;

}

public void actualizarArchivo() {

    try (FileWriter escritor = new FileWriter(ARCHIVO, false)) {

        for (ContratoRenting contrato : listaContratos) {

            escritor.write(
                    contrato.getIdContrato() + "," +
                    contrato.getCliente().getCedula() + "," +
                    contrato.getVehiculo().getPlaca() + "," +
                    contrato.getCantidadDias() + "," +
                    contrato.getTotalPagar() + "," +
                    contrato.getEstadoContrato() + "\n"
            );
        }

    } catch (IOException e) {
        System.out.println("Error actualizando archivo: " + e.getMessage());
    }
}
public void listarContratos() {

    System.out.println("\nCONTRATOS:");

    for (ContratoRenting contrato : listaContratos) {
        System.out.println(contrato);
    }
}
}

