package TEMA4.EjEntregarPokemon;

import TEMA4.EjEntregarPokemon.ClasesPokemon.Pokedex;

public class MainPokemon {
    public static void main(String[] args) {

        String Pokemon1 = "charmander";
        String Pokemon2 = "bulbasur";

        double vidaPokemon1 = 150.0;
        double vidaPokemon2 = 100.0;

        double fuerzaPokemon1 = 30.0;
        double fuerzaPokemon2 = 10.0;

        String tipoPokemon1 = "Fuego";
        String tipoPokemon2 = "Agua";

        String pokemonGanador = "";

        if (Pokedex.checkPokemon(Pokemon1) && Pokedex.checkPokemon(Pokemon2)) {
            while (vidaPokemon2 > 0 && vidaPokemon1 > 0) {
                double ataquePokemon1 = fuerzaPokemon1 * Pokedex.checkEfectividad(tipoPokemon1, tipoPokemon2);
                vidaPokemon2 = vidaPokemon2 - ataquePokemon1;
                System.out.println("La vida de charmander es: " +vidaPokemon1);
                double ataquePokemon2 = fuerzaPokemon2 * Pokedex.checkEfectividad(tipoPokemon2, tipoPokemon1);
                vidaPokemon1 = vidaPokemon1 - ataquePokemon2;
                System.out.println("La vida de bulbasur es: " +vidaPokemon2);
            }
            if (vidaPokemon1 <= 0){
                pokemonGanador = Pokemon2;
            }
            if (vidaPokemon2 <= 0){
                pokemonGanador = Pokemon1;
            }
        }  else {
            System.out.println("Algun pokemon es incorrecto");
        }
        System.out.println("El ganador es " +pokemonGanador);
    }
}
