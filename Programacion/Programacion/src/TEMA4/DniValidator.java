package TEMA4;

public class DniValidator {
    /**
     * Metodo que compruebe si un dni es valido
     *  Un dni tiene 8 numeros y una  letra
     */



        private static boolean checkCaracteres (String dni){
            boolean dniEsValido = false;
            for (int i = 0; i <= dni.length() - 2; i++) {
                try {

                    char letraEnI = dni.charAt(i); //Obtenemos el caracter en esa posicion
                    String letraEnPosicionI = Character.toString(letraEnI); // Pasamos ese caracter a String
                    Integer.parseInt(letraEnPosicionI); //Pasamos ese String a int

                } catch (NumberFormatException e) {
                    System.out.println("El dni no es válido");
                    dniEsValido = false;
                    break;
                }
            }
            return dniEsValido;
        }

        public static boolean checkDNI (String dni){
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


        protected static boolean comprobarLength (String dni){

            if (dni.length() == 9) {
                return true;
            } else {
                return false;
            }
        }

        /**
         * Metodo que comprueba si la ultima posicion es letra
         * @param c caracter dni
         * @return
         */

        protected static boolean comprobarSiEsLetra ( char c){
            if ((c >= 65 && c <= 90) || (c <= 122 && c >= 97)) {
                return true;
            } else {
                return false;
            }

        }

    /**
     * Funcion que comprueba que la parte numerica de un dni es un numero
     * @param dni String que contiene el dni
     * @return true- si la parte numerica esta bien, false- no esta bien
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

