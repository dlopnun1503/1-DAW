package TEMA4;

public class ValidarDNIs {
    public static void main(String[] args) {
        /**
         * Declarar un array de string de 10  possiciones
         * Meter en cada posicion 1 DNI distinto
         * Llamar al método checkPartenumerica y contar cunatos son validos y cuantos no
         */

        String[] DNIs = new String[10];

        DNIs[0] = "12345678A";
        DNIs[1] = "123C5678A";
        DNIs[2] = "1234J678A";
        DNIs[3] = "123456789";
        DNIs[4] = "12345678F";
        DNIs[5] = "12345678K";
        DNIs[6] = "1234J678A";
        DNIs[7] = "12375678A";
        DNIs[8] = "123456R8D";
        DNIs[9] = "12345678M";

        int DNIsValidos = 0;
        int DNIsInvalidos = 0;



        for (int i = 0; i <= DNIs.length-1; i++){
            boolean validez1 = DniValidator.comprobarParteNumerica(DNIs[i]);
            if (validez1 == true){
                DNIsValidos = DNIsValidos +1;
            } else {
                DNIsInvalidos = DNIsInvalidos +1;
            }
        }


        System.out.println("Numeros de DNIs válidos: " +DNIsValidos);

        System.out.println("Numeros de DNIs inválidos: " +DNIsInvalidos);



    }
}
