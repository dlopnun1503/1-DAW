package TEMA4.ProyectoPokemon;

import TEMA4.ProyectoPokemon.Clases.Ataque;
import TEMA4.ProyectoPokemon.Clases.Pokemon;
import TEMA4.ProyectoPokemon.Clases.Tipo;
import TEMA4.ProyectoPokemon.Utils.Pokedex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tipo fuego = new Tipo("Fuego");
        Tipo planta = new Tipo("Planta");
        Tipo agua = new Tipo("Agua");
        Tipo electrico = new Tipo("Electrico");
        Tipo volador = new Tipo("Volador");
        Tipo normal = new Tipo("Normal");


        Pokemon pokemon1J1 = new Pokemon("Charmander", 39.0, fuego);
        Pokemon pokemon2J1 = new Pokemon("Bulbasur", 45.0, planta);
        Pokemon pokemon3J1 = new Pokemon("Squirtle", 44.0, agua);

        Pokemon pokemon1J2 = new Pokemon("Pikachu", 35.0, electrico);
        Pokemon pokemon2J2 = new Pokemon("Pidgey", 40.0, volador);
        Pokemon pokemon3J2 = new Pokemon("Rattata", 30.0, normal);

        Ataque ataque1 = new Ataque("Araniazo", normal, 9);
        Ataque ataque2 = new Ataque("Ascuas", fuego, 10);
        Ataque ataque3 = new Ataque("Golpe Garra", normal, 7);
        Ataque ataque4 = new Ataque("Gruñido", normal, 5);
        Ataque ataque5 = new Ataque("Placaje", normal, 5);
        Ataque ataque6 = new Ataque("Latigo cepa", planta, 7);
        Ataque ataque7 = new Ataque("Malicioso", normal, 9);
        Ataque ataque8 = new Ataque("Drenadoras", planta, 10);
        Ataque ataque9 = new Ataque("Pistola agua", agua, 7);
        Ataque ataque10 = new Ataque("Morisco", normal, 10);
        Ataque ataque11 = new Ataque("Cabezazo", normal, 9);
        Ataque ataque12 = new Ataque("Impactrueno", electrico, 6);
        Ataque ataque13 = new Ataque("Rafaga", normal, 4);
        Ataque ataque14 = new Ataque("Onda trueno", electrico, 5);
        Ataque ataque15 = new Ataque("Rayo", electrico, 7);
        Ataque ataque16 = new Ataque("Tornado", volador, 6);
        Ataque ataque17 = new Ataque("Picotazo", volador, 4);
        Ataque ataque18 = new Ataque("Giro rapido", normal, 3);
        Ataque ataque19 = new Ataque("Remolino", volador, 5);
        Ataque ataque20 = new Ataque("Ataque rapido", normal, 4);
        Ataque ataque21 = new Ataque("Hiperrayo", normal, 6);
        Ataque ataque22 = new Ataque("Foco energia", normal, 4);


        pokemon1J1.ataques = new Ataque[]{ataque1, ataque2, ataque3, ataque4};
        pokemon2J1.ataques = new Ataque[]{ataque5, ataque6, ataque7, ataque8};
        pokemon3J1.ataques = new Ataque[]{ataque5, ataque9, ataque10, ataque11};
        pokemon1J2.ataques = new Ataque[]{ataque12, ataque13, ataque14, ataque15};
        pokemon2J2.ataques = new Ataque[]{ataque16, ataque17, ataque18, ataque19};
        pokemon3J2.ataques = new Ataque[]{ataque5, ataque20, ataque21, ataque22};


        Pokemon[] equipo1 = {pokemon1J1, pokemon2J1, pokemon3J1};
        Pokemon[] equipo2 = {pokemon1J2, pokemon2J2, pokemon3J2};

        int opcionP1J1;
        int opcionP2J1;
        int opcionP3J1;
        int opcionP1J2;
        int opcionP2J2;
        int opcionP3J2;

        System.out.println("El equipo 1 está formado por " + equipo1[0].nombre + ", " + equipo1[1].nombre + " y " + equipo1[2].nombre);

        System.out.println("El equipo 2 está formado por " + equipo2[0].nombre + ", " + equipo2[1].nombre + " y " + equipo2[2].nombre);

        int jugador1;
        int jugador2 = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Jugador 1 elija equipo: ");
            jugador1 = scan.nextInt();
        } while (jugador1 != 1 && jugador1 != 2);

        if (jugador1 == 1) {
            jugador2 = 2;
        } else if (jugador1 == 2) {
            jugador2 = 1;
        }
        System.out.println("El jugador 1 tendrá el equipo " + jugador1);
        System.out.println("El jugador 2 tendrá el equipo " + jugador2);





        while (pokemon1J1.vida > 0 && pokemon1J2.vida > 0) {
            for (int i = 0; i <= pokemon1J1.ataques.length - 1; i++) {
                System.out.println(pokemon1J1.ataques[i].nombre);
            }
            System.out.println("Elige un ataque para el pokemon 1 del equipo 1 : ");

            opcionP1J1 = scan.nextInt();

            for (int i = 0; i <= pokemon1J2.ataques.length - 1; i++) {
                System.out.println(pokemon1J2.ataques[i].nombre);
            }
            System.out.println("Elige un ataque para el pokemon 1 del equipo 2 : ");
            opcionP1J2 = scan.nextInt();


            pokemon1J2.vida = pokemon1J2.vida - (pokemon1J1.ataques[opcionP1J1].danio * Pokedex.checkEfectividad(pokemon1J1.ataques[opcionP1J1].tipo, electrico));
            System.out.println("La vida de " + pokemon1J2.nombre + " es: " + pokemon1J2.vida);
            pokemon1J1.vida = pokemon1J1.vida - (pokemon1J2.ataques[opcionP1J2].danio * Pokedex.checkEfectividad(pokemon1J1.ataques[opcionP1J2].tipo, fuego));
            System.out.println("La vida de " + pokemon1J1.nombre + " es: " + pokemon1J1.vida);
        }
        if (pokemon1J2.vida <= 0) {
            while (pokemon1J1.vida > 0 && pokemon2J2.vida > 0) {
                for (int i = 0; i <= pokemon1J1.ataques.length - 1; i++) {
                    System.out.println(pokemon1J1.ataques[i].nombre);
                }
                System.out.println("Elige un ataque para el pokemon 1 del equipo 1 : ");

                opcionP1J1 = scan.nextInt();

                for (int i = 0; i <= pokemon2J2.ataques.length - 1; i++) {
                    System.out.println(pokemon2J2.ataques[i].nombre);
                }
                System.out.println("Elige un ataque para el pokemon 2 del equipo 2 : ");
                opcionP2J2 = scan.nextInt();


                pokemon1J2.vida = pokemon2J2.vida - (pokemon1J1.ataques[opcionP1J1].danio * Pokedex.checkEfectividad(pokemon1J1.ataques[opcionP1J1].tipo, electrico));
                System.out.println("La vida de " + pokemon2J2.nombre + " es: " + pokemon2J2.vida);
                pokemon1J1.vida = pokemon1J1.vida - (pokemon1J2.ataques[opcionP2J2].danio * Pokedex.checkEfectividad(pokemon1J1.ataques[opcionP2J2].tipo, fuego));
                System.out.println("La vida de " + pokemon1J1.nombre + " es: " + pokemon1J1.vida);
            }
        }
        if (pokemon1J1.vida <= 0) {
            while (pokemon2J1.vida > 0 && pokemon1J2.vida > 0) {
                for (int i = 0; i <= pokemon2J1.ataques.length - 1; i++) {
                    System.out.println(pokemon2J1.ataques[i].nombre);
                }
                System.out.println("Elige un ataque para el pokemon 2 del equipo 1 : ");

                opcionP2J1 = scan.nextInt();

                for (int i = 0; i <= pokemon1J2.ataques.length - 1; i++) {
                    System.out.println(pokemon1J2.ataques[i].nombre);
                }
                System.out.println("Elige un ataque para el pokemon 1 del equipo 2 : ");
                opcionP1J2 = scan.nextInt();


                pokemon1J2.vida = pokemon2J2.vida - (pokemon1J1.ataques[opcionP2J1].danio * Pokedex.checkEfectividad(pokemon1J1.ataques[opcionP2J1].tipo, electrico));
                System.out.println("La vida de " + pokemon1J2.nombre + " es: " + pokemon1J2.vida);
                pokemon1J1.vida = pokemon1J1.vida - (pokemon1J2.ataques[opcionP1J2].danio * Pokedex.checkEfectividad(pokemon1J1.ataques[opcionP1J2].tipo, fuego));
                System.out.println("La vida de " + pokemon2J1.nombre + " es: " + pokemon2J1.vida);
            }
        }
    }

    }

