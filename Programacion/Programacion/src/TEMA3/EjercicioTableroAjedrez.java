package TEMA3;

public class EjercicioTableroAjedrez {
    public static void main(String[] args) {
        /**
         * 1º CUANTAS FILAS * COLUMNAS TIENE UN TABLERO DE AJEDREZ
         * 2º DECLARAR UN ARRAY BIDIMENSIONAL DE 8*8
         * 3º LLENAR EL TABLERO CON LAS POSICIONES DE CADA FICHA
         * 4º RECORRE EL TABLERO Y QUE SALGA BIEN
         */

        char [][] ajedrez = new char[8][8];

        ajedrez [0][0] = 'T';
        ajedrez [0][1] = 'C';
        ajedrez [0][2] = 'A';
        ajedrez [0][3] = 'Q';
        ajedrez [0][4] = 'K';
        ajedrez [0][5] = 'A';
        ajedrez [0][6] = 'C';
        ajedrez [0][7] = 'T';

        ajedrez [1][0] = 'P';
        ajedrez [1][1] = 'P';
        ajedrez [1][2] = 'P';
        ajedrez [1][3] = 'P';
        ajedrez [1][4] = 'P';
        ajedrez [1][5] = 'P';
        ajedrez [1][6] = 'P';
        ajedrez [1][7] = 'P';

        ajedrez [2][0] = ' ';
        ajedrez [2][1] = ' ';
        ajedrez [2][2] = ' ';
        ajedrez [2][3] = ' ';
        ajedrez [2][4] = ' ';
        ajedrez [2][5] = ' ';
        ajedrez [2][6] = ' ';
        ajedrez [2][7] = ' ';

        ajedrez [3][0] = ' ';
        ajedrez [3][1] = ' ';
        ajedrez [3][2] = ' ';
        ajedrez [3][3] = ' ';
        ajedrez [3][4] = ' ';
        ajedrez [3][5] = ' ';
        ajedrez [3][6] = ' ';
        ajedrez [3][7] = ' ';

        ajedrez [4][0] = ' ';
        ajedrez [4][2] = ' ';
        ajedrez [4][3] = ' ';
        ajedrez [4][4] = ' ';
        ajedrez [4][5] = ' ';
        ajedrez [4][6] = ' ';
        ajedrez [4][7] = ' ';

        ajedrez [5][0] = ' ';
        ajedrez [5][1] = ' ';
        ajedrez [5][2] = ' ';
        ajedrez [5][3] = ' ';
        ajedrez [5][4] = ' ';
        ajedrez [5][5] = ' ';
        ajedrez [5][6] = ' ';
        ajedrez [5][7] = ' ';

        ajedrez [6][0] = 'P';
        ajedrez [6][1] = 'P';
        ajedrez [6][2] = 'P';
        ajedrez [6][3] = 'P';
        ajedrez [6][4] = 'P';
        ajedrez [6][5] = 'P';
        ajedrez [6][6] = 'P';
        ajedrez [6][7] = 'P';

        ajedrez [7][0] = 'T';
        ajedrez [7][1] = 'C';
        ajedrez [7][2] = 'A';
        ajedrez [7][3] = 'Q';
        ajedrez [7][4] = 'K';
        ajedrez [7][5] = 'A';
        ajedrez [7][6] = 'C';
        ajedrez [7][7] = 'T';

        for (int i = 0; i <= ajedrez.length-1; i++){
            System.out.println(ajedrez[i]);
        }




    }
}
