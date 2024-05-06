package TEMA6.ProyectoVehiculos.Clases;

public class Helicoptero extends Aereo{

    //ATRIBUTOS DE CLASE
    private int numHelices;


    //CONSTRUCTOR DE CLASE
    public Helicoptero(String matricula, String modelo, int numAsientos, int numHelices) {
        super(matricula, modelo, numAsientos);
        this.numHelices = numHelices;
    }

    // METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra(){
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Asientos: " +this.numAsientos);
        System.out.println("y tengo  " +this.numHelices+ " helices");
    }


    // GETTERS Y SETTER

    public int getNumHelices() {
        return numHelices;
    }

    public void setNumHelices(int numHelices) {
        this.numHelices = numHelices;
    }
}
