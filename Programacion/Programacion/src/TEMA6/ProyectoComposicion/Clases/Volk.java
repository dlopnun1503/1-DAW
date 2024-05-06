package TEMA6.ProyectoComposicion.Clases;

import TEMA6.ProyectoComposicion.Clases.Wagen;

import java.util.ArrayList;

public class Volk {

    private String nombre;
    private ArrayList<Wagen> coches;

    public Volk(String nombre, ArrayList<Wagen> coches){
        this.nombre = nombre;
        this.coches = coches;
    }
}
