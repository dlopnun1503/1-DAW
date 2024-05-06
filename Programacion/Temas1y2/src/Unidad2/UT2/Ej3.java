package Unidad2.UT2;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int numIntroducido = 0;

        while (numIntroducido >= 0) {
            System.out.println("Introduce un numero: ");
            numIntroducido = scan.nextInt();
            suma = suma + numIntroducido;
        }




        System.out.println("La suma es: " +suma);

        

    }
}
