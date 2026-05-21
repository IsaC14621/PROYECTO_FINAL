package modelos;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto() {

    }

    public Moto( String placa,  String marca,int modelo,double precioPorDia,int cilindraje ) {

        super(placa,marca, modelo, precioPorDia);

        this.cilindraje =
                cilindraje;

    }

    public int getCilindraje() {

        return cilindraje;

    }

    public void setCilindraje(
            int cilindraje
    ) {

        this.cilindraje =
                cilindraje;

    }

    @Override
    public String toString() {

        return "Moto{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioPorDia=" + precioPorDia +
                ", cilindraje=" + cilindraje +
                '}';

    }

}