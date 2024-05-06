package Unidad1.Actividad02;/*
David
López Núñez
Hora
 */


import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {

        int a;
        int b;
        int c;

        //Pedimos la hora minutos y segundos

        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un valor de horas para a: ");
        a = scan.nextInt();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Dame un valor de minutos para b: ");
        b = scan1.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Dame un valor de segundos para c: ");
        c = scan2.nextInt();


        if (c == 59 && b == 59) {
            a++;
            b = 0;
            c = 0;
            System.out.println("Son las " + a + ":" + b + ":" + c);
        }else if (c == 59 && b != 59) {
            b++;
            c = 0;
            System.out.println("Son las " + a + ":" + b + ":" + c);
        } else if (c != 59 && b == 59) {
                c++;
                b = 0;
                System.out.println("Son las " + a + ":" + b + ":" + c);
            }
        }
}