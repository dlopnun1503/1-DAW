package TEMA5.ProyectoPeliculas;

import TEMA5.ProyectoPeliculas.Clases.Pelicula;
import TEMA5.ProyectoPeliculas.Utils.JsonReaderUtil;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        String pelisPath = "IMDB-api/Top250Movies.json";
        ArrayList<Pelicula> peliculas = JsonReaderUtil.loadJsonFile(pelisPath);

        //En este punto deberiamos tener un ArrayList de 250  peliculas

        for (int i = 0; i < peliculas.size(); i++){
            System.out.println(peliculas.get(i).getTitle());
        }

        //Mostar las 10 mejores peliculas segun IMDB

        ArrayList<Pelicula> best10movies = new ArrayList<Pelicula>();

        double mayorNota = 0.0;
        for (int i = 0; i < peliculas.size(); i++){
            if (mayorNota <= Double.parseDouble(peliculas.get(i).getImDbRating())){
                mayorNota = Double.parseDouble(peliculas.get(i).getImDbRating());
            }

        }
        System.out.println("La mayor nota es " +mayorNota);

        //Vamos a comprobar las pelculas que tienen esa nota para incluirlas
        //Despues restamos 0.1 hasta que la nota sea 0 o el ArrayList tenga 10 peliculas
        //Lo que hemos hecho en este codigo es ordenar de menor a mayor la lista de peliculas
        for (int i = 0; i < peliculas.size(); i++){
            for (int j = 0; j < peliculas.size()-i-1; j++){
                if (Double.parseDouble(peliculas.get(j+1).getImDbRating())
                              < Double.parseDouble(peliculas.get(j).getImDbRating())){
                    Pelicula peli = peliculas.get(j+1);
                    peliculas.set(j+1, peliculas.get(j));
                    peliculas.set(j, peli);
                }
            }
        }


        //Buscar las peliculas de antes de los 2000
        for (int i = 0; i < peliculas.size(); i++){
            if (Integer.parseInt(peliculas.get(i).getYear()) < 2000){
                System.out.println("- " +peliculas.get(i).getFullTitle());
            }
        }


        //Buscar las peliculas que tengan de nota menos de 8.5
        for (int i = 0; i < peliculas.size(); i++){
            if (Double.parseDouble(peliculas.get(i).getImDbRating()) < 8.5){
                System.out.println("- " +peliculas.get(i).getTitle());
            }
        }


        //Buscar la pelicula mas antigua de la lista
        Pelicula peliMasAnt = peliculas.get(0);
        for (int i = 0; i < peliculas.size(); i++){
         int anioPeli = Integer.parseInt(peliculas.get(i).getYear());
         if (anioPeli < Integer.parseInt(peliMasAnt.getYear())){
             peliMasAnt = peliculas.get(i);
            }
        }
        System.out.println("La pelicula mas antigua es " +peliMasAnt.getFullTitle());


        //Buscar la pelicula mas moderna de la lista
        Pelicula peliMasMod = peliculas.get(0);
        for (int i = 0; i < peliculas.size(); i++){
            int anioPeli = Integer.parseInt(peliculas.get(i).getYear());
            if (anioPeli > Integer.parseInt(peliMasMod.getYear())){
                peliMasMod = peliculas.get(i);
            }
        }
        System.out.println("La pelicula mas moderna es " +peliMasMod.getFullTitle());


        //Buscar las peliculas protagonizadas por Emma Stone
        ArrayList<Pelicula> peliculasEmma = new ArrayList<Pelicula>();
        for (int i = 0; i < peliculas.size(); i++){
            if (peliculas.get(i).getCrew().contains("Emma Stone")){
                peliculasEmma.add(peliculas.get(i));
            }
        }
        for (int i = 0; i < peliculasEmma.size(); i++){
            System.out.println("Peliculas protagonizadas por Emma Stone");
            System.out.println("\t- " +peliculasEmma.get(i).getFullTitle());
        }

        //Buscar las peliculas protagonizadas por Robin Williams
        ArrayList<Pelicula> peliculasRobin = new ArrayList<Pelicula>();
        for (int i = 0; i < peliculas.size(); i++){
            if (peliculas.get(i).getCrew().contains("Robin Williams")){
                peliculasRobin.add(peliculas.get(i));
            }
        }
        for (int i = 0; i < peliculasRobin.size(); i++){
            System.out.println("Peliculas protagonizadas por Robin Williams");
            System.out.println("\t- " +peliculasRobin.get(i).getFullTitle());
        }

    }
}
