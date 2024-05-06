package TEMA6.ProyectoVehiculos.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Acuatico extends Vehiculo{

    //ATRIBUTOS DE CLASE
    protected final double eslora;

    //CONSTRUCTOR DE CLASE
    public Acuatico(String matricula, String modelo, double eslora) {
       setMatricula(matricula);
        this.modelo = modelo;
        this.eslora = eslora;
    }

    // METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra(){
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Eslora: " +this.eslora);
    }

    // GETTERS Y SETTER, SE GENERAN SOLO LOS GETTERS YA QUE AL SER FINAL NOSE GENERAN SETTERS
    @Override
    public void setMatricula(String matricula) {
        Pattern patternMat = Pattern.compile("\\d{3,10}");
        Matcher matcherMat = patternMat.matcher(matricula);
        if (matcherMat.find()){
            this.matricula = matricula;
        }else {
            System.out.println("ERROR");
        }
    }


    public double getEslora() {
        return eslora;
    }
}

