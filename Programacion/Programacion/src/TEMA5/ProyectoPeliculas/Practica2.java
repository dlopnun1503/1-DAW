package TEMA5.ProyectoPeliculas;

import TEMA5.ProyectoPeliculas.Clases.Pelicula;
import TEMA5.ProyectoPeliculas.Utils.JsonReaderUtil;
import TEMA5.ProyectoPeliculas.services.PeliculasService;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica2 {

    public static ArrayList<Pelicula> peliculas = null;

    public static void main(String[] args) {
        String pelisPath = "IMDB-api/Top250Movies.json";
        peliculas = JsonReaderUtil.loadJsonFile(pelisPath);

        /*
        Es hacer un menú para dar la opción de crear un nuevo registro
         */

        Scanner scan = new Scanner(System.in);


        try {
            int opc = 1;

            while (opc != 0) {
                System.out.print("""
                        Bienvenid@ al CRUD de Peliculas
                                        
                        1. Insertar pelicula
                        2. Mostrar peliculas de mayor a menor
                        3. Eliminar pelicula del array según el ranking
                        4. Eliminar pelicula del array según el nombre
                        5. Modificar datos de pelicula
                        6. Lectura de diferentes metodos
                        0. Salir
                                        
                        Escoja una opcion:
                        """);
                opc = scan.nextInt();

                switch (opc) {

                    case 1:
                        PeliculasService.addPelicula();
                        break;
                    case 2:
                        PeliculasService.mostarPeliculasDesc();
                        break;
                    case 3:
                        PeliculasService.eliminarPeliculaRank();
                        break;
                    case 4:
                        PeliculasService.eliminarPeliculaTitle();
                        break;
                    case 5:
                        PeliculasService.cambiarDatos();
                        break;
                    case 6:
                        Practica1.menu();
                        break;
                    case 0:
                        System.out.println("Adios...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }


        } catch (InputMismatchException e) {
            System.out.println("Opcion incorrecta... eliminando todos sus archivos");
        }


    }
}