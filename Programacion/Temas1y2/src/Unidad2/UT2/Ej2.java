package Unidad2.UT2;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        a = scan.nextInt();

        while (a >= 0) {
            System.out.println("Dime otro numero: ");
            a = scan.nextInt();
        }


    }
}
