package Unidad2Actividad1;

import java.util.Scanner;

public class Ej2U2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = 0;
        int sumatoriaPares = 0;
        int sumatoriaImpares = 0;


        while (a >= 0 ) {
            System.out.println("Dime un numero: ");
            a = scan.nextInt();

            if (a >= 0) {
                if (a%2 == 0){
                    sumatoriaPares = sumatoriaPares +a;
                }
                if (a%2 != 0) {
                    sumatoriaImpares = sumatoriaImpares +a;
                }
            }




        }

        System.out.println("La suma de los pares es: " +sumatoriaPares);
        System.out.println("La suma de los impares es: " +sumatoriaImpares);
    }
}
