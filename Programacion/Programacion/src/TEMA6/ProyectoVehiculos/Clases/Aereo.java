package TEMA6.ProyectoVehiculos.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Aereo extends Vehiculo{

    //ATRIBUTOS DE CLASE
    protected final int numAsientos;

    public Aereo(String matricula, String modelo, int numAsientos) {
        setMatricula(matricula);
        this.modelo = modelo;
        this.numAsientos = numAsientos;
    }

    // METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra(){
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Asientos: " +this.numAsientos);
    }


    // GETTERS Y SETTER, SE GENERAN SOLO LOS GETTERS YA QUE AL SER FINAL NOSE GENERAN SETTERS
    public int getNumAsientos() {
        return numAsientos;
    }
    @Override
    public void setMatricula(String matricula) {
        Pattern patternMat = Pattern.compile("[A-Z]{4}\\d{6}");
        Matcher matcherMat = patternMat.matcher(matricula);
        if (matcherMat.find()){
            this.matricula = matricula;
        }else {
            System.out.println("ERROR");
        }
    }

}
