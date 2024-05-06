package TEMA6.ProyectoVehiculos.Clases;

public class Avion extends Aereo{

    //ATRIBUTOS DE CLASE
    private double tiempoMaxVuelo;


    //CONSTRUCTOR DE CLASE
    public Avion(String matricula, String modelo, int numAsientos, double tiempoMaxVuelo) {
        super(matricula, modelo, numAsientos);
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }

    // METODOS DE CLASE
    @Override
    public void muestra(){
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Asientos: " +this.numAsientos);
        System.out.println("y tengo un tiempo de vuelo de " +this.tiempoMaxVuelo+ " horas");
    }


    // GETTERS Y SETTER
    public double getTiempoMaxVuelo() {
        return tiempoMaxVuelo;
    }

    public void setTiempoMaxVuelo(double tiempoMaxVuelo) {
        this.tiempoMaxVuelo = tiempoMaxVuelo;
    }
}
