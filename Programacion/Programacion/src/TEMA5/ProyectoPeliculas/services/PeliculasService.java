package TEMA5.ProyectoPeliculas.services;

import TEMA5.ProyectoPeliculas.Clases.Pelicula;
import TEMA5.ProyectoPeliculas.Practica2;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class PeliculasService {

    public static boolean addPelicula() {
        //Adicion de una pelicula nueva
        Scanner scan = new Scanner(System.in);


        System.out.println("Dime el nombre de la pelicula: ");
        String nombrePeli = scan.nextLine();

        int anioPeli = 0;
        try {
            System.out.print("Dime el anio de publicacion de la pelicula: ");
            anioPeli = scan.nextInt();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Anio erroneo");
        }


        System.out.println("Dime el nombre del director/a: ");
        String nombreDirector = scan.nextLine();


        System.out.println("Dime el nombre del actor/actriz 1: ");
        String nombreAct1 = scan.nextLine();

        System.out.println("Dime el nombre del actor/actriz 2: ");
        String nombreAct2 = scan.nextLine();


        String id = UUID.randomUUID().toString();

        double notaPeli = 0.0;
        try {
            System.out.print("Dime la nota de la pelicula: ");
            notaPeli = scan.nextDouble();
            scan.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("Nota erroneo");
        }

        Pelicula peliNueva = new Pelicula(id, nombrePeli, anioPeli+"", nombreDirector, nombreAct1, nombreAct2, notaPeli+"");

        boolean peliExistente = false;
        for (int i = 0; i <Practica2.peliculas.size(); i++){
            if (Practica2.peliculas.get(i).getId().equals(peliNueva.getId())){
                System.out.println("Pelicula ya existente");
                peliExistente = true;
                break;
            }
        }

        if (!peliExistente){
            for (int i = 0; i < Practica2.peliculas.size(); i++){
                double notaPeliNueva = Double.parseDouble(peliNueva.getImDbRating());
                double notaPeliLista = Double.parseDouble(Practica2.peliculas.get(i).getImDbRating());
                if (notaPeliNueva > notaPeliLista){
                    peliNueva.setRank(Practica2.peliculas.get(i).getRank());
                    Practica2.peliculas.add(i, peliNueva);

                    for (int j = i+1; j < Practica2.peliculas.size(); j++){
                        int rankingAntiguo = Integer.parseInt(Practica2.peliculas.get(j).getRank());
                        int rankingNuevo = rankingAntiguo + 1;
                        Practica2.peliculas.get(j).setRank(rankingNuevo+ "");
                    }
                    break;
                }

            }
            System.out.println("Pelicula correctamente anadida");
            return true;
        }


        return false;
    }

    public static void mostarPeliculasDesc(){
        for (int i = 0; i < Practica2.peliculas.size(); i++){
            System.out.printf("_____%s______\n", Practica2.peliculas.get(i).getRank());
            System.out.printf("- Titulo (año): %s\n", Practica2.peliculas.get(i).getFullTitle());
            System.out.printf("\t*- Nota: %s\n", Practica2.peliculas.get(i).getImDbRating());
            System.out.printf("\t*- Reparto: %s\n", Practica2.peliculas.get(i).getCrew());
        }

    }

    public static void eliminarPeliculaRank(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Que posición del ranking de 1 a 250 quieres eliminar: ");
        int peliElimninada = scan.nextInt();

        /*
        Ponemos un if para comprobar que la posicion que quiere eliminar se encuentra en el ranking
        Al .size le añadimos el +1 para decir que si la posicion del ranking que quiere eliminar es mayor
        que el array diga que la posicion es incorrecta
         */
        if (peliElimninada < 1 || peliElimninada > Practica2.peliculas.size()+1) {
            System.out.println("Posicion incorrecta");
        }else {
            System.out.println("ELIMINANDO PELICULA CON RANKING IGUAL A " +peliElimninada);
        }

        for (int i = 0; i < Practica2.peliculas.size(); i++){
            if (Integer.parseInt(Practica2.peliculas.get(i).getRank()) == peliElimninada){
                Practica2.peliculas.remove(Practica2.peliculas.get(peliElimninada-1));
                System.out.println("Pelicula eliminada");
            }
        }
    }

    public static void eliminarPeliculaTitle(){
        //Hacemos lo mismo que en el anterior método
        Scanner scan = new Scanner(System.in);
        System.out.println("Que pelicula quieres eliminar: ");
        String peliElimninada = scan.nextLine();
        boolean estaPeli = false;

        for (int i = 0; i < Practica2.peliculas.size(); i++){
            if (Practica2.peliculas.get(i).getTitle().equals(peliElimninada)){
                estaPeli = true;
                Practica2.peliculas.remove(i);
                System.out.println("Pelicula eliminada");
            }
        }
        if (estaPeli == false){
            System.out.println("PELICULA NO ENCONTRADA");
        }
    }

    public static void cambiarDatos(){
        Scanner scan = new Scanner(System.in);
        System.out.println("A que pelicula quieres cambiar datos: ");
        String peliElimninada = scan.nextLine();
        boolean estaPeli = false;

        for (int i = 0; i < Practica2.peliculas.size(); i++){
            if (Practica2.peliculas.get(i).getTitle().equals(peliElimninada)){
                estaPeli = true;
                System.out.println("Dime el nuevo nombre de la pelicula: ");
                String nombrePeli = scan.nextLine();
                Practica2.peliculas.get(i).setTitle(nombrePeli);

                int anioPeli = 0;
                try {
                    System.out.print("Dime el anio de publicacion de la pelicula: ");
                    anioPeli = scan.nextInt();
                    scan.nextLine();
                    Practica2.peliculas.get(i).setYear(String.valueOf(anioPeli));
                } catch (InputMismatchException e) {
                    System.out.println("Anio erroneo");
                }

                System.out.println("Dime la nueva nota: ");
                double nuevaNota = scan.nextDouble();
                scan.nextLine();
                Practica2.peliculas.get(i).setImDbRating(String.valueOf(nuevaNota));

                System.out.println("Dime el nombre del nuevo director/a: ");
                String nombreDirector = scan.nextLine();



                System.out.println("Dime el nombre del actor/actriz 1: ");
                String nombreAct1 = scan.nextLine();


                System.out.println("Dime el nombre del actor/actriz 2: ");
                String nombreAct2 = scan.nextLine();

                Practica2.peliculas.get(i).setCrew(nombreDirector+ " (dir), " +nombreAct1+ ", " +nombreAct2);

                System.out.println("Pelicula modificada");
            }
        }
        if (estaPeli == false){
            System.out.println("PELICULA NO ENCONTRADA");
        }
    }

}
