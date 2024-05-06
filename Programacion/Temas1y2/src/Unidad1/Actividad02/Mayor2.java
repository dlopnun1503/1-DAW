package Unidad1.Actividad02;

import java.util.Scanner;

public class Mayor2 {
    public static void main(String[] args) {

int edad;
//Pedimos una edad al usuario

        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un valor para la edad: ");
        edad = scan.nextInt();

        //Hacemos una condición para mostrar si es mayor de edad o no

        if (edad < 18) {
            System.out.println("Eres menor de edad");
        }
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }





    }
}
