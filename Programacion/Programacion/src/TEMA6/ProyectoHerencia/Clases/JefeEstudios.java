package TEMA6.ProyectoHerencia.Clases;

public class JefeEstudios extends Jefe{

    private String zona;

    public JefeEstudios(String nombre, String dni, String sexo, String despacho, String zona) {
        super(nombre, dni, sexo, despacho);
        this.zona = zona;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }
}
