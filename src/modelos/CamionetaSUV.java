package modelos;

public class CamionetaSUV extends Vehiculo {

    private String traccion;
    private float capacidadMaletero;

    // Constructor vacío
    public CamionetaSUV() {

    }

    // Constructor lleno
    public CamionetaSUV(String traccion,
                        float capacidadMaletero,
                        String placa,
                        String marca,
                        int modelo,
                        float precioPorDia) {

        super(placa, marca, modelo, precioPorDia);

        this.traccion = traccion;
        this.capacidadMaletero = capacidadMaletero;
    }

    public String getTraccion() {
        return traccion;
    }

    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    public float getCapacidadMaletero() {
        return capacidadMaletero;
    }

    public void setCapacidadMaletero(float capacidadMaletero) {
        this.capacidadMaletero = capacidadMaletero;
    }

    @Override
    public String toString() {
        return super.toString() +
                " CamionetaSUV{" +
                "traccion='" + traccion + '\'' +
                ", capacidadMaletero=" + capacidadMaletero +
                '}';
    }
}