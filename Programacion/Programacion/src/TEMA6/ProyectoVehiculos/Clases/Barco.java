package TEMA6.ProyectoVehiculos.Clases;

import TEMA5.ProyectoPeliculas.services.PeliculasService;

public class Barco extends Acuatico{

    //ATRIBUTOS DE CLASE
    private boolean motor;


    //CONSTRUCTOR DE CLASE
    public Barco(String matricula, String modelo, double eslora, boolean motor) {
        super(matricula, modelo, eslora);
        this.motor = motor;
    }

    //METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo

    @Override
    public void muestra() {
        if (motor) {
            System.out.println("Matricula: " + this.matricula);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Eslora: " + this.eslora);
            System.out.println("y voy a motor");
        } else {
            System.out.println("Matricula: " + this.matricula);
            System.out.println("Modelo: " + this.modelo);
            System.out.println("Eslora: " + this.eslora);
            System.out.println("y no voy a motor por lo que voy mas lento");
        }
    }


    // GETTERS Y SETTER
    public boolean isMotor() {
        return motor;
    }

    public void setMotor(boolean motor) {
        this.motor = motor;
    }
}
