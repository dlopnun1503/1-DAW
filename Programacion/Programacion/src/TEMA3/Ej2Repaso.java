package TEMA3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Ej2Repaso {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int N = 0;
            boolean entradaValidaN = false;
            while (!entradaValidaN) {
                try {
                    System.out.print("Introduce el numero de personas (N): ");
                    N = scanner.nextInt();
                    entradaValidaN = true;
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes introducir un numero entero.");
                    scanner.nextLine();
                }
            }

            double[] alturas = new double[N];
            double sumaAlturas = 0;
            double alturaMinima = Double.MAX_VALUE;
            double alturaMaxima = Double.MIN_VALUE;

            for (int i = 0; i < N; i++) {
                try {
                    System.out.print("Introduce la altura de la persona " + (i + 1) + " (en metros): ");
                    alturas[i] = scanner.nextDouble();
                } catch (InputMismatchException e) {
                    System.out.println("Error: Debes introducir un nÃºmero.");
                    scanner.nextLine();
                    i--;
                }
            }

            for (int i = 0; i < alturas.length; i++) {
                double altura = alturas[i];
                sumaAlturas += altura;
                alturaMinima = Math.min(alturaMinima, altura);
                alturaMaxima = Math.max(alturaMaxima, altura);
            }

            double alturaMedia = sumaAlturas / N;

            System.out.println("Altura media: " + alturaMedia + " metros");
            System.out.println("Altura minima: " + alturaMinima + " metros");
            System.out.println("Altura maxima: " + alturaMaxima + " metros");

            int personasPorEncima = 0;
            int personasPorDebajo = 0;

            for (int i = 0; i < alturas.length; i++) {
                double altura = alturas[i];
                if (altura > alturaMedia) {
                    personasPorEncima++;
                } else if (altura < alturaMedia) {
                    personasPorDebajo++;
                }
            }

            System.out.println("Personas por encima de la media: " + personasPorEncima);
            System.out.println("Personas por debajo de la media: " + personasPorDebajo);
        }
    }

