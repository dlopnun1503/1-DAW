package TEMA5.ProyectoPersona;

import TEMA4.ClasesDNI.Clases.VerificadorDNI;

public class Persona {
    //ATRIBUTOS DE CLASE

    private final String dni;
    private String nombre;
    private String apellidos;
    private int edad;

    private static final int mayoriaEdad = 18;

    //CONSTRUCTORES DE CLASE

    public Persona (String nombre, String apellidos, String  dni, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;

        if (edad >= 0){
            this.edad = edad;
        }
    }


    //METODOS DE CLASE

    public void imprime (){
        System.out.println("Hola soy " +this.nombre+ " " +this.apellidos+ " y tengo " + this.edad+ " anios");
    }

    public boolean esMayorEdad (){
        return this.edad >= Persona.mayoriaEdad ;
    }

    public boolean esJubilado (){
        return this.edad > 64;
    }

    public int diferenciaEdad (Persona p){
        int dif = this.edad - p.edad;
        if (dif < 0){
            dif = dif * -1;
        }
        System.out.println("La diferencia de edad es de " +dif+ " anios");

        return dif;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }
}
