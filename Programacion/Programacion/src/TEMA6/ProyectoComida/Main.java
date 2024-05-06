package TEMA6.ProyectoComida;

import TEMA6.ProyectoComida.Clases.api.Comida;
import TEMA6.ProyectoComida.Clases.impl.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int energia = 100;

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                    1. Programacion
                    2. Base de Datos
                    3. Sistemas
                    4. EEDD
                    
                    5. Hueso
                    6. Lentejas
                    7. Salchicha
                    
                    8. Llegas Tarde
                    9. ShutDownPC
                    10.Parte
                    0. Salir
                    """);
        int opc = 1;


        while (opc != 0) {
            opc = scan.nextInt();
            switch (opc) {
                case 1:
                    energia = energia - 20;
                    break;
                case 2:
                    energia = energia - 25;
                    break;
                case 3:
                    energia = energia - 50;
                    break;
                case 4:
                    energia = energia - 30;
                    break;
                case 5:
                    Hueso hueso = new Hueso();
                    energia = energia + hueso.addNutricion();
                    break;
                case 6:
                    Lentejas lentejas = new Lentejas(false);
                    energia = energia + lentejas.addNutricion();
                    break;
                case 7:
                    Salchicha salchicha = new Salchicha();
                    energia = energia + salchicha.addNutricion();
                    break;
                case 8:
                    LlegasTarde LT = new LlegasTarde();
                    energia = energia + LT.reduceEnergia();
                    break;
                case 9:
                    ShutDownPC PC = new ShutDownPC();
                    energia = energia + PC.reduceEnergia();
                    break;
                case 10:
                    Parte parte = new Parte("Leve");
                    energia = energia + parte.reduceEnergia();
                    break;
                case 0:
                    System.out.println("Saliendo....");
                    break;
            }
            System.out.println("Indique la opcion: ");
            System.out.println("Energia disponible: " + energia);
            if (energia <= 0) {
                System.out.println("Has muerto de cansancio ya no puedes realizar mas actividades aunque quieras");
            } else {
                System.out.println("Sigues vivo");
            }
        }

    }
}
