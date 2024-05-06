package TEMA3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjercicioRepaso {
    public static void main(String[] args) {
        int a;
        int numMayor = 0;
        int numMenor = 0;
        int[] aa = new int[100];
        Scanner scan = new Scanner(System.in);


        try {
            System.out.println("Di un numero: ");
            a = scan.nextInt();
            for (int i = 0; i <= aa.length - 1; i++) {
                aa[i] = (int)Math.random();
            }
            for (int j = a; a > aa[j]; j++ ) {
                numMayor++;
            }
            for (int k = a; a > aa[k]; k++ ) {
                numMenor++;
            }

        }catch (IndexOutOfBoundsException e) {
            System.out.println("Esa posicion no existe");
        }catch (InputMismatchException e) {
            System.out.println("Dato incorrecto");
        }
    }
}