package TEMA4.proyectoPersona.utils;

public class LocalidadValidator {

    //Atributos de clase

    public String[] provinciasValidas = {"Cádiz", "Huelva", "Sevilla", "Málaga", "Granada", "Jaén", "Almería", "Córdoba"};
    public String[] cpValidos = {"11", "21", "41", "29", "18", "23", "04", "14"};

    /**
     * metodo para comprobar la validez de un cp y una provincia
     * @param provincia
     * @param cp en formato XXXXX
     * @return true si es correcto, false si no lo es
     */
    public boolean checkProvincia (String provincia, String cp) {
// comprobamos que la provincia existe
        boolean provinciaExiste = false;
        int posicionProvincia = 0;
        for (int i = 0; i <= provinciasValidas.length-1; i++) {
            if (provincia.equalsIgnoreCase(provinciasValidas[i])) {
                provinciaExiste = true;
                posicionProvincia = i;
                break;
            }
        }
        if (provinciaExiste){
        String dosPrimerosNumerosCP = cp.substring(0,2);
        if (dosPrimerosNumerosCP.equalsIgnoreCase(cpValidos[posicionProvincia])){
            return true;
        }
        }
        System.out.println("Provincia o cp incorrectos");
        return false;
    }

}
