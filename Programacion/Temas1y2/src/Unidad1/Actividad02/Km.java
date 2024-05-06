package Unidad1.Actividad02;/*
David
López Núñez
Km
 */

import java.util.Scanner;

public class Km {
    public static void main(String[] args) {

  double km;

  //Pedimos valor para los kilometros
        Scanner scan  = new Scanner(System.in);
        System.out.println("Dame un valor para los kilometros: ");
        km = scan.nextDouble();

        /*
        Tenemos que obtener los kilómetros en millas
        Una milla = 1.6 Km
         */

        double millas = km/1.6;
        System.out.println("El resultado en millas es " +millas);


    }
}
