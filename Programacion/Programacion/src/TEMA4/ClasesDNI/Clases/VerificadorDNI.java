package TEMA4.ClasesDNI.Clases;

public class VerificadorDNI {


    private static String dni = "";
    private static char[] letrasDNI = {'T','R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
    'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};



    /**
     * Método que comprueba que en la ultima posicion hay una letra
     * @param dni
     * @return true- es una letra, flase- no es una  letra
     */
    public static boolean comprobarletra (String dni) {
       char letraDNI = dni.charAt(dni.length()-1);

        if ((letraDNI >= 65 && letraDNI <= 90) || (letraDNI <= 122 && letraDNI >= 97)) {
            return true;
        } else {
            return false;
        }
    }//FIN COMPROBAR LETRA


    /**
     * Metdo que comprueba si la longitud del dni es correcta
     * @param dni
     * @return
     */
    public static boolean comprobarLong (String dni) {
        return dni.length() == 9;
    }//FIN COMPROBAR LONGITUD


    /**
     * La letra asociada a un DNI se obtiene dividiendo el número del DNI entre 23 y el resto es codificado siguiendo la siguiente correspondencia:
     * 0: "T", 1: "R", 2: "W", 3: "A", 4: "G", 5: "M", 6: "Y", 7: "F", 8: "P", 9: "D",10:"X", 11: "B", 12: "N",
     * 13: "J", 14: "Z", 15: "S", 16: "Q", 17: "V", 18: "H", 19: "L", 20: "C", 21: "K", 22: "E"
     * @param dni
     * @return
     */
    public static boolean comprobarLetraCorrecta (String dni) {

        String parteNum;
        parteNum = dni.substring(0,8);
        int num = Integer.parseInt(parteNum);
        char letraDNI = dni.charAt(dni.length()-1);

        int resto = num % 23;
         if (letrasDNI[resto] == letraDNI){
             System.out.println("La letra corresponde al dni");
         }else {
             System.out.println("La letra no corresponde al dni");
         }
         return true;
    }//FIN COMPROBRA LETRA CORRECTA

    /**
     * Comprobar si la parte numerica es correcta
     * @param dni
     * @return
     */
    public static boolean comprobarParteNumerica (String dni) {

        String parteNum = "";

        try {
            //Para obtener la parte numerica, hago un substring de la posicion 0 a la 8
            parteNum = dni.substring(0,8);

            //Por ulttimo voy a comprobar que efectivamente es un numero
            int num = Integer.parseInt(parteNum);

        } catch (Exception e) {
            //Si lanza una excepcion indica que la parte numerica es incorrecta
            System.out.println("Error en los datos");
            return false;
        }

        return true;
    }
}
