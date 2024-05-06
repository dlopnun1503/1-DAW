package TEMA6.ProyectoHerencia.Clases;

public class Jefe extends PersonaH{

    protected String despacho;


    public Jefe(String nombre, String dni, String sexo, String despacho) {
        super(nombre, dni, sexo);
        this.despacho = despacho;
    }

    public String getDespacho() {
        return despacho;
    }

    public void setDespacho(String despacho) {
        this.despacho = despacho;
    }
}
