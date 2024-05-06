package TEMA4.proyectoCoche;

import TEMA4.proyectoCoche.Clase.Coche;

public class mainCoche {
    public static void main(String[] args) {



        //CREACION OBJETO SUVALVARO
        Coche suvAlvaro = new Coche();
        suvAlvaro.propietario = "Alvaro";
        suvAlvaro.nRuedas = 4;
        suvAlvaro.nPuertas = 5;
        suvAlvaro.nBastidor = "AV1234UW";
        suvAlvaro.motor = "diesel";


        //CREACION OBJETO MERCEDESANGEL
        Coche mercedesAngel = new Coche();
        mercedesAngel.propietario = "Angel";
        mercedesAngel.nRuedas = 6;
        mercedesAngel.nPuertas = 5;
        mercedesAngel.nBastidor = "ZV8485474UX";
        mercedesAngel.motor = "gasolina";


        //LLAMOS AL METODO IMPRIMIRDATOSVEHICULOS() DE SUVALVARO
        suvAlvaro.imprimirDatosVehiculos();

        //LLAMOS AL METODO IMPRIMIRDATOSVEHICULOS() DE MERCEDESANGEL
        mercedesAngel.imprimirDatosVehiculos();
    }
}
