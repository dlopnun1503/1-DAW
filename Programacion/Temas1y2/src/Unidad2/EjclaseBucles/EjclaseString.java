package Unidad2.EjclaseBucles;

import java.util.Scanner;

public class EjclaseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        // Declaramos un string
        String mensajePresentacion = "";

        //Pedirle el nombre al usuario
        String nombre = "";
        System.out.println("Dime tu nombre: ");
        nombre = scan.next();

        mensajePresentacion = "Hola mi nombre es " +nombre;
        System.out.println(mensajePresentacion);

//Continuamos con la edad
        int edad;
        System.out.println("Dime tu edad: ");
        edad = scan.nextInt();

        mensajePresentacion = mensajePresentacion+ " y tengo " +edad+ " anios";
        System.out.println(mensajePresentacion);


// Continuamos con la localizCION

        String localizacion = "";
        System.out.println("Dime tu localiacion: ");
        localizacion = scan.next();

        mensajePresentacion = mensajePresentacion+ " y soy de " + localizacion;
        System.out.println(mensajePresentacion);

        //Declarar dos variables
        String cadena1 = "Hola";
        String cadena2 = "Adios";

        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        if (cadena1.equals("hola")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }

        if (cadena1.equals("Hola")) {
            System.out.println("Son iguales");
        } else {
            System.out.println("Son distintas");
        }
    }
}
