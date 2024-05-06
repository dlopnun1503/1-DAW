package TEMA6.ProyectoAstros.Clases;

public class Planeta extends Astro{

    private double distanciaSol;
    private double orbitalSol;
    private boolean tieneSatelites;


    public Planeta(double radioEcuatorial, double rotacion, double masa, double tempMedia, String nombre, double distanciaSol, double orbitalSol, boolean tieneSatelites) {
        super(radioEcuatorial, rotacion, masa, tempMedia, nombre);
        this.distanciaSol = distanciaSol;
        this.orbitalSol = orbitalSol;
        this.tieneSatelites = tieneSatelites;
    }

    @Override
    public void muestra(){
        System.out.println("____________");
        System.out.println("Nombre del astro: " +this.nombre);
        System.out.println("Radio del astro: " +this.radioEcuatorial);
        System.out.println("Temperatura media del astro: " +this.tempMedia);
        System.out.println("Tarda en darle la vuelta al sol: " +this.orbitalSol);
        System.out.println("____________");
    }

    public double getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(double distanciaSol) {
        this.distanciaSol = distanciaSol;
    }

    public double getOrbitalSol() {
        return orbitalSol;
    }

    public void setOrbitalSol(double orbitalSol) {
        this.orbitalSol = orbitalSol;
    }

    public boolean isTieneSatelites() {
        return tieneSatelites;
    }

    public void setTieneSatelites(boolean tieneSatelites) {
        this.tieneSatelites = tieneSatelites;
    }
}
