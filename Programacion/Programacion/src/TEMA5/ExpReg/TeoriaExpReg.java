package TEMA5.ExpReg;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TeoriaExpReg {
    public static void main(String[] args) {

        //Para poder usar las expresiones regulares se necesitan dos clases: Pattern y Matcher

        //Clase Pattern: Pattern pattern = Pattern.compile("la expresion regular");
        Pattern pattern = Pattern.compile("\\d{8}(\\s|-)?[A-Z]"); //Expresion regular para dni

        //Clase Matcher
        String dni = "77496750K";
        Matcher matcher = pattern.matcher(dni);

        //Para ya comprobar en si...o sea... un metodo que diga true o false --> .find()
        if (matcher.find()){
            System.out.println("DNI valido");
        }else {
            System.out.println("DNI invalido");
        }

        //Hacer una expresion regular para una IP valida
        //192.168.189.190

        //^Para el inicio y $ para el final
        Pattern patternIP = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}\\.\\d{3}$");
        String IP = "192.168.189.190";
        Matcher matcherIP = patternIP.matcher(IP);

        if (matcherIP.find()){
            System.out.println("IP valida");
        }else {
            System.out.println("IP invalida");
        }

        //Hacer dos exp reg.
        /* 1º Nº de telefono

        956956956 --> valido
        956 95 69 56 --> valido
         */

        /* Para una direccion de correo electrónico
        cualquier caracter seguido de @ seguido de gmail o hotmail seguido de .com o .es
        */

        Pattern patternTel = Pattern.compile("^\\d{9}$|^\\d{3}\\s\\d{2}\\s\\d{2}\\s\\d{2}$");
        String telefono = "639732950";
        Matcher matcherTel = patternTel.matcher(telefono);

        if (matcherTel.find()){
            System.out.println("Telefono valido");
        }else {
            System.out.println("Telefono invalido");
        }


        Pattern patternCorreo = Pattern.compile("^.+@(hotmail|gmail)\\.(com|es)$");
        String correo = "davidlopez139139@gmail.com";
        Matcher matcherCorreo = patternCorreo.matcher(correo);

        if (matcherCorreo.find()){
            System.out.println("Correo valido");
        }else {
            System.out.println("Correo invalido");
        }





    }
}
