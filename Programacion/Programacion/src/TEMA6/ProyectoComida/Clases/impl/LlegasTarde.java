package TEMA6.ProyectoComida.Clases.impl;

import TEMA6.ProyectoComida.Clases.api.Reganieta;

public class LlegasTarde implements Reganieta {
    @Override
    public int reduceEnergia() {
        System.out.println("Pierdes 5 de energia");
        return -5;
    }
}
