package TEMA6.ProyectoVehiculos;

import TEMA6.ProyectoVehiculos.Clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Anadimos un vehiculo de cada tipo
        Terrestre terrestre = new Terrestre("1234ABC", "Mercedes", 4);
        Acuatico acuatico = new Acuatico("12345", "Barco", 230.55);
        Aereo aereo = new Aereo("ABCD123456", "IAV", 80);
        Coche coche = new Coche("45678DFG", "Audi", 4, true);
        Moto moto = new Moto("9999ABS", "Ducati", 2, "Azul");
        Barco barco = new Barco("123", "Bash", 200, true);
        Submarino submarino = new Submarino("12355", "Bash", 120, 3000);
        Avion avion = new Avion("ABCD123499", "IAV", 100, 20.25);
        Helicoptero helicoptero = new Helicoptero("ABCD127779", "IAV", 5, 8);

        //Creamos un ArrayList de vehiculos
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();
        //Anadimos todos los vehiculos
        vehiculos.add(terrestre);
        vehiculos.add(acuatico);
        vehiculos.add(aereo);
        vehiculos.add(coche);
        vehiculos.add(moto);
        vehiculos.add(barco);
        vehiculos.add(submarino);
        vehiculos.add(avion);
        vehiculos.add(helicoptero);

        //Recorremos el ArrayList con un for
        for (int i = 0; i < vehiculos.size(); i++){
            vehiculos.get(i).muestra();
        }



    }
}
