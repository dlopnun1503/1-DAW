package Unidad1;

import java.util.Scanner;

public class Ejclase {
    public static void main(String[] args) {

        double nota;

        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un valor para nota: ");
        nota = scan.nextDouble();

        if( 0 <= nota ) {
            System.out.println("Keep trying");
        }

        if ( nota < 4 ) {
            System.out.println("keep trying");
        }

        if ( nota > 3.9 ) {
            System.out.println("Casi amigo");
        }

        if (nota < 5) {
            System.out.println("casi  amigo");
        }

        if ( nota > 4.9) {
            System.out.println("Suficiente");
        }

        if (nota < 6) {
            System.out.println("suficiente");
        }
        if ( nota > 5.9) {
            System.out.println("Bien");
        }

        if (nota < 7) {
            System.out.println("bien");
        }
        if ( nota > 6.9 ) {
            System.out.println("notable bajo");;
        }

        if (nota <  8)

            if ( nota > 7.9 ) {
                System.out.println("Notable alto");
            }


        if ( nota > 8.9 ) {
            System.out.println("sobresaliente");
        }







    }
}
