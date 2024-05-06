package TEMA6.ProyectoEmpresa;

import TEMA6.ProyectoEmpresa.Clases.Articulo;
import TEMA6.ProyectoEmpresa.Clases.Proveedor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {


        Proveedor proveedor = new Proveedor("David", "77496750K", "Ubrique", "639732950");
        Proveedor proveedor2 = new Proveedor("David", "77496750K", "Ubrique", "639732950");
        Articulo vaper = new Articulo("1","Vaper de melocoton", proveedor, 5, 100);
        Articulo vaper2 = new Articulo("1","Vaper de melocoton", proveedor2, 5, 100);
        Articulo vaper3 = new Articulo("1","Vaper melocoton", proveedor2, 5, 50);
        System.out.println(proveedor.equals(proveedor2));
        System.out.println(vaper.equals(vaper2));


        ArrayList<Articulo> articulos = new ArrayList<>();
        articulos.add(vaper);
        articulos.add(vaper3);
        System.out.println(articulos.get(0));
        // Estamos anadiendo un vaper que ya existe
        // Queremos anadir vaper2
        for (int i = 0; i < articulos.size(); i++){
            if (vaper2.equals(articulos.get(i))){
                articulos.get(i).setStock(vaper2.getStock());
                break;
            }
        }
        System.out.println(articulos.get(0));

        //Anadimos el stock del vaper3 al vaper
        if (articulos.contains(vaper3)){
            articulos.get(articulos.indexOf(vaper3)).setStock(vaper3.getStock());
        }
        System.out.println(articulos.get(0));


        System.out.println(vaper.compareTo(vaper2));


        // Crear 5 artículos más
        // Anadir al ARRAYLIST
        // Mostrar la lista de artículos
        // ¿La lista esta ordenada? Ordenala
        // Muestra la lista
        Articulo vaper4 = new Articulo("2","Vaper de melocoton", proveedor, 10, 100);
        Articulo vaper5 = new Articulo("3","Vaper de melocoton", proveedor2, 7, 100);
        Articulo vaper6 = new Articulo("4","Vaper de melocoton", proveedor, 3, 100);
        Articulo vaper7 = new Articulo("5","Vaper de melocoton", proveedor2, 9, 100);
        Articulo vaper8 = new Articulo("6","Vaper de melocoton", proveedor, 1, 100);

        articulos.add(vaper4);
        articulos.add(vaper5);
        articulos.add(vaper6);
        articulos.add(vaper7);
        articulos.add(vaper8);

        for (int i = 0; i < articulos.size(); i++){
            System.out.println(articulos.toString());
        }
        Collections.sort(articulos);

        System.out.println(articulos.toString());





    }
}
