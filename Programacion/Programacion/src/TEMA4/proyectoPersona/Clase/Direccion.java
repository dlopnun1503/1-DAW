package TEMA4.proyectoPersona.Clase;

import TEMA4.proyectoPersona.utils.LocalidadValidator;

public class Direccion {

    public String calle;
    public int numero;
    public String cp;
    public int puerta;
    public String localidad;
    public String provincia;

    //Constructor de clase

    public Direccion (String calle, int numero, String cp, String localidad, String provincia) {
        this.calle = calle;
        this.numero = numero;

        LocalidadValidator l = new LocalidadValidator();
        boolean cpYProvinciaCorrectos = l.checkProvincia(provincia,cp);
        if (cpYProvinciaCorrectos) {
            this.cp = cp;
            this.localidad = localidad;
            this.provincia = provincia;
        }
    }
}
