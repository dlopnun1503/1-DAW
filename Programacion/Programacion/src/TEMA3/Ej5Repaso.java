package TEMA3;
import java.util.Scanner;

public class Ej5Repaso {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario una cadena de texto
            System.out.print("Introduce una cadena de texto: ");
            String input = scanner.nextLine();

            // Crear un array de caracteres con todas las posiciones inicializadas a 0
            int[] frecuenciaLetras = new int[256]; // Asume caracteres ASCII

            // Contar la frecuencia de cada letra en la cadena
            for (int i = 0; i < input.length(); i++) {
                char letra = input.charAt(i);
                frecuenciaLetras[letra]++;
            }

            // Mostrar las letras distintas de la cadena
            System.out.print("Letras presentes en la cadena: [");
            for (int i = 0; i < frecuenciaLetras.length; i++) {
                if (frecuenciaLetras[i] > 0) {
                    System.out.print((char) i + ", ");
                }
            }
            System.out.println("]");

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Se intentÃ³ acceder a una posiciÃ³n del array que no existe.");
        }
    }

}
