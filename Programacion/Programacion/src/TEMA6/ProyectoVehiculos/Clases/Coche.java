package TEMA6.ProyectoVehiculos.Clases;

public class Coche extends Terrestre{

    //ATRIBUTOS DE CLASE
    private boolean aireAcondicionado;

    //CONSTRUCTOR DE CLASE
    public Coche(String matricula, String modelo, int numRuedas, boolean aireAcondicionado) {
        super(matricula, modelo, numRuedas);
        this.aireAcondicionado = aireAcondicionado;
    }


    //METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra(){
        if (numRuedas == 4){
            System.out.println("Matricula: " +this.matricula);
            System.out.println("Modelo: " +this.modelo);
            System.out.println("Y tengo 4 ruedas porque soy un coche");
        }else {
            System.out.println("ERROR");
        }
    }

    // GETTERS Y SETTER

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }
}

