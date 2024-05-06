package Unidad1.Actividad02;/*
David
López Núñez
Mayor
 */


import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        //Pedimos tres numeros al usuario

        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un valor para a: ");
        a = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Dame un valor para b: ");
        b = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Dame un valor para c: ");
        c = scan2.nextInt();

        //Ponemos las condiciones para que muestre por pantalla cual es el mayor

        if (a > b && a > c) {
            System.out.println("a es el mayor");
        }

        if (b > a && b > c) {
            System.out.println("b es el mayor");
        }

        if (c > b && c > a) {
            System.out.println("c es el mayor");
        }

        if (a == b && a== c) {
            System.out.println("son todos iguales");
        }

    }
}
