package TEMA3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjclaseControlPosicion {
    public static void main(String[] args) {


        /*
        Constrye un programa que pida al usuario una cadena de texto.
        Acto seguido, solicita la posición de un carácter de la cadena de texto y lo imkprime por pantalla.
        Controla las posibles excepciones producidas al acceder a posiciones inválidas de la cadena
         */

        String a;
        int b = 0;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Introduzca una cadena de texto");
        a = scan.next();



        do {
            try {
                System.out.println("que posición quieres ver: ");
                b = scan.nextInt();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("No encontramos esa posición");
            } catch (InputMismatchException e) {
                System.out.println("No encontramos esa posición");
            }
        }while (b > a.length() - 1 || b < 0) ;
            System.out.println(a.charAt(b));





    }
}

