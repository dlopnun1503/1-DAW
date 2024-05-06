package Unidad1.Actividad02;/*
David
López Núñez
Generación
 */


import java.util.Scanner;

public class Generación {
    public static void main(String[] args) {

        int a;
        //Pedimos un año al usuario
        Scanner scan  = new Scanner(System.in);
        System.out.println("Dime un año");
        a = scan.nextInt();

        //Ponemos una condición para según que año
        if ( a < 1930) {
            System.out.println("No perteneces a ninguna generación");
        }

        if ( a >= 1930) {
            if (a <= 1948) {
                System.out.println("Perteneces a la generación Niños de la posguerra");
            }
        }

        if ( a >= 1949 ) {
            if (a <= 1968) {
                System.out.println("Perteneces a la generación Baby Boomer");
            }
        }

        if ( a >= 1969) {
            if ( a <= 1980) {
                System.out.println("Perteneces a la generación X");
            }
        }

        if (a >= 1981) {
            if (a <= 1993) {
                System.out.println("Perteneces a la generación millenials");
            }
        }

        if (a >= 1994) {
            if (a <= 2010) {
                System.out.println("Perteneces a la generación Z");
            }
        }

        if (a >=2011) {
            System.out.println("Perteneces a la generación Alfa ");
        }
    }
}
