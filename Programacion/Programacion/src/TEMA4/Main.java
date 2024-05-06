package TEMA4;

public class Main {
    public static void main(String[] args) {
        String dniAprobrar1 = "12345678A"; //Tiene que dar true
        String dniAprobrar2 = "123X5678A"; //Tiene que dar false

        boolean validez1 = DniValidator.comprobarParteNumerica(dniAprobrar1);
        boolean validez2 = DniValidator.comprobarParteNumerica(dniAprobrar2);

        if (validez1 == true) {
            System.out.println("El dni " +dniAprobrar1+ " es correcto");
        }else {
            System.out.println("El dni " +dniAprobrar1+ " es incorrecto");
        }

        if (validez2 == true) {
            System.out.println("El dni " +dniAprobrar2+ " es correcto");
        }else {
            System.out.println("El dni " +dniAprobrar2+ " es incorrecto");
        }
    }
}
