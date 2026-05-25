package modelos;

public class Vehiculo {
    protected String placa;
    protected String marca;
    protected int modelo;
    protected double precioPorDia;
    protected boolean disponible;

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
        this.disponible = true;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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

    public boolean isDisponible() {

    return disponible;

}

public void setDisponible(
        boolean disponible
) {

    this.disponible =
            disponible;

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
            ", estado='" +
            (
                    disponible
                    ? "Disponible"
                    : "Alquilado"
            ) +
            '\'' +
            '}';

}
}
