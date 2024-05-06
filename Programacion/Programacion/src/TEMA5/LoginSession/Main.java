package TEMA5.LoginSession;

import TEMA5.LoginSession.Clases.User;
import TEMA5.LoginSession.Services.UserSessionService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);


        try {
            int opc = 1;

            while (opc != 0) {
                System.out.print("""
                        Bienvenid@ al menu
                                        
                        1. Login
                        2. Alta
                        0. Salir
                                        
                        Escoja una opcion:
                        """);
                opc = scan.nextInt();

                switch (opc) {

                    case 1:
                        System.out.println("Indica nombre de usuario: ");
                        String username = scan.next();
                       if (UserSessionService.checkIfSessionIsActive(username)){
                           System.out.println("Bienvenido de nuevo");
                       }else {
                           System.out.println("Contrasenia: ");
                           String pass = scan.next();
                           User user = new User(username, pass);
                           if (UserSessionService.addSession(user)){
                               System.out.println("Bienvenido");
                           }else {
                               System.out.println("Acceso denengado");
                           }
                       }
                        break;
                    case 2:
                        System.out.println("Indica nombre de usuario: ");
                        String username1 = scan.next();
                        while (UserSessionService.checkIfUserIsDuplicate(username1)) {
                            System.out.println("El nombre de usuario ya existe. Introduce otro:");
                            username1 = scan.nextLine();
                        }
                        System.out.println("Indica contrasenia: ");
                        String contra = scan.next();
                        User usernuevo = new User(username1, contra);
                        if (UserSessionService.addUser(usernuevo)) {
                            System.out.println("USUARIO REGISTRADO.");
                        } else {
                            System.out.println("ERROR.");
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


        } catch (InputMismatchException e) {
            System.out.println("Opcion incorrecta... eliminando todos sus archivos");
        }

    }
}
