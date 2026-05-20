package modelos;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected int modelo;
    protected double precioPorDia;

    public Vehiculo() {

    }

    public Vehiculo(
            String placa,
            String marca,
            int modelo,
            double precioPorDia
    ) {

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precioPorDia = precioPorDia;

    }

    public String getPlaca() {
        return placa;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(
            double precioPorDia
    ) {

        this.precioPorDia = precioPorDia;

    }

    @Override
    public String toString() {

        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", precioPorDia=" + precioPorDia +
                '}';

    }

}
