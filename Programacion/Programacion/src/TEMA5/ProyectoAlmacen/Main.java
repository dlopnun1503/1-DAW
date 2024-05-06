package TEMA5.ProyectoAlmacen;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Articulo sudadera = new Articulo("Sudadera", 100.0, 2000, "G");
        System.out.println(sudadera.getPVPDescuento(20));



    }
}
