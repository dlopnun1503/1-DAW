package TEMA5.ProyectoTelefonia;

import TEMA5.ProyectoTelefonia.Clases.Agenda;
import TEMA5.ProyectoTelefonia.Clases.Contacto;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ProgramaAgenda {
    public static void main(String[] args) {

        ArrayList<Contacto> contactos = new ArrayList<>();
        Agenda agenda = new Agenda(contactos);

        Scanner scan = new Scanner(System.in);
        try {
            int opc = 1;

            while (opc != 0) {
                System.out.print("""
                        Bienvenid@ a la agenda
                                        
                        1. Insertar contacto
                        2. Buscar Contacto
                        3. Eliminar contacto
                        0. Salir
                                        
                        Escoja una opcion:
                        """);
                opc = scan.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("Dime tu nombre: ");
                        String nombre = scan.next();
                        System.out.println("Dime tu telefono: ");
                        String telefono = scan.next();
                        Contacto contacto = new Contacto(nombre, telefono);
                        agenda.anadirContacto(contacto);
                        break;
                    case 2:
                        System.out.println("Dime el nombre que quieres buscar: ");
                        String nombre1 = scan.next();
                        agenda.buscaContacto(nombre1);
                        break;
                    case 3:
                        System.out.println("Dime el nombre de la persona que quieres eliminar: ");
                        String nombre2 = scan.next();
                        agenda.eliminarContacto(nombre2);
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



