package Unidad2.EjclaseBucles;

import java.util.Scanner;

public class Actividdclase {
    public static void main(String[] args) {
        /**
         * Dos programas. Bucle correcto
         * 1. Pedir un numero y lo muestre por pantalla hasta que sea negativo
         * 2. Pedir un numero (positivo) y muestre los valores pares desde 0 hasta ese numero, si el numero no es
         correcto pedir otra vez
         */

        // Ejercicio 1
/*
        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num = scan.nextInt();

        while (num >= 0) {
            System.out.println("Dime otro numero: ");
            num = scan.nextInt();
        }
*/

        // Ejercicio 2


        int i;
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        i = scan1.nextInt();

        while (i <= 0) {
            System.out.println("Dime otro numero: ");
            i = scan1.nextInt();
        }

        int i1 = 0;
        if (i % 2 != 0) {
            i1 = i + 1;
            for (int a = 0; a < i1; a = a + 2) {
                System.out.println("Numero " + a);
            }
        }

        if (i % 2 == 0) {
            for (int a = 0; a <= i; a = a + 2) {
                System.out.println("Numero " + a);
            }
        }

    }
}