package TEMA6.ProyectoComida.Clases.impl;

import TEMA6.ProyectoComida.Clases.api.Comida;

public class Hueso implements Comida {


    private int cantidadEnergia = 5;


    @Override
    public int addNutricion() {
        System.out.println("Te doy 5 de energia");
        return this.cantidadEnergia;
    }
}
