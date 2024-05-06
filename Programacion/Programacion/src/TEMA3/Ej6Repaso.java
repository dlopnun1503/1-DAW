package TEMA3;
import java.util.Scanner;

public class Ej6Repaso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Pedir al usuario un DNI
            System.out.print("Introduce un DNI: ");
            String dni = scanner.nextLine();

            // Comprobar la longitud del DNI
            if (dni.length() == 9) {
                // Obtener el Ãºltimo carÃ¡cter del DNI
                char ultimaLetra = dni.charAt(dni.length() - 1);

                // Comprobar si el Ãºltimo carÃ¡cter es una letra
                if (Character.isLetter(ultimaLetra)) {
                    System.out.println("El DNI es vÃ¡lido.");
                } else {
                    System.out.println("Error: El Ãºltimo carÃ¡cter del DNI debe ser una letra.");
                }
            } else {
                System.out.println("Error: La longitud del DNI debe ser de 9 caracteres.");
            }

        } catch (Exception e) {
            System.out.println("Error: Se produjo una excepciÃ³n.");
        }
    }

}
