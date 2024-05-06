package Unidad1.Actividad02;/*
David
López Núñez
Operaciones
 */

import java.util.Scanner;

public class Operaciones {
    public static void main(String[] args) {

        double a;
        double b;
//Pedimos valores al usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un valor para a: ");
        a = scan.nextDouble();

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Dame un valor para b: ");
        b = scan1.nextDouble();

        //Para la suma
        double suma = a + b;
        System.out.println("La suma de ambos es igual a" +suma);

        //Para la resta
        double resta = a - b;
        System.out.println("La resta de ambos es igual a" +resta);

        //Para la multiplicación
        double mult = a * b;
        System.out.println("La multiplicación de ambos es igual a" +mult);

        //Para la division
        double div = a / b;
        System.out.println("La division de ambos es igual a" +div);

    }
}
