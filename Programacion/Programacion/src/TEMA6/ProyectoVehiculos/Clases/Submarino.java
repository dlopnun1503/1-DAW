package TEMA6.ProyectoVehiculos.Clases;

public class Submarino extends Acuatico{

    //ATRIBUTOS DE CLASE
    private double profundidadMax;


    //CONSTRUCTOR DE CLASE
    public Submarino(String matricula, String modelo, double eslora, double profundidadMax) {
        super(matricula, modelo, eslora);
        this.profundidadMax = profundidadMax;
    }

    //METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra() {
            System.out.println("Matricula: " + this.matricula);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Eslora: " + this.eslora);
            System.out.println("y voy tengo una profundidad maxima de " +this.profundidadMax+ " metros");
    }


    // GETTERS Y SETTER
    public double getProfundidadMax() {
        return profundidadMax;
    }

    public void setProfundidadMax(double profundidadMax) {
        this.profundidadMax = profundidadMax;
    }
}
