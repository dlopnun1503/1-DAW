package Unidad2.EjclaseBucles;

import java.util.Scanner;

public class Ejclase {
    public static void main(String[] args) {


        // Mostar por pantalla todos los numeros del 0 al -20
      /*  int num1 = 0;
        while (num1 >= -20) {
            System.out.println(num1);
            num1 --;
        }
*/
        //Mostar por pantalla todos los numeros pares positivos de 0 a 100

       /* int num2 = 0;

        while (num2 <= 100) {
            System.out.println(num2);
            num2 = num2 + 2;
        }
        // Hcer un programa que pida un numero por teclado y que muestre "AHAHA no has dicho la palabra correcta"
        //mientras que el numero no sea 0

        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num = scan.nextInt();

        while (num != 0) {
            System.out.println("Ahaha no has dicho la palabra correcta");
            System.out.println("Dime otro numero: ");
            num = scan.nextInt();
        } */

        //Estructura do-while
        /*
        Hcer un menu para seleccionar una opcion
         1. Programacion
         2. BD
         3. FOL
         4. Entornos
         0. salir
         */

        int opcion;
        Scanner scan = new Scanner(System.in);
        System.out.println("que asignatura quieres: ");
        opcion = scan.nextInt();
        do {
            System.out.println("que asignatura quieres: ");
            opcion = scan.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3 && opcion != 4 && opcion == 0);

        if (opcion == 0) {
            System.out.println("Salir");
        }
        if (opcion == 1) {
            System.out.println("Matriculado en Programación");
        }
        if (opcion == 2) {
            System.out.println("Matriculado en BD");
        }
        if (opcion == 3) {
            System.out.println("Matriculado en fol");
        }
        if (opcion == 4) {
            System.out.println("Matriculado en Entornos");
        }
    }
}

