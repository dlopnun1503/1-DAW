package TEMA7.ProyectoHotel;

import TEMA7.ProyectoHotel.Model.Alojamiento;
import TEMA7.ProyectoHotel.Services.GestionFichero;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Alojamiento> alojamientos = new ArrayList<>();
        GestionFichero gf = new GestionFichero();
        alojamientos = gf.leerFichero();
    }
}
