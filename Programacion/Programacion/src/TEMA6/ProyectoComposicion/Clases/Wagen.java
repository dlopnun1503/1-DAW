package TEMA6.ProyectoComposicion.Clases;

public class Wagen {

    private String marca;
    private String modelo;
    private Volk propietario;

    public Wagen(String marca, String modelo, Volk propietario){
        this.marca = marca;
        this.modelo = modelo;
        this.propietario = propietario;
    }

    public Volk getPropietario() {
        return propietario;
    }

    public void setPropietario(Volk propietario) {
        this.propietario = propietario;
    }
}
