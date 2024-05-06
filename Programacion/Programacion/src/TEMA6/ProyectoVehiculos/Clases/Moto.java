package TEMA6.ProyectoVehiculos.Clases;

public class Moto extends Terrestre{

    //ATRIBUTOS DE CLASE
    private String color;


    //CONSTRUCTOR DE CLASE
    public Moto(String matricula, String modelo, int numRuedas, String color) {
        super(matricula, modelo, numRuedas);
        this.color = color;
    }

    //METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra(){
        if (numRuedas == 2){
            System.out.println("Matricula: " +this.matricula);
            System.out.println("Modelo: " +this.modelo);
            System.out.println("Color: " +this.color);
            System.out.println("Y tengo 2 ruedas porque soy una moto");
        }else {
            System.out.println("ERROR");
        }
    }

    // GETTERS Y SETTER
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
