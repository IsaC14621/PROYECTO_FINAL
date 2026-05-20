package modelos;

public class CarroSedan extends Vehiculo {

    private String tipoCombustible;
    private String transmision;

    // Constructor vacío
    public CarroSedan() {

    }

    // Constructor lleno
    public CarroSedan(String tipoCombustible,
                      String transmision,
                      String placa,
                      String marca,
                      int modelo,
                      float precioPorDia) {

        super(placa, marca, modelo, precioPorDia);

        this.tipoCombustible = tipoCombustible;
        this.transmision = transmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public String getTransmision() {
        return transmision;
    }

    public void setTransmision(String transmision) {
        this.transmision = transmision;
    }

    @Override
    public String toString() {
        return super.toString() +
                " CarroSedan{" +
                "tipoCombustible='" + tipoCombustible + '\'' +
                ", transmision='" + transmision + '\'' +
                '}';
    }
}