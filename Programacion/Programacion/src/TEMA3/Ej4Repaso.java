package TEMA3;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej4Repaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario dos valores N y M
            int N = 0;
            boolean entradaValidaN = false;
            while (!entradaValidaN) {
                try {
                    System.out.print("Introduce el valor N: ");
                    N = scanner.nextInt();
                    entradaValidaN = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes introducir un nÃºmero entero.");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                }
            }

            int M = 0;
            boolean entradaValidaM = false;
            while (!entradaValidaM) {
                try {
                    System.out.print("Introduce el valor M: ");
                    M = scanner.nextInt();
                    entradaValidaM = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes introducir un nÃºmero entero.");
                    scanner.nextLine(); // Limpiar el buffer del scanner
                }
            }

            // Crear un array de tamaÃ±o N con M en todas sus posiciones
            int[] array = new int[N];
            for (int i = 0; i   < N; i++) {
                array[i] = M;
            }

            // Mostrar el array por pantalla
            System.out.println("Array resultante:");
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println();

        } catch (InputMismatchException e) {
            System.out.println("Error: Debes introducir un nÃºmero.");
        }
    }

}
