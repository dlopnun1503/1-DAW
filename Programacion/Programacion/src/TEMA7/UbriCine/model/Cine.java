package TEMA7.UbriCine.model;

public class Cine {

    //ATRIBUTOS DE CLASE
    private String nombreCine;
    private int asientosSala;
    private int entradasVendidas;


    //CONSTRUCTOR DE CLASE
    public Cine(String nombreCine, int asientosSala, int entradasVendidas) {
        this.nombreCine = nombreCine;
        this.asientosSala = asientosSala;
        this.entradasVendidas = entradasVendidas;
    }


    // GETTERS Y SETTERS
    public String getNombreCine() {
        return nombreCine;
    }

    public void setNombreCine(String nombreCine) {
        this.nombreCine = nombreCine;
    }

    public int getAsientosSala() {
        return asientosSala;
    }

    public void setAsientosSala(int asientosSala) {
        this.asientosSala = asientosSala;
    }

    public int getEntradasVendidas() {
        return entradasVendidas;
    }

    public void setEntradasVendidas(int entradasVendidas) {
        this.entradasVendidas = entradasVendidas;
    }


    //METODOS DE CLASE
    @Override
    public String toString() {
        return "Cine: " +
                "nombre: " + nombreCine + '\'' +
                ", numero de asientos: " + asientosSala + '\'' +
                ", entradas vendidas: " + entradasVendidas
                ;
    }
}
