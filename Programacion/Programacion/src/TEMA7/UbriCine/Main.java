package TEMA7.UbriCine;

import TEMA7.UbriCine.services.impl.GestionFicheroUser;
import TEMA7.UbriCine.services.impl.LoggerService;
import TEMA7.UbriCine.services.impl.ServiceCine;
import TEMA7.UbriCine.services.impl.ServiceUser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        GestionFicheroUser gf = new GestionFicheroUser();
        gf.leerFicheroUser("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\users\\users.txt");

        ServiceUser serviceUser = new ServiceUser();

        LoggerService loggerService = new LoggerService();
        ServiceCine serviceCine = new ServiceCine("UbriCine");


        Scanner scan = new Scanner(System.in);

        try {
            int opc = 1;

            while (opc != 0) {
                System.out.print("""
                        Bienvenid@ a la web
                                        
                        1. Darse de alta
                        2. Login
                        0. Salir
                                        
                        Escoja una opcion:
                        """);


                      opc = scan.nextInt();


                switch (opc) {

                    case 1:
                        serviceUser.altaUsuario();
                        break;
                    case 2:
                       serviceUser.loginUsuario();
                          try {
                            int opc1 = 1;

                            while (opc1 != 6) {
                                System.out.print("""
                        ¿Que quiere realizar?
                                        
                        3 Mostrar butacas
                        4. Comprar entrada
                        5. Devolver entrada
                        6. Salir
                                        
                        Escoja una opcion:
                        """);
                                opc1 = scan.nextInt();

                                switch (opc1) {

                                    case 3:
                                        serviceCine.mostrarButacas();
                                        break;
                                    case 4:
                                        serviceCine.comprarEntradas();
                                        break;
                                    case 5:
                                        serviceCine.devolverEntrada();
                                        break;
                                    case 6:
                                        System.out.println("Adios...");
                                        break;

                                    default:
                                        System.out.println("Opcion no valida");
                                        break;
                                }
                            }

                        } catch (Exception e) {
                            throw new RuntimeException(e);
                        }
                        break;
                    case 0:
                        System.out.println("Adios...");
                        break;
                        default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }



        } catch (Exception e) {
            throw new RuntimeException(e);
        }





    }
}

