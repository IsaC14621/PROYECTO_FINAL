package modelos;

public class Camioneta extends Vehiculo {

    private double capacidadCarga;

    public Camioneta() {

    }

    public Camioneta(String placa,String marca,int modelo,double precioPorDia, double capacidadCarga) {

        super( placa, marca,modelo,precioPorDia);

        this.capacidadCarga =
                capacidadCarga;

    }

    public double getCapacidadCarga() {

        return capacidadCarga;

    }

    public void setCapacidadCarga(
            double capacidadCarga
    ) {

        this.capacidadCarga =
                capacidadCarga;

    }

    @Override
    public String toString() {

        return "Camioneta{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioPorDia=" + precioPorDia +
                ", capacidadCarga=" + capacidadCarga +
                '}';

    }

}