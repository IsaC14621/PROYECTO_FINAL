package modelos;

public class Carro extends Vehiculo {

    private int numeroPuertas;

    public Carro() {

    }

    public Carro(
            String placa,
            String marca,
            int modelo,
            double precioPorDia,
            int numeroPuertas
    ) {

        super( placa, marca, modelo,precioPorDia );

        this.numeroPuertas =
                numeroPuertas;

    }

    public int getNumeroPuertas() {

        return numeroPuertas;

    }

    public void setNumeroPuertas(
            int numeroPuertas
    ) {

        this.numeroPuertas =
                numeroPuertas;

    }

    @Override
    public String toString() {

        return "Carro{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioPorDia=" + precioPorDia +
                ", numeroPuertas=" + numeroPuertas +
                '}';

    }

}