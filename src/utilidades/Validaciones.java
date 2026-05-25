package utilidades;

import java.util.Scanner;

public class Validaciones {

    public static String validarCedula(
            Scanner sc
    ) {

        String cedula
                = sc.nextLine();

        if (cedula.matches(
                "[0-9]+"
        )) {

            return cedula;

        }

        System.out.println(
                "Cedula invalida. Ingrese solo numeros:"
        );

        return validarCedula(
                sc
        );

    }

}
