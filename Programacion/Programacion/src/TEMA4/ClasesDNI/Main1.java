package TEMA4.ClasesDNI;

import TEMA4.ClasesDNI.Clases.VerificadorDNI;
import TEMA4.ValidarDNIs;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca dni: ");

        String dniUser = scan.next();

        boolean comprobarLetra = VerificadorDNI.comprobarletra(dniUser);
        boolean comprobarLongitud = VerificadorDNI.comprobarLong(dniUser);
        boolean comprobarParteNum = VerificadorDNI.comprobarParteNumerica(dniUser);
        boolean comprobarletracorrecta = VerificadorDNI.comprobarLetraCorrecta(dniUser);

        if (comprobarLetra && comprobarLongitud && comprobarletracorrecta && comprobarParteNum) {
            System.out.println("Dni correcto");
        }else  {
            System.out.println("Dni incorrecto");
        }







    }
}
