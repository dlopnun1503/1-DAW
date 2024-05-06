package Unidad1.Actividad01;

import java.util.Scanner;

public class Ej1 {
        public static void main(String[] args) {
        /*
        Necesitamos calcular perímetro de un círculo
        Tenemos la fórmula, el perímetro de un círculo es pi*diametro, además del valor de pi que es 3.1416
        Neceitamos el valor del diametro
        Usaremos variables de tipo numérico entero para el diametro y real para pi
        */

           // Le asignamos el valor a pi
            float pi = 3.1416f;
            // Pedimos un número para el diametro
            int d;
            Scanner scan = new Scanner(System.in);
            System.out.print("Dame un valor para d: ");
            d = scan.nextInt();
            double per = pi * d;
            System.out.println("El perímetro del círculo es "+per);

        }

    }


