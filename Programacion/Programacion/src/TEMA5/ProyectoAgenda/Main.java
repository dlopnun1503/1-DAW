package TEMA5.ProyectoAgenda;

import TEMA5.ProyectoAgenda.Clases.Direccion;
import TEMA5.ProyectoAgenda.Clases.Localidad;
import TEMA5.ProyectoAgenda.Clases.Persona;

public class Main {
    public static void main(String[] args) {

        Localidad localidad1 = new Localidad("Ubrique","Cadiz", "11600");
        Direccion direccion1 = new Direccion("Hermanos Bohorquez Gomez", 7, 0, " ",localidad1);
        Persona persona1  = new Persona("David", "77496750K", 19, "davidlopez13919@gmail.com", "639732950",direccion1);



        persona1.presentacion();

    }
}
