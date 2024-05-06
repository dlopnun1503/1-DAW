package TEMA5.ProyectoAgenda.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Direccion {

    //Atributos de clase
    private String calle;
    private int numero;
    private int planta;
    private String puerta;
    private  Localidad localidad;

    public Direccion(String calle, int numero, int planta, String puerta, Localidad localidad){
        this.calle = calle;
        this.numero = numero;
        this.planta = planta;
        this.puerta = puerta;
        this.localidad = localidad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        Pattern callePattern = Pattern.compile("^[A-Z][a-z]+\\s\\d{1,2}[A-Z]?\\S(\\d{1,2}[A-Z]?)?$");
        Matcher calleMatcher = callePattern.matcher(calle);

        if(calleMatcher.find()) {
            this.calle = calle;
        }
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;

    }

    public int getPlanta() {
        return planta;
    }

    public void setPlanta(int planta) {
        this.planta = planta;
    }

    public String getPuerta() {
        return puerta;
    }

    public void setPuerta(String puerta) {
        Pattern puertaPattern = Pattern.compile("^[A-Z]$");
        Matcher puertaMatcher = puertaPattern.matcher(puerta);
        if (puertaMatcher.find()){
            this.puerta = puerta;
        }
    }

    public Localidad getLocalidad() {
        return localidad;
    }

    public void setLocalidad(Localidad localidad) {
        this.localidad = localidad;
    }

    public void presentacion(){
        System.out.println(this.calle+ "N "+this.numero+" planta "+this.planta+" puerta "+this.puerta);
        localidad.presentacion();
    }
}
