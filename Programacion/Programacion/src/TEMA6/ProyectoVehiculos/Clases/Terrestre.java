package TEMA6.ProyectoVehiculos.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Terrestre extends Vehiculo{

    // ATRIBUTOS DE CLASE
    protected final int numRuedas;

    //CONSTRUCTOR DE CLASE
    public Terrestre(String matricula, String modelo, int numRuedas) {
        setMatricula(matricula);
        this.modelo = modelo;
        this.numRuedas = numRuedas;
    }

    // METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra(){
        if (numRuedas == 4){
            System.out.println("Matricula: " +this.matricula);
            System.out.println("Modelo: " +this.modelo);
            System.out.println("Y tengo 4 ruedas");
        } else if (numRuedas == 2) {
            System.out.println("Matricula: " +this.matricula);
            System.out.println("Modelo: " +this.modelo);
            System.out.println("Y tengo 2 ruedas");
        }else {
            System.out.println("NO TENEMOS VEHICULOS TERRESTRES CON "+numRuedas+ " ruedas");
        }
    }


    // GETTERS Y SETTER, SE GENERAN SOLO LOS GETTERS YA QUE AL SER FINAL NOSE GENERAN SETTERS

    @Override
    public void setMatricula(String matricula) {
        Pattern patternMat = Pattern.compile("\\d{4}[A-Z]{3}");
        Matcher matcherMat = patternMat.matcher(matricula);
        if (matcherMat.find()){
            this.matricula = matricula;
        }else {
            System.out.println("ERROR");
        }
    }
    public int getNumRuedas() {
        return numRuedas;
    }

}

