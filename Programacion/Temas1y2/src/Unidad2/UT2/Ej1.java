package Unidad2.UT2;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        n = scan.nextInt();


        int sumatorio = 0;

        for (int i = 0; i <= n; i++) {
            sumatorio = sumatorio + i;
        }
        System.out.println(sumatorio);






    }
}
