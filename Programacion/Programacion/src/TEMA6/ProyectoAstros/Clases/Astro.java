package TEMA6.ProyectoAstros.Clases;

public class Astro {

    protected double radioEcuatorial;
    protected double rotacion;
    protected double masa;
    protected double tempMedia;

    protected String nombre;

    public Astro(double radioEcuatorial, double rotacion, double masa, double tempMedia, String nombre){
        this.radioEcuatorial = radioEcuatorial;
        this.rotacion = rotacion;
        this.masa = masa;
        this.tempMedia = tempMedia;
        this.nombre = nombre;
    }

    public void muestra(){
        System.out.println("____________");
        System.out.println("Nombre del astro: " +this.nombre);
        System.out.println("Radio del astro: " +this.radioEcuatorial);
        System.out.println("Temperatura media del astro: " +this.tempMedia);
        System.out.println("____________");
    }

    public double getRadioEcuatorial() {
        return radioEcuatorial;
    }

    public void setRadioEcuatorial(double radioEcuatorial) {
        this.radioEcuatorial = radioEcuatorial;
    }

    public double getRotacion() {
        return rotacion;
    }

    public void setRotacion(double rotacion) {
        this.rotacion = rotacion;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getTempMedia() {
        return tempMedia;
    }

    public void setTempMedia(double tempMedia) {
        this.tempMedia = tempMedia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esMayor(Astro a){
        return this.radioEcuatorial > a.radioEcuatorial;

    }
}
