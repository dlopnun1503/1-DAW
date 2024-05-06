package TEMA3;

public class Strings {
    public static void main(String[] args) {


        /**
         * Programa que compare la longitud de dos strings y nos diga cual es mayor
         */

        String cadena1 = "jretjr";
        String cadena2 = "hgrehgdujgj";

        if (cadena1.length() > cadena2.length()) {
            System.out.println(cadena1+ " es mayor");
        } else {
            System.out.println(cadena2+ " es mayor");
        }



        String cadena3 = "perro";
        cadena3.charAt(3);
        System.out.println(cadena3.charAt(3));

        //Tenemos la longitud de String con cadena1.length();
        //Para acceder a los carecteres cadena1.charAt();

        for (int i = 0; i <= cadena1.length()-1; i++)  {
            System.out.println(cadena1.charAt(i));
        }
    }
}
