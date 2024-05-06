package Unidad2.EjclaseBucles;

import java.util.Scanner;

public class LoginContrasenia {
    public static void main(String[] args) {

        /**
         * Hacer un programa que lea una contraseña dada por el usuario
         * y que la compare con la contraseña en sí
         * Si la contraseña coincide se permite el acceso
         * Si no coincide, mostrar acceso denegado
         * La contraseña es: 1234567890
         */

       /* String contr = "1234567890";

        String contrasenia = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Pon la contrasenia: ");
        contrasenia = scan.next();

        if (contrasenia.equals(contr)) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        */

        //Pedir contraseña hasta que la ponga

        String contra = "12345";
        String a = "";
        String user = "admin";
        String b;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pon el usuario: ");
        b = scan.next();


            while (!b.equals(user)) {
                System.out.println("Ponlo de nuevo: ");
                b = scan.next();
            }

            if (b.equals(user)) {
                System.out.println("Pon la contrasenia: ");
                a = scan.next();
            }

            while (!a.equals(contra)) {
                System.out.println("Ponla de nuevo : ");
                a = scan.next();
            }

            if (a.equals(contra)) {
                System.out.println("Acceso permitido");
            }




    }
}
