package TEMA5.ProyectoTelefonia.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contacto {


    //ATRIBUTOS DE CLASE
    private String nombre;
    private String telefono;

    //CONSTRUCTOR DE CLASE
    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        setTelefono(telefono);
    }

    //GETTERS AND SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        Pattern patternTel = Pattern.compile("\\d{9}");
        Matcher matcherTel = patternTel.matcher(telefono);
        if (matcherTel.find()) {
            this.telefono = telefono;
        }else {
            System.out.println("ERROR");
        }
    }

}
