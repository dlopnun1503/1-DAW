package Unidad1.Actividad01;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        /*
        Necesitamos calcular la hipotenusa de un triángulo
        Tenemos la fórmula, la hipotenusa se calcula h^2 = a^2 + b^2
        Neceitamos el valor de ambos catetos
        Usaremos variables de tipo numérico entero
        */


        // Pedimos un número para cada cateto
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un valor para a: ");
        a = scan.nextInt();


        int b;
        Scanner s = new Scanner(System.in);
        System.out.print("Dame un valor para b: ");
        b = s.nextInt();

        int h = (a*a) + (b*b);
        double h1 = Math.sqrt(h);

        System.out.println("El valor de la hipotenusa es "+h1);




    }
}
