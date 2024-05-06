package TEMA3;



import java.util.InputMismatchException;
import java.util.Scanner;

public class Ej1Repaso {
    public static void main(String[] args) {
        double[] numerosAleatorios = new double[100];
        for (int i = 0; i < 100; i++) {
            numerosAleatorios[i] = Math.random();
        }

        Scanner scanner = new Scanner(System.in);
        double valorR = 0.0;

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Introduce un valor real R: ");
                valorR = scanner.nextDouble();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un valor real.");
                scanner.nextLine();
            }
        }

        int contador = 0;

        try {
            for (int i = 0;i< numerosAleatorios.length;i++){
                double numero = numerosAleatorios[i];
                if (numero <= valorR){
                    contador++;
                }
            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Se intenta acceder a una posicion del array que no existe.");
        }

        System.out.println("Cantidad de valores mayores o iguales a " + valorR + ": " + contador);
    }
}
