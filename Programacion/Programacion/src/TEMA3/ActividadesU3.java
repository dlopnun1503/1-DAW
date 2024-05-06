package TEMA3;

import java.util.Arrays;
import java.util.Scanner;

public class ActividadesU3 {
    public static void main(String[] args) {



        /* ACTIVIDAD 1
        Pedir 10 numeros reales, almacenarlos en un arrayy mostrar la suma de ellos


        double sumatoria = 0;
        double a;
        double [] arr;
        arr = new double [10];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i <= arr.length-1; i++){
            System.out.print("Dime un número para el array: ");
            a = scan.nextDouble();
        }

        for (int i = 0; i <= arr.length-1; i++){
            sumatoria = sumatoria + arr[i];
        }
        System.out.println("La sumatoria es " +sumatoria);

         */

        //EJERCICIO 2

        double[]arrDouble = new double[100];

        for (int i = 0; i <= arrDouble.length-1;i++){
            arrDouble[i] = Math.random();
        }

        for (int i = 0; i <= arrDouble.length-1; i++) {
            System.out.println(arrDouble[i]);
        }

        double a;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un número: ");
        a = scan.nextDouble();

        int cantidad = 0;
        for (int i = 0; i <= arrDouble.length-1; i++) {
            if (arrDouble[i] >= a) {
                cantidad++;
            }
        }

        System.out.println(cantidad);











    }
}
