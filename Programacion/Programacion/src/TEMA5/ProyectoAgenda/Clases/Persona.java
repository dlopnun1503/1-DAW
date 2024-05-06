package TEMA5.ProyectoAgenda.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona {

    //Atributod de clase
    private String nombre;
    private String dni;
    private int edad;
    private String email;
    private String telefono;
    private Direccion direccion;

    //Constructor de clase
    public Persona(String nombre, String dni, int edad, String email, String telefono, Direccion direccion){
        this.nombre = nombre;
        this.dni = dni;
        this.email = email;
        this.telefono = telefono;
        this.edad = edad;
        this.direccion = direccion;
    }

    //Metodos de clase


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        Pattern nombrePattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher nombreMatcher = nombrePattern.matcher(nombre);
        if (nombreMatcher.find()){
            this.nombre = nombre;
        }

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        Pattern dniPattern = Pattern.compile("^\\d{8}(\\s|-)?[A-Z]");
        Matcher dniMatcher = dniPattern.matcher(dni);
        if (dniMatcher.find()){
            this.dni = dni;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0 && edad < 150){
            this.edad = edad;
        }else {
            System.out.println("ERROR....");
        }

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        Pattern emailPattern = Pattern.compile("^.+@(hotmail|gmail)\\.(com|es)$");
        Matcher emailMatcher = emailPattern.matcher(email);
        if (emailMatcher.find()){
            this.email = email;
        }

    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        Pattern telefonoPattern = Pattern.compile("^(6|7)\\d{8}$");
        Matcher telefonoMatcher = telefonoPattern.matcher(telefono);
        if (telefonoMatcher.find()){
            this.telefono = telefono;
        }

    }

    public void presentacion(){
        System.out.println("Hola me llamo "+this.nombre+ " tengo "+this.edad+" años y mi direccion es ");
        direccion.presentacion();
        System.out.println("Puedes contactarme con mi email "+this.email+ " o mi telefono "+this.telefono);
    }
}
