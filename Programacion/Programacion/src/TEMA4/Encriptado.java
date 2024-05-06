package TEMA4;

import java.util.Scanner;

public class Encriptado {
    /**
     * Escribir un metodo que reciba por parámetros un String ( la contraseña)
     * y devuelva la misma contraseña ya encriptada, haciendo uso del cifrado césar
     * <p>
     * Ejemplo:
     * pass = "pass123"
     * pass retornada = "sdvv456"
     * <p>
     * Consejos:
     * - Crear una variable auxiliar para almacenar la nueva password
     * - Recorre el String y tratar cada uno de los caracteres individualmente
     * - Sumar 3 a cada caracter ->  obtenemos un nuevo caracter
     * - Concatenar dicho caracter nuevo a la variable  auxiliar
     */

    private static String encriptacion(String pass) {
        String password = "";

        for (int i = 0; i <= pass.length() - 1; i++) {


            char charEnI = pass.charAt(i); //Obtenemos el caracter en esa posicion
            int num = Character.getNumericValue(charEnI);
            num = num + 3;

            char charCifrada = (char) num;

            password = password + charCifrada;

            System.out.println("La contraseña cifrada es " + password);

        }
        return password;
    }
}
