package TEMA4.proyectoPersona;

import TEMA4.proyectoPersona.Clase.Direccion;
import TEMA4.proyectoPersona.Clase.Persona;

public class mainPersona {
    public static void main(String[] args) {

        Persona persona1 = new Persona("David", "Lopez Nunez", 19, "77496750K", new Direccion("Hermanos bohorque gomez", 7, "11600", "Ubrique", "Cádiz"));
        Persona persona2 = new Persona("Carlos", "Perez Garcia", 17, "77496759L", new Direccion("Jesus", 10, "12600", "Ubrique", "Cádiz"));
        Persona persona3 = new Persona("Juan", "Garcia Perez", 22, "77496755K", new Direccion("Santa Trinidad", 18, "41600", "Dos Hermanas", "Sevilla"));


        persona1.presentarse();
        persona2.presentarse();
        persona3.presentarse();








    }
}
