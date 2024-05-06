package TEMA6.ProyectoHerencia.Clases;

public class Director extends Jefe{

    private String asistente;

    public Director(String nombre, String dni, String sexo, String despacho, String  asistente) {
        super(nombre, dni, sexo, despacho);
        this.asistente = asistente;
    }

    public String getAsistente() {
        return asistente;
    }

    public void setAsistente(String asistente) {
        this.asistente = asistente;
    }
}
