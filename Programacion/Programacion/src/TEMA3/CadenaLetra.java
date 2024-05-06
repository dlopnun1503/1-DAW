package TEMA3;

public class CadenaLetra {
    public static void main(String[] args) {

        /**
         * Vamos ha hacer un programa que dado un string cuente cuantas vocales de cada tipo tiene
         *
         * Ejemplo
         * String cadena = "Hola Mundo"
         * Tiene una a
         * Tiene cero e
         * Tiene cero i
         * Tiene 2 o
         * Tiene una u
         */

        String cadena = "Hostia tio. Un f****ng murcielagoOoOoOO";
        int cantidadA = 0;
        int cantidadE = 0;
        int cantidadI = 0;
        int cantidadO = 0;
        int cantidadU = 0;


        for (int j = 0; j <= cadena.length() - 1; j++) {
            if (cadena.charAt(j) == 'a' || cadena.charAt(j) == 'A') {
                cantidadA++;
            } else if (cadena.charAt(j) == 'e' || cadena.charAt(j) == 'B') {
                cantidadE++;
            } else if (cadena.charAt(j) == 'i' || cadena.charAt(j) == 'I') {
                cantidadI++;
            } else if (cadena.charAt(j) == 'o' || cadena.charAt(j) == 'O') {
                cantidadO++;
            } else if (cadena.charAt(j) == 'u' || cadena.charAt(j) == 'U') {
                cantidadU++;
            }
        }
        System.out.println("La cantidad de A es: " +cantidadA);
        System.out.println("La cantidad de E es: " +cantidadE);
        System.out.println("La cantidad de I es: " +cantidadI);
        System.out.println("La cantidad de O es: " +cantidadO);
        System.out.println("La cantidad de U es: " +cantidadU);


    }
}


