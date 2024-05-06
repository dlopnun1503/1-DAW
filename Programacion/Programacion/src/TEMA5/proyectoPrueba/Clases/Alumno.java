package TEMA5.proyectoPrueba.Clases;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Alumno {

    //*******ATRIBUTOS DE CLASE*******
    private String dni;
    private String nombre;
    private String email;
    private ArrayList<Modulo> modulos = new ArrayList<Modulo>();

    //*******CONSTRUCTOR DE CLASE*******
    public Alumno(String dni, String nombre, String email){
        this.dni = dni;
        this.nombre = nombre;
        this.email = email;
    }

    //*******METODOS DE CLASE*******


    public String getDni() {
        return dni;
    }

    /*
    Aplicamos expresiones regulares para dni y email
     */
    public void setDni(String dni) {
        Pattern patterndni = Pattern.compile("\\d{8}(\\s|-)?[A-Z]");
        Matcher matcherdni = patterndni.matcher(dni);
        if (matcherdni.find()) {
            this.dni = dni;
        }else {
            System.out.println("ERROR");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern patternemail = Pattern.compile("^[a-z]{7}@g\\.educaand\\.es$");
        Matcher matcheremail = patternemail.matcher(email);
        if (matcheremail.find()) {
            this.email = email;
        }else {
            System.out.println("ERROR");
        }
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        this.modulos = modulos;
    }

    /*
    Para anadir un modulo recorremos el ArrayList para ver si hay algun otro con ese nombre y en caso de q no lo haya
    lo anadimos mediante un .add
     */
    public void anadirModulo(Modulo mod){
        for (int i = 0; i < modulos.size(); i++){
            if (!mod.getNombre().equals(modulos.get(i).getNombre())){
                modulos.add(mod);
            }else {
                System.out.println("ERROR");
            }
        }
    }


    /*
    Para contar el numero de horas del modulo recorremos el Array de modulos y vamos sumando las horas en numHoras
     */
    public double getNumeroHoras(){
        double numHoras = 0;
        for (int i = 0; i < modulos.size(); i++){
            if (modulos.get(i).getHoras() <= 20){
                numHoras = modulos.get(i).getHoras();
                System.out.println("El numero de alumnos es " + numHoras);
            }else {
                System.out.println("ERROR");
            }
        }
        return numHoras;
    }
}
