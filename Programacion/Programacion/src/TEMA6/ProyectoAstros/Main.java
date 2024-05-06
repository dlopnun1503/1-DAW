package TEMA6.ProyectoAstros;

import TEMA6.ProyectoAstros.Clases.Planeta;
import TEMA6.ProyectoAstros.Clases.Satelite;

public class Main {
    public static void main(String[] args) {


        Planeta Tierra = new Planeta(
                6738.4, 23.56, 5975, 17.18, "Tierra",
                150000000, 365.04, true);

        Satelite Luna = new Satelite(
                3474.8, 23.56, 7.349, -96, "Luna",
                384400, 23.56);

        Planeta Jupiter = new Planeta(
                69911, 9.50, 1898, -121.15, "Jupiter",
                750000000, 4330, true);

        Satelite Europa = new Satelite(
                2334.8, 8.56, 755, -163, "Europa",
                38440, 235);

        Tierra.muestra();
        Luna.muestra();

        if (Tierra.esMayor(Luna)){
            System.out.println("La Tierra es mayor");
        }else {
            System.out.println("La Luna es mayor");
        }

        Jupiter.muestra();
        Europa.muestra();
        if (Jupiter.esMayor(Europa)){
            System.out.println("Jupiter es mayor");
        }else {
            System.out.println("Europa es mayor");
        }
        if (Jupiter.esMayor(Tierra)){
            System.out.println("Jupiter es mayor");
        }else {
            System.out.println("La Tierra es mayor");
        }
        if (Jupiter.esMayor(Luna)){
            System.out.println("Jupiter es mayor");
        }else {
            System.out.println("La Luna es mayor");
        }

    }
}
