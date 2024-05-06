package TEMA3;

import java.util.Scanner;

public class LoginMejorado {
    public static void main(String[] args) {

        String[] usuario = new String[10];
        String[] contrasenia = new String[10];


        usuario[0] = "user1";
        usuario[1] = "user2";
        usuario[2] = "user3";
        usuario[3] = "user4";
        usuario[4] = "user5";
        usuario[5] =" ";
        usuario[6] =" ";
        usuario[7] =" ";
        usuario[8] =" ";
        usuario[9] =" ";

        contrasenia[0] = "1234";
        contrasenia[1] = "2345";
        contrasenia[2] = "3456";
        contrasenia[3] = "4567";
        contrasenia[4] = "5678";
        contrasenia[5] = " ";
        contrasenia[6] = " ";
        contrasenia[7] = " ";
        contrasenia[8] = " ";
        contrasenia[9] = " ";



        String user;
        String contra ;
        int baja = 0;
        int registrar;
        String userregis;
        String contraregis;


        // LOGIN
        Scanner scan = new Scanner(System.in);
        System.out.println("Si se está registrado pulse 0 sino otro número:");
        registrar = scan.nextInt();
        if (registrar!=0){
            System.out.println("Crea usuario");
            userregis = scan.next();
            System.out.println("Crea una contrasenia: ");
            contraregis = scan.next();
            usuario[5] = userregis;
            System.out.println("Usuario creado");
            contrasenia[5] = contraregis;
            System.out.println("Si quiere darse de baja pulse 1 sino pulse otro número:");
            baja = scan.nextInt();

            if (baja == 1) {
                System.out.println("Se ha dado de baja");
                usuario[5] = " ";
            } else {
                System.out.println("Sigues siendo cliente");
            }
        }

        if (registrar == 0) {
            System.out.println("Buenas, introduzca su usuario: ");
            user = scan.next();

            if (user.equals(usuario[0])) {
                System.out.println("Introduzca contrasenia: ");
                contra = scan.next();
                while (!contra.equals(contrasenia[0])) {
                    System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
                    contra = scan.next();
                }
                if (contra.equals(contrasenia[0])) {
                    System.out.println("Acceso permitido");
                    System.out.println("Si quiere darse de baja pulse 1 sino otro número: ");
                    baja = scan.nextInt();
                }if (baja == 1) {
                    System.out.println("Se ha dado de baja");
                    usuario[0] = " ";
                    contrasenia[0] = " ";
                } else {
                    System.out.println("Sigues siendo cliente");
                }
            }


            if (user.equals(usuario[1])) {
                System.out.println("Introduzca contrasenia: ");
                contra = scan.next();
                while (!contra.equals(contrasenia[1])) {
                    System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
                    contra = scan.next();
                }
                if (contra.equals(contrasenia[1])) {
                    System.out.println("Acceso permitido");
                    System.out.println("Si quiere darse de baja pulse 1 sino otro número: ");
                    baja = scan.nextInt();
                }if (baja == 1) {
                    System.out.println("Se ha dado de baja");
                    usuario[1] = " ";
                    contrasenia[1] = " ";
                } else {
                    System.out.println("Sigues siendo cliente");
                }
            }


            if (user.equals(usuario[2])) {
                System.out.println("Introduzca contrasenia: ");
                contra = scan.next();
                while (!contra.equals(contrasenia[2])) {
                    System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
                    contra = scan.next();
                }
                if (contra.equals(contrasenia[2])) {
                    System.out.println("Acceso permitido");
                    System.out.println("Si quiere darse de baja pulse 1 sino otro número: ");
                    baja = scan.nextInt();
                }if (baja == 1) {
                    System.out.println("Se ha dado de baja");
                    usuario[2] = " ";
                    contrasenia[2] = " ";
                } else {
                    System.out.println("Sigues siendo cliente");
                }
            }


            if (user.equals(usuario[3])) {
                System.out.println("Introduzca contrasenia: ");
                contra = scan.next();
                while (!contra.equals(contrasenia[3])) {
                    System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
                    contra = scan.next();
                }
                if (contra.equals(contrasenia[3])) {
                    System.out.println("Acceso permitido");
                    System.out.println("Si quiere darse de baja pulse 1 sino otro número: ");
                    baja = scan.nextInt();
                }if (baja == 1) {
                    System.out.println("Se ha dado de baja");
                    usuario[3] = " ";
                    contrasenia[3] = " ";
                } else {
                    System.out.println("Sigues siendo cliente");
                }
            }


            if (user.equals(usuario[4])) {
                System.out.println("Introduzca contrasenia: ");
                contra = scan.next();
                while (!contra.equals(contrasenia[4])) {
                    System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
                    contra = scan.next();
                }
                if (contra.equals(contrasenia[4])) {
                    System.out.println("Acceso permitido");
                    System.out.println("Si quiere darse de baja pulse 1 sino otro número: ");
                    baja = scan.nextInt();
                }if (baja == 1) {
                    System.out.println("Se ha dado de baja");
                    usuario[4] = " ";
                    contrasenia[4] = " ";
                } else {
                    System.out.println("Sigues siendo cliente");
                }
            }
        }


        System.out.println(" ");



    }
}
