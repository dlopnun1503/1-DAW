package Unidad1.Actividad02;/*
David
López Núñez
Iva
 */

import java.util.Scanner;

public class Iva {
    public static void main(String[] args) {

        double a;
//Pedimos valor al usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Dame un valor para a: ");
        a = scan.nextDouble();

        //Para aplicar el Iva multiplicaremos a por 0.21 y el resultado se lo sumaremos a a

        double iva = a * 0.21;
        double a1 = a + iva;
        System.out.println("El precio del producto con el iva aplicado es " +a1);

    }
}
