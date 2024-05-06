package Unidad1.Actividad01;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {

/*
        Necesitamos calcular área de un cuadrado
        Tenemos la fórmula, el área de un cuadrado es lado*lado
        Neceitamos el valor para el  lado
        Usaremos variables de tipo numérico entero
        */

        // Pedimos un número para el diametro
        int l;
        Scanner scan = new Scanner(System.in);
        System.out.print("Dame un valor para l: ");
        l = scan.nextInt();
        int area = l * l;
        System.out.println("El area del cuadrado es "+area);



    }
}
