package ExamenU3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DavidLopez_ejercicio3 {
    public static void main(String[] args) {


        //Pedimos al usuario dos valores para el tamaño del array y de que va a estar compuesto

        int N = 0;
        String M;
        Scanner scan = new Scanner(System.in);

        //Controlamos excepciones
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Dame un valor para el tamaño: ");
                N = scan.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("ERROR, Introduzca un numero");
                scan.nextLine();
            }
        }
        System.out.println("Dame un valor para rellenar el array: ");
        M = scan.next();

        //Creamos el array

        String[] array = new String[N];

        try {
            for (int i = 0; i <= array.length - 1; i++) {
                array[i] = M;
                System.out.println(array[i]);
            }
        }catch (IndexOutOfBoundsException e) {
            System.out.println("ERROR");
        }
        



    }
    }

