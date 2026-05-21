package gestion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import modelos.Vehiculo;

public class GestionVehiculos {

    private ArrayList<Vehiculo>
            listaVehiculos;

            private final String ARCHIVO =
        "vehiculos.txt";
        
    public GestionVehiculos() {

        listaVehiculos =
                new ArrayList<>();

                cargarVehiculosTXT();

    }

    public void registrarVehiculo(
            Vehiculo vehiculo
    ) 
    {
        

        listaVehiculos.add(
                vehiculo
                
        );

        guardarVehiculoTXT(
        vehiculo
);
        System.out.println(
                "Vehiculo registrado correctamente."
        );

    }
    

    public void listarVehiculos() {

        System.out.println(
                "\nLISTA DE VEHICULOS:"
        );

        for (Vehiculo vehiculo
                : listaVehiculos) {

            System.out.println(
                    vehiculo
            );

        }

    }

    public Vehiculo buscarVehiculo(
            String placa
    ) {

        for (Vehiculo vehiculo
                : listaVehiculos) {

            if (vehiculo.getPlaca()
                    .equals(placa)) {

                return vehiculo;

            }

        }

        return null;

    }
    public boolean alquilarVehiculo(
        String placa
) {

    Vehiculo vehiculo =
            buscarVehiculo(
                    placa
            );

    if (vehiculo != null
            && vehiculo.isDisponible()) {

        vehiculo.setDisponible(
                false
        );

        return true;

    }

    return false;

}
public boolean devolverVehiculo(
        String placa
) {

    Vehiculo vehiculo =
            buscarVehiculo(
                    placa
            );

    if (vehiculo != null
            && !vehiculo.isDisponible()) {

        vehiculo.setDisponible(
                true
        );

        return true;

    }

    return false;

}
    public boolean eliminarVehiculo(
            String placa
    ) {

        Vehiculo vehiculoEliminar =
                buscarVehiculo(
                        placa
                );

        if (vehiculoEliminar != null) {

            listaVehiculos.remove(
                    vehiculoEliminar
            );

            return true;

        }

        return false;

    }
    public void guardarVehiculoTXT(
        Vehiculo vehiculo
) {

    try {

        FileWriter escritor =
                new FileWriter(
                        ARCHIVO,
                        true
                );

        escritor.write(
                vehiculo.getPlaca()
                + ","
                + vehiculo.getMarca()
                + ","
                + vehiculo.getModelo()
                + ","
                + vehiculo.getPrecioPorDia()
                + ","
                + vehiculo.isDisponible()
                + "\n"
        );

        escritor.close();

    } catch (
            IOException e
    ) {

        System.out.println(
                "Error guardando vehiculo."
        );

    }

}
public void cargarVehiculosTXT() {

    try {

        BufferedReader lector =
                new BufferedReader(
                        new FileReader(
                                ARCHIVO
                        )
                );

        String linea;

        while ((linea = lector.readLine())
                != null) {

            String[] datos =
                    linea.split(",");

            String placa =
                    datos[0];

            String marca =
                    datos[1];

            int modelo =
                    Integer.parseInt(
                            datos[2]
                    );

            double precioPorDia =
                    Double.parseDouble(
                            datos[3]
                    );

            boolean disponible =
                    Boolean.parseBoolean(
                            datos[4]
                    );

            Vehiculo vehiculo =
                    new Vehiculo(
                            placa,
                            marca,
                            modelo,
                            precioPorDia
                    );

            vehiculo.setDisponible(
                    disponible
            );

            listaVehiculos.add(
                    vehiculo
            );

        }

        lector.close();

    } catch (
            IOException e
    ) {

        System.out.println(
                "Archivo de vehiculos no encontrado."
        );

    }

}
}