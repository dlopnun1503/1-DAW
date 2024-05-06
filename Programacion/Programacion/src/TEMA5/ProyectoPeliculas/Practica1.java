package TEMA5.ProyectoPeliculas;

import TEMA5.ProyectoPeliculas.Clases.Pelicula;
import TEMA5.ProyectoPeliculas.Utils.JsonReaderUtil;

import java.util.ArrayList;
import java.util.Scanner;

public class Practica1 {
    public static void menu() {

        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);

        Scanner scan1 = new Scanner(System.in);
        int menu ;
        System.out.println("""
                1. Ordenar de mayor a menor
                2. Ordenar de menor a mayor
                3. Mostrar peliculas desde los 2000 hasta ahora
                4. Mostrar peliculas desde los 2000 hasta ahora con mÃ¡s nota de 8.8
                5. Mostrar peliculas desde los 2000 hasta ahora con mÃ¡s nota de la que desees
                6. Mostrar por pantalla la pelicula que desees
                7. Mostrar por pantalla las peliculas del director que desees
                0. Salir
                
                SELECCIONE: 
                
                """);
        menu = scan1.nextInt();

        //Mostrar las peliculas de mayor a menor nota
        //Recorremos el ArrayList para ordenar de mayor a menor
        if (menu == 1) {
            for (int i = 0; i < peliculas.size(); i++) {
                for (int j = 0; j < peliculas.size() - i - 1; j++) {
                    if (Double.parseDouble(peliculas.get(j + 1).getImDbRating())
                            > Double.parseDouble(peliculas.get(j).getImDbRating())) {
                        Pelicula peli = peliculas.get(j + 1);
                        peliculas.set(j + 1, peliculas.get(j));
                        peliculas.set(j, peli);
                    }
                }
            }


            //Recorremos el ArrayList para mostrar por pantalla el orden mediante el nombre y nota
            for (int i = 0; i < peliculas.size(); i++) {
                System.out.println(peliculas.get(i).getFullTitle() + " cuya nota es: " + peliculas.get(i).getImDbRating());
            }
        }


        //Mostrar las peliculas de menor a mayor nota
        //Recorremos el ArrayList para ordenar de menor a mayor
        if (menu == 2) {
            for (int i = 0; i < peliculas.size(); i++) {
                for (int j = 0; j < peliculas.size() - i - 1; j++) {
                    if (Double.parseDouble(peliculas.get(j + 1).getImDbRating())
                            < Double.parseDouble(peliculas.get(j).getImDbRating())) {
                        Pelicula peli = peliculas.get(j + 1);
                        peliculas.set(j + 1, peliculas.get(j));
                        peliculas.set(j, peli);
                    }
                }
            }

            //Recorremos el ArrayList para mostrar por pantalla el orden mediante el nombre y nota
            for (int i = 0; i < peliculas.size(); i++) {
                System.out.println(peliculas.get(i).getFullTitle() + " cuya nota es: " + peliculas.get(i).getImDbRating());
            }
        }


        //Imprimir las pelÃ­culas cuyo aÃ±o de publicaciÃ³n sea del 2000 hasta la actualidad
        if (menu == 3) {
            System.out.println("PELICULAS DE DESPUES DE LOS 2000");
            //Recorremos el ArrayList para ver las peliculas que cumplan con las condiciones
            for (int i = 0; i < peliculas.size(); i++) {
                if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000) {
                    System.out.println("- " + peliculas.get(i).getFullTitle());
                }
            }
        }


        //Imprimir las pelÃ­culas cuyo aÃ±o de publicaciÃ³n sea del 2000 hasta la actualidad que tengan una nota por
        //encima de 8.8 (incluÃ­do)
        if (menu == 4) {
            System.out.println("PELICULAS DE DESPUES DE LOS 2000 con nota de  8.8 hacia arriba");
            //Recorremos el ArrayList para ver las peliculas que cumplan con las condiciones
            for (int i = 0; i < peliculas.size(); i++) {
                if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000 && Double.parseDouble(peliculas.get(i).getImDbRating()) >= 8.8) {
                    System.out.println("- " + peliculas.get(i).getFullTitle() + " cuya nota es " + peliculas.get(i).getImDbRating() + " y reparto: " + peliculas.get(i).getCrew());
                }
            }
        }

        //Imprimir las pelÃ­culas cuyo aÃ±o de publicaciÃ³n sea del 2000 hasta la actualidad que tengan una nota por
        // encima de una nota que diga el usuario por teclado
        if (menu == 5) {
            //Pedimos al usuario una nota
            System.out.println("PELICULAS DE DESPUES DE LOS 2000 con nota por encima de usuario");
            Scanner scan = new Scanner(System.in);
            System.out.println("Dime una nota de pelicula: ");
            //Recorremos el ArrayList para ver las peliculas que cumplan con las condiciones
            double nota = scan.nextDouble();
            scan.nextLine();
            boolean hayPeliculas = false;
            for (int i = 0; i < peliculas.size(); i++) {
                if (Integer.parseInt(peliculas.get(i).getYear()) >= 2000 && Double.parseDouble(peliculas.get(i).getImDbRating()) > nota) {
                    hayPeliculas = true;
                    System.out.println("- " + peliculas.get(i).getFullTitle() + " cuya nota es " + peliculas.get(i).getImDbRating() + " y reparto: " + peliculas.get(i).getCrew());
                }
            }

            if (hayPeliculas == false) {
                System.out.println("No hay peliculas con tanta nota");
            }
        }



        //Imprimir por pantalla una pelÃ­cula que el usuario introduce por teclado.
        if (menu == 6) {
            String peli;
            Scanner scan = new Scanner(System.in);

            System.out.print("Dime el nombre de una pelicula: ");
            peli = scan.nextLine();
            boolean estaPeli = false;
            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).getTitle().equals(peli)) {
                    estaPeli = true;
                    System.out.println("- " + peliculas.get(i).getFullTitle() + " cuya nota es " + peliculas.get(i).getImDbRating() + ", reparto: " + peliculas.get(i).getCrew() + " y posicion " + peliculas.get(i).getRank());
                }
            }
            if (estaPeli == false) {
                System.out.println("Esa pelicula no se encuentra en el Top");

            }
        }


        //Imprimir por pantalla las peliculas de un director que el usuario introduce por teclado.
        if (menu == 7) {
            String director;
            Scanner scan = new Scanner(System.in);
            System.out.print("Dime el nombre de un director: ");
            director = scan.nextLine();
            boolean estaDir = false;
            ArrayList<Pelicula> peliculasDir = new ArrayList<Pelicula>();
            for (int i = 0; i < peliculas.size(); i++) {
                if (peliculas.get(i).getCrew().contains(director)) {
                    peliculasDir.add(peliculas.get(i));
                    estaDir = true;
                }
            }
            if (estaDir == false) {
                System.out.println("Director no encontrado");

            }
            for (int i = 0; i < peliculasDir.size(); i++) {
                System.out.println("Peliculas protagonizadas por " + director);
                System.out.println("\t- " + peliculasDir.get(i).getFullTitle());
            }
        }

        if (menu == 0) {
            System.out.println("SALIENDO");
        }








    }
}

