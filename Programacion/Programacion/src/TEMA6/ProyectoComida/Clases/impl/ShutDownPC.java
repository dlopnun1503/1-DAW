package TEMA6.ProyectoComida.Clases.impl;

import TEMA6.ProyectoComida.Clases.api.Reganieta;

public class ShutDownPC implements Reganieta {
    @Override
    public int reduceEnergia() {
        System.out.println("Pierdes 20 de energia");
        return -20;
    }
}
