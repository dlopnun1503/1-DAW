package TEMA4.EjEntregarPokemon.ClasesPokemon;

public class Pokedex {

    private static String[] Pokemons = {"oddish", "bulbasur", "charmander", "ludicolo", "vaporeon", "charizard"};


    /**
     * Metodo para comprobar si el pokemon es correcto
     * @param pokemon
     * @return
     */

    public static boolean checkPokemon (String pokemon){
        boolean pokemonCorrecto = false;
        for (int i = 0; i <= Pokemons.length-1; i++){
            if (pokemon.equals(Pokemons[i])) {
                pokemonCorrecto = true;
            }
        }
    return pokemonCorrecto;
    }

    /**
     * Metodo que comprueba la efectividad de un tipo de pokemon frente a otro tipo
     * @param TipoA
     * @param TipoR
     * @return
     */
    public static double checkEfectividad (String TipoA, String TipoR){
        String Tipo1 = "Fuego";
        String Tipo2 = "Agua";
        String Tipo3 = "Planta";

        if (TipoA.equals(Tipo1) && TipoR.equals(Tipo3)){
            return 1.5;
        } else if (TipoA.equals(Tipo1) && TipoR.equals(Tipo2)) {
            return 0.5;
        } else if (TipoA.equals(Tipo1) && TipoR.equals(Tipo1)) {
            return 0.5;
        }


        if (TipoA.equals(Tipo2) && TipoR.equals(Tipo3)){
            return 1.0;
        } else if (TipoA.equals(Tipo2) && TipoR.equals(Tipo2)) {
            return 0.5;
        } else if (TipoA.equals(Tipo2) && TipoR.equals(Tipo1)) {
            return 1.5;
        }


        if (TipoA.equals(Tipo3) && TipoR.equals(Tipo3)){
            return 0.5;
        } else if (TipoA.equals(Tipo3) && TipoR.equals(Tipo2)) {
            return 1.0;
        } else if (TipoA.equals(Tipo3) && TipoR.equals(Tipo1)) {
            return 0.5;
        }
        return 1.0;


    }








}
