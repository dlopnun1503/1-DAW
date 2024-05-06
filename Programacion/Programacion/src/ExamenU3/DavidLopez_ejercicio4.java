package ExamenU3;

import java.util.Scanner;

public class DavidLopez_ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                // Pedir al usuario un DNI
                System.out.print("Introduce un DNI: ");
                String dni = scanner.nextLine();

                // Comprobamos la longitud del DNI
                if (dni.length() == 9) {
                    char ultimaLetra = dni.charAt(dni.length() - 1);

                    // Comprobar si el ultimo caracter es una letra
                    if (dni.length()-1 == 'a' || dni.length()-1 ==  'A') {
                        System.out.println("El DNI es valido.");
                    } else if (dni.length()-1 == 'B' || dni.length()-1 ==  'b') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'C' || dni.length()-1 ==  'c') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'D' || dni.length()-1 ==  'd') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'E' || dni.length()-1 ==  'e') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'F' || dni.length()-1 ==  'f') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'G' || dni.length()-1 ==  'g') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'H' || dni.length()-1 ==  'h') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'I' || dni.length()-1 ==  'i') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'J' || dni.length()-1 ==  'j') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'L' || dni.length()-1 ==  'l') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'M' || dni.length()-1 ==  'm') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'N' || dni.length()-1 ==  'n') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'O' || dni.length()-1 ==  'o') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'P' || dni.length()-1 ==  'p') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'Q' || dni.length()-1 ==  'q') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'R' || dni.length()-1 ==  'r') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'S' || dni.length()-1 ==  's') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'T' || dni.length()-1 ==  't') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'U' || dni.length()-1 ==  'u') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'V' || dni.length()-1 ==  'v') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'X' || dni.length()-1 ==  'x') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'Y' || dni.length()-1 ==  'y') {
                        System.out.println("El DNI es valido.");
                    }else if (dni.length()-1 == 'Z' || dni.length()-1 ==  'z') {
                        System.out.println("El DNI es valido.");
                    } else {
                        System.out.println(" El ultimo caracter tiene que ser una letra.");
                    }
                } else {
                    System.out.println("Error: La longitud del DNI debe ser de 9 caracteres.");
                }

            } catch (Exception e) {
                System.out.println("Se produjo un error");
            }
        }

    }
}


