package Unidad1.Actividad02;/*
David
López Núñez
Edad
 */

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {

        int a;
        //Pedimos una edad al usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime una edad: ");
        a = scan.nextInt();

        //Hacemos una condición para decir si es mayor o menor de edad
        if ( a <  18) {
            System.out.println("Es menor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }

    }
}
