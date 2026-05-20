package modelos;

public class ContratoRenting {

    private int idContrato;
    private Cliente cliente;
    private Vehiculo vehiculo;
    private int cantidadDias;
    private float totalPagar;
    private String estadoContrato;

    public ContratoRenting() {

    }

    public ContratoRenting(int idContrato,
                           Cliente cliente,
                           Vehiculo vehiculo,
                           int cantidadDias,
                           float totalPagar,
                           String estadoContrato) {

        this.idContrato = idContrato;
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.cantidadDias = cantidadDias;
        this.totalPagar = totalPagar;
        this.estadoContrato = estadoContrato;
    }

    public int getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(int idContrato) {
        this.idContrato = idContrato;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public int getCantidadDias() {
        return cantidadDias;
    }

    public void setCantidadDias(int cantidadDias) {
        this.cantidadDias = cantidadDias;
    }

    public float getTotalPagar() {
        return totalPagar;
    }

    public void setTotalPagar(float totalPagar) {
        this.totalPagar = totalPagar;
    }

    public String getEstadoContrato() {
        return estadoContrato;
    }

    public void setEstadoContrato(String estadoContrato) {
        this.estadoContrato = estadoContrato;
    }

    @Override
    public String toString() {
        return "ContratoRenting{" +
                "idContrato=" + idContrato +
                ", cliente=" + cliente +
                ", vehiculo=" + vehiculo +
                ", cantidadDias=" + cantidadDias +
                ", totalPagar=" + totalPagar +
                ", estadoContrato='" + estadoContrato + '\'' +
                '}';
    }
}
