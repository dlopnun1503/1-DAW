package TEMA3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excepciones {
    public static void main(String[] args) {


        /*
        try {
            int a = 2;
            int b = 0;
            int div = a / b;
        }catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("No se puede dividir por 0");
        }


        System.out.println("Estoy aqui");
         */

        //EJEMPLO
        //PROGRAMA QUE DIVIDA
        Scanner scan = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        do {
            try {
                System.out.println("Introduzca el primer numero: ");
                num1 = scan.nextInt();
                System.out.println("Introduzca el divisor: ");
                num2 = scan.nextInt();
                System.out.println("La división es " +(num1/num2));

            }catch (ArithmeticException e){
                System.out.println("No se puede, PAYAS@");
            }catch (InputMismatchException e){
                System.out.println("Tipo de dato incorrecto");
                scan.nextLine();
            }finally { //Siempre se ejecuta al final
                System.out.println("aaaaaa");
            }

        } while (true);

    }
}
