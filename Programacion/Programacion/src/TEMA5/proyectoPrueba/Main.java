package TEMA5.proyectoPrueba;

import TEMA5.ProyectoPeliculas.Practica1;
import TEMA5.ProyectoPeliculas.services.PeliculasService;
import TEMA5.proyectoPrueba.Clases.Alumno;
import TEMA5.proyectoPrueba.Clases.Instituto;
import TEMA5.proyectoPrueba.Clases.Modulo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Instituto instituto = new Instituto("IES Los Remedios");
        Modulo modulo = new Modulo("Programacion", 8);
        Modulo modulo1 = new Modulo("Base de Datos", 8);

        Scanner scan = new Scanner(System.in);


        /*
        Hacemos un switch case para mostrar el menu dentro de un try catch para que coja las excepciones en caso
        de que el usuario introduzca un numero incorrcto
         */
        try {
            int opc = 1;

            while (opc != 0) {
                System.out.print("""
                                        
                        1. Alta Alumno
                        2. Buscar Alumno
                        3. Baja alumno
                        0. Salir
                                        
                        Escoja una opcion:
                        """);
                opc = scan.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("Diga su nombre");
                        String nombre = scan.next();
                        System.out.println("Diga su dni");
                        String dni = scan.next();
                        System.out.println("Diga su email");
                        String email = scan.next();
                        System.out.println("Diga a que modulo quiere matricularse");
                        String nombreM = scan.next();
                        int horas = 8;
                        Alumno alumno = new Alumno(dni, nombre, email);
                        if (nombreM.equals("Programacion")){
                            alumno.anadirModulo(modulo);
                        }
                        if (nombreM.equals("Base de Datos")){
                            alumno.anadirModulo(modulo1);
                        }
                     //   instituto.anadirAlumno(alumno);
                        break;
                    case 2:
                        System.out.println("Diga su dni");
                        String dni1 = scan.next();
                        instituto.buscarAlumno(dni1);
                        break;
                    case 3:
                        System.out.println("Diga su dni");
                        String dni2 = scan.next();
                        instituto.bajaAlumno(dni2);
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
