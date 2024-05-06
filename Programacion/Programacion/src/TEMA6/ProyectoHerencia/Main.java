package TEMA6.ProyectoHerencia;

import TEMA6.ProyectoHerencia.Clases.Cliente;
import TEMA6.ProyectoHerencia.Clases.Empleado;
import TEMA6.ProyectoHerencia.Clases.Jefe;
import TEMA6.ProyectoHerencia.Clases.PersonaH;

public class Main {
    public static void main(String[] args) {


        //Creamos un cliente
        Cliente David = new Cliente("David", "77496750K", "H", "1", true);
        David.presentacion();

        //Creamos un empleado
        Empleado Juanma = new Empleado("Juanma", "12345678A", "H", 1300);
        Juanma.presentacion();

        //Creamos una PersonaH
        PersonaH persona = new PersonaH("Juan", "12345678M", "M");

    }
}
