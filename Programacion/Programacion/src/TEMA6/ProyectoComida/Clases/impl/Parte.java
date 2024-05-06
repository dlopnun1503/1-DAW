package TEMA6.ProyectoComida.Clases.impl;

import TEMA6.ProyectoComida.Clases.api.Reganieta;

public class Parte implements Reganieta {

    private String parte;

    public Parte(String parte) {
        this.parte = parte;
    }

    @Override
    public int reduceEnergia() {
        if (parte.equals("Leve")) {
            System.out.println("Pierdes 10 de energia");
            return -10;
        } else if (parte.equals("Grave")) {
            System.out.println("Pierdes 15 de energia");
            return -15;
        } else {
            System.out.println("ERROR");
        }
        return 0;
    }
}
