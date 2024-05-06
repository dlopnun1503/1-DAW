package TEMA6.ProyectoComposicion;

import TEMA6.ProyectoComposicion.Clases.Volk;
import TEMA6.ProyectoComposicion.Clases.Wagen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Wagen audi = new Wagen("audi", "a4", null);

        ArrayList<Wagen> cochesRaquel = new ArrayList<>();
        cochesRaquel.add(audi);

        Volk Raquel = new Volk("Raquel", cochesRaquel);

        audi.setPropietario(Raquel);

        System.out.println("");

    }
}
