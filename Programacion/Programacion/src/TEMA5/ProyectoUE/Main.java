package TEMA5.ProyectoUE;

public class Main {
    public static void main(String[] args) {

        Pais etiopia = new Pais("Etiopia", 2, 2000, true);
        Pais filipinas = new Pais("Filipinas", 100, 200000, true);
        Pais mojacar = new Pais("Mojacar", 1, 6000, false);

        System.out.println("Numero de paises de UE: " +Pais.numPaisesUE);

        System.out.println(etiopia.getNombre());

        etiopia.setNombre("Francia");

        System.out.println(etiopia.getNombre());





    }
}
