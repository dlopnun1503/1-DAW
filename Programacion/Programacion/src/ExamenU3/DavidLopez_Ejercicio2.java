package ExamenU3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DavidLopez_Ejercicio2 {
    public static void main(String[] args) {

        //Primero pedimos el numero de personas que queremos medir y controlamos que introduzca un numero entero
        Scanner scan = new Scanner(System.in);
        int N = 0;
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.print("Introduce el numero de personas que quieres medir altura : ");
                N = scan.nextInt();
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numero entero.");
                scan.nextLine();
            }
        }

        double[] alturas = new double[N];
        double sumaAlturas = 0;
        double alturaMinima = 0;
        double alturaMaxima = 0;

        //Mediante un bucle for recorremos el array y pedimos la altura de la persona
        for (int i = 0; i < N; i++) {
            try {
                System.out.print("Introduce la altura de la persona  " + (i + 1)+ " en metros:");
                alturas[i] = scan.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un numeromero.");
                scan.nextLine();
                i--;
            }
        }

        /*
        Con este bucle for vamos a comprobar recorriendo todas las personas cual es la mas baja, la más alta y
        la media, el Math.min y Math.max sacado de video de YouTube haciendo ejercicios de repaso que habia uno
        que era parecido
         */

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

        /*
        Mediante este bucle for vamos a almacenar el numero de personas que estan por encima de la media y las que
        estan por debajo
         */
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
