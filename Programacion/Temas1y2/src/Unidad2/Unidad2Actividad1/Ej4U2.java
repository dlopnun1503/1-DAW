package Unidad2Actividad1;

import java.util.Scanner;

public class Ej4U2 {
    public static void main(String[] args) {

        int a;

        Scanner scann = new Scanner(System.in);
        System.out.println("Ingrese el número de términos de la serie de Fibonacci: ");
        a = scann.nextInt();

        int primerNum = 0;
        int segundoNum = 1;
        int b;
        System.out.println("Los primeros numeros de la serie Fibonacci son  " +primerNum+ ", " + segundoNum);
        for (int i = 3; i <= a; i++){ // i es nuestro contador

            b = primerNum + segundoNum;
            System.out.print(", " + b);
            primerNum = segundoNum;
            segundoNum = b;
        }






    }
}
