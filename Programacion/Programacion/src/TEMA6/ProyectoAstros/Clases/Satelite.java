package TEMA6.ProyectoAstros.Clases;

public class Satelite extends  Astro{


    private double distanciaPlaneta;
    private double orbitaPlanetaria;


    public Satelite(double radioEcuatorial, double rotacion, double masa, double tempMedia, String nombre, double distanciaPlaneta, double orbitaPlanetaria) {
        super(radioEcuatorial, rotacion, masa, tempMedia, nombre);
        this.distanciaPlaneta = distanciaPlaneta;
        this.orbitaPlanetaria = orbitaPlanetaria;
    }

    @Override
    public void muestra(){
        System.out.println("____________");
        System.out.println("Nombre del astro: " +this.nombre);
        System.out.println("Radio del astro: " +this.radioEcuatorial);
        System.out.println("Temperatura media del astro: " +this.tempMedia);
        System.out.println("Tarda en darle la vuelta al planeta: " +this.orbitaPlanetaria);
        System.out.println("____________");
    }

    public double getDistanciaPlaneta() {
        return distanciaPlaneta;
    }

    public void setDistanciaPlaneta(double distanciaPlaneta) {
        this.distanciaPlaneta = distanciaPlaneta;
    }

    public double getOrbitaPlanetaria() {
        return orbitaPlanetaria;
    }

    public void setOrbitaPlanetaria(double orbitaPlanetaria) {
        this.orbitaPlanetaria = orbitaPlanetaria;
    }
}
