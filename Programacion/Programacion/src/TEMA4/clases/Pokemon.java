package TEMA4.clases;

import java.util.Scanner;

public class Pokemon {

    //Variable global
    static String pikachu = "pikachu";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un pokemon: ");
        String pokemonUser = scan.next();

        boolean pokemonEsvalido = false;
        pokemonEsvalido = esValido(pokemonUser);

        if (pokemonEsvalido == true) {
            System.out.println("Pika");
        }else{
            System.out.println("No Pika");
        }

    }

    /**
     * Metodo que comprueba si el pokemon es pikachu
     * @param pokemon
     * @return
     */
    public static boolean esValido (String pokemon) {
        if (pokemon.equals(pikachu)) {
            return true;
        }else {
            return false;
        }

    }

    public static void setRaichu (String nombreRaichu) {
        pikachu = nombreRaichu;
    }
}
