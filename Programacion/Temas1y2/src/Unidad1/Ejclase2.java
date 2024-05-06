package Unidad1;

import java.util.Scanner;

public class Ejclase2 {
    public static void main(String[] args) {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un valor para a: ");
        a = scan.nextInt();


        if ( a < 0) {
            System.out.println("El numero es negativo");
        } else  {
            System.out.println("El numero es positivo");
        }


    }
}
