package TEMA4;

public class FuncionesII {

    public static boolean checkDNI (String dni) {
        char c = dni.charAt(dni.length() - 1);

        if (comprobarLength(dni) && comprobarSiEsLetra(c)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     *
     * @param dni
     * @return
     */


    protected static boolean comprobarLength(String dni) {

        if (dni.length() == 9){
            return true;
        }else {
            return false;
        }
    }

    /**
     * Metodo que comprueba si la ultima posicion es letra
     * @param c caracter dni
     * @return
     */

    protected static boolean comprobarSiEsLetra (char c) {
        if ((c >= 65 && c <= 90) || (c <= 122 && c >= 97)){
            return true;
        } else {
            return false;
        }

    }
}
