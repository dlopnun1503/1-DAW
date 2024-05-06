package Unidad1;

import java.util.Scanner;

public class Ejclase3 {
    public static void main(String[] args) {
        /* Lea por teclado la edad de una persona
        Si tiene más de 100 años, decir "No veas socio"
        Si tiene más de 150 años decir "Mentira"
        Si tiene edad negativa decir "Edad incorrecta"
        Si tiene entre 0 y 100 decir "Tiene X años"
         */
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.println("¿Cuantos años tienes?: ");
        a = scan.nextInt();


        if (a > 100) {
            if (a < 150) {
                System.out.println("No veas socio");
            }
        }

        if (a > 150) {
            System.out.println("Mentira");
        }

        if (a < 0) {
            System.out.println("Edad incorrecta");
        }

        if (a >= 0) {
            if (a <= 100){
                System.out.println("Tiene " + a + "años");
            }
        }
    }
}