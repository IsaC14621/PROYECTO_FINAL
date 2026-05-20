package modelos;

public class Vehiculo {
    private String placa;
    private String marca;
    private int modelo;
    private float precioDiario;
    private String estado;

    // Constructor vacío
    public Vehiculo() {

    }

    // Constructor lleno
    public Vehiculo(String placa, String marca,
                     int modelo, float precioDiario,
                     String estado) {

        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.precioDiario = precioDiario;
        this.estado = estado;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public float getPrecioDiario() {
        return precioDiario;
    }

    public void setPrecioDiario(float precioDiario) {
        this.precioDiario = precioDiario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", precioDiario=" + precioDiario +
                ", estado='" + estado + '\'' +
                '}';
    }
}

