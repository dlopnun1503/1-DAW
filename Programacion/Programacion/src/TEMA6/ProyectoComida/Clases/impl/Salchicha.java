package TEMA6.ProyectoComida.Clases.impl;

import TEMA6.ProyectoComida.Clases.api.Comida;

public class Salchicha implements Comida {
    @Override
    public int addNutricion() {
        System.out.println("Te doy 10 de energia");
        return 10;
    }
}
