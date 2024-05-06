package TEMA3;

import java.util.Scanner;

public class GetterSetter {
    public static void main(String[] args) {

        /**
         * Implementa un programa donde un usuario debe rellenar un array int de tamaño 10
         *Se ha de controlar mediante el uso de excepciones que no se introduzcan mas de 10 elementos
         * *****Ayuda*****
         * Bucle while o do-while para que el user vaya introduciendo los datos
         * cuando se intente introducir un dato en una psoicion que no exista, controlar esa excepcion
         * Implementar función que compruebe que el numero introducido es positivo, sino es positivo lanza excepcion
         * La funcion se llama comprobar
         */

        int [] array = new int[10];
        Scanner scan = new Scanner(System.in);
        int num = 0;

        for (int i = 0; i <= array.length-1; i++){
            System.out.println("Introduce el array; ");
            num = scan.nextInt();


        }
    }
}
