package TEMA4.ProyectoPokemon.Utils;

import TEMA4.ProyectoPokemon.Clases.Tipo;

public class Pokedex {


    /**
     * Listado de los tipos de pokemons
     */
    private static String[] tiposAceptados = {"Acero", "Agua", "Bicho", "Dragon", "Electrico", "Fantasma", "Fuego", "Hada",
            "Hielo", "Lucha", "Normal", "Planta", "Psiquico", "Roca", "Siniestro", "Tierra", "Veneno", "Volador"};


    // **********CONSTRUCTORES DE CLASE************

    // **********METODOS DE CLASE************

    /**
     * Metodo que comprueba si el tipo del pokemon existe
     * @param nombreTipo
     * @return true - si el tipo existe y false - si el tipo no existe
     */
    public static boolean checkTipoExiste (String nombreTipo){
        //Comprueba si el tipo existe

        boolean tipoExiste = false;
        for (int i = 0; i <= tiposAceptados.length-1; i++){
            if (nombreTipo.equals(tiposAceptados[i])) {
                tipoExiste = true;
            }
        }
        return false;
    }

    /**
     * Metodo que comprueba la efectividad del ataque
     * @param tipoAtaque
     * @param tipoRecibeAtaque
     * @return Modificador de danio
     */
    public static double checkEfectividad (Tipo tipoAtaque, Tipo tipoRecibeAtaque) {
        // Comprueba la efectividad del ataque entre los pokemon
        // Devuelve el modificador de danio (0, 1, 1.5 o 0)

        if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[0]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[1]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[2]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 0.5;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[3]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[4]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.5;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[5]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.5;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[6]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 0.5;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[7]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 0.5;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[8]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.5;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.5;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return .0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[9]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 0.5;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[10]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[11]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 0.5;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[12]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 0.5;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[13]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.5;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[14]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.5;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[15]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[16]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }


        if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[0])){
            return 1.0;
        } else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[1])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[2])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[3])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[4])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[5])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[6])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[7])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[8])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[9])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[10])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[11])) {
            return 1.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[12])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[13])) {
            return 0.5;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[14])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[15])) {
            return 0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[16])) {
            return 1.0;
        }else if (tipoAtaque.nombre.equals(tiposAceptados[17]) && tipoRecibeAtaque.nombre.equals(tiposAceptados[17])) {
            return 1.0;
        }

        return 1.0;
    }
}
