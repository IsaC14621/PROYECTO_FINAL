import gestion.GestionClientes;
import java.util.Scanner;
import modelos.Cliente;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    GestionClientes gestion =
            new GestionClientes();

    System.out.println("=== REGISTRO DE CLIENTE ===");

    System.out.print("Ingrese cedula: ");
    String cedula = sc.nextLine();

    System.out.print("Ingrese nombre: ");
    String nombre = sc.nextLine();

    System.out.print("Ingrese apellido: ");
    String apellido = sc.nextLine();

    System.out.print("Ingrese telefono: ");
    String telefono = sc.nextLine();

    System.out.print("Ingrese direccion: ");
    String direccion = sc.nextLine();

    System.out.print("Ingrese licencia: ");
    String licencia = sc.nextLine();

    Cliente cliente = new Cliente(
            cedula,
            nombre,
            apellido,
            telefono,
            direccion,
            licencia
    );

    gestion.registrarCliente(cliente);

    System.out.println("\nLISTA DE CLIENTES:");

    gestion.listarClientes();

}

}

