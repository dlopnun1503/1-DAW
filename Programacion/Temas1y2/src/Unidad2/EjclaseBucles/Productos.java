package Unidad2.EjclaseBucles;

import java.util.Scanner;

public class Productos {
    public static void main(String[] args) {
        String contra = "12345";
        String a = "";
        String user = "admin";
        String b;
        String c = "cafe";
        String d = "Seguir durmiendo";
        String e = "Agua";
        String f = "Colacao";
        String g = "Salir";
        int productos = 0;
        int DeseaAlgoMas = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Pon el usuario: ");
        b = scan.next();


        while (!b.equals(user)) {
            System.out.println("Ponlo de nuevo: ");
            b = scan.next();
        }


        System.out.println("Pon la contrasenia: ");
        a = scan.next();


        while (!a.equals(contra)) {
            System.out.println("Ponla de nuevo : ");
            a = scan.next();
        }


        System.out.println("Si quiere café seleccione 1");
        System.out.println("Si quiere dormir seleccione 2");
        System.out.println("Si quiere agua seleccione 3");
        System.out.println("Si quiere colacao seleccione 4");
        System.out.println("Si quiere salir seleccione 0");
        System.out.println("Selecciona producto: ");
        productos = scan.nextInt();

        if (productos == 1) {
            System.out.println("Has seleccionado café");
        } else if (productos == 2) {
            System.out.println("Has seleccionado Seguir durmiendo");
        } else if (productos == 3) {
            System.out.println("Has seleccionado agua");
        } else if (productos == 4) {
            System.out.println("Has seleccionado colacao");
        } else if (productos == 0) {
            System.out.println("Saliendo");
        }

        while (productos != 0) {
            System.out.println("Si desea algo más pulse 9 sino pulse 0: ");
            DeseaAlgoMas = scan.nextInt();
        }

        if (productos == 0) {
            System.out.println("Saliendo");
        }


    }
}
