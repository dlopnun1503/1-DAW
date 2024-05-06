package TEMA6.ProyectoHerencia.Clases;

public class Cliente extends PersonaH{

    private String idCliente;
    private boolean esMoroso;

    public Cliente(String nombre, String dni, String sexo, String idCliente, Boolean esMoroso) {
        super(nombre, dni, sexo);
        this.idCliente = idCliente;
        this.esMoroso = esMoroso;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public boolean isEsMoroso() {
        return esMoroso;
    }

    public void setEsMoroso(boolean esMoroso) {
        this.esMoroso = esMoroso;
    }

    public void presentacion(){
        System.out.println("_______________");
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Id: "+this.idCliente);
        System.out.println("Es moroso?: "+this.esMoroso);
        System.out.println("_______________");

    }
}
