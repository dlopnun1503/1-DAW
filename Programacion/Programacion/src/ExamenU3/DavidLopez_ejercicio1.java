package ExamenU3;

import java.util.Scanner;

public class DavidLopez_ejercicio1 {
    public static void main(String[] args) {
        //Inicializamos un array bidimensional rellenando sus posiciones con "__"

        String[][] cine = new String[10][10];

        cine[0][0] = "__";
        cine[0][1] = "__";
        cine[0][2] = "__";
        cine[0][3] = "__";
        cine[0][4] = "__";
        cine[0][5] = "__";
        cine[0][6] = "__";
        cine[0][7] = "__";
        cine[0][8] = "__";
        cine[0][9] = "__";

        cine[1][0] = "__";
        cine[1][1] = "__";
        cine[1][2] = "__";
        cine[1][3] = "__";
        cine[1][4] = "__";
        cine[1][5] = "__";
        cine[1][6] = "__";
        cine[1][7] = "__";
        cine[1][8] = "__";
        cine[1][9] = "__";

        cine[2][0] = "__";
        cine[2][1] = "__";
        cine[2][2] = "__";
        cine[2][3] = "__";
        cine[2][4] = "__";
        cine[2][5] = "__";
        cine[2][6] = "__";
        cine[2][7] = "__";
        cine[2][8] = "__";
        cine[2][9] = "__";

        cine[3][0] = "__";
        cine[3][1] = "__";
        cine[3][2] = "__";
        cine[3][3] = "__";
        cine[3][4] = "__";
        cine[3][5] = "__";
        cine[3][6] = "__";
        cine[3][7] = "__";
        cine[3][8] = "__";
        cine[3][9] = "__";

        cine[4][0] = "__";
        cine[4][1] = "__";
        cine[4][2] = "__";
        cine[4][3] = "__";
        cine[4][4] = "__";
        cine[4][5] = "__";
        cine[4][6] = "__";
        cine[4][7] = "__";
        cine[4][8] = "__";
        cine[4][9] = "__";

        cine[5][0] = "__";
        cine[5][1] = "__";
        cine[5][2] = "__";
        cine[5][3] = "__";
        cine[5][4] = "__";
        cine[5][5] = "__";
        cine[5][6] = "__";
        cine[5][7] = "__";
        cine[5][8] = "__";
        cine[5][9] = "__";

        cine[6][0] = "__";
        cine[6][1] = "__";
        cine[6][2] = "__";
        cine[6][3] = "__";
        cine[6][4] = "__";
        cine[6][5] = "__";
        cine[6][6] = "__";
        cine[6][7] = "__";
        cine[6][8] = "__";
        cine[6][9] = "__";

        cine[7][0] = "__";
        cine[7][1] = "__";
        cine[7][2] = "__";
        cine[7][3] = "__";
        cine[7][4] = "__";
        cine[7][5] = "__";
        cine[7][6] = "__";
        cine[7][7] = "__";
        cine[7][8] = "__";
        cine[7][9] = "__";

        cine[8][0] = "__";
        cine[8][1] = "__";
        cine[8][2] = "__";
        cine[8][3] = "__";
        cine[8][4] = "__";
        cine[8][5] = "__";
        cine[8][6] = "__";
        cine[8][7] = "__";
        cine[8][8] = "__";
        cine[8][9] = "__";

        cine[9][0] = "__";
        cine[9][1] = "__";
        cine[9][2] = "__";
        cine[9][3] = "__";
        cine[9][4] = "__";
        cine[9][5] = "__";
        cine[9][6] = "__";
        cine[9][7] = "__";
        cine[9][8] = "__";
        cine[9][9] = "__";

        // Mostarmos el menú

        int entradaSalir;
        int comprarmas = 0;
        int numEntradas = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1- COMPRAR ENTRADAS");
        System.out.println("0- SALIR");
        System.out.println("Que desea: ");
        entradaSalir = scan.nextInt();

        if (entradaSalir == 1){
            System.out.println("Para comprar más pulse 2 sino saldrá automaticamente: ");
            comprarmas = scan.nextInt();
        }if (comprarmas == 2){
            System.out.println("Cuantas quieres en total: ");
            numEntradas = scan.nextInt();
        }else{
            System.out.println("SALIENDO");
        }
        if (entradaSalir == 0){
            System.out.println("SALIENDO");
        }



    }
}
