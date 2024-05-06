package TEMA6.ProyectoFigura.Clases.impl;

import TEMA6.ProyectoFigura.Clases.api.iFigura2D;

public class Cuadrado implements iFigura2D {

    //ATRIBUTOS DE CLASE
    private double lados;

    //CONSTRUCTOR DE CLASE
    public Cuadrado(double lados) {
        this.lados = lados;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    //METODOS DE CLASE
    @Override
    public double area() {
        return 0;
    }

    @Override
    public void escalar() {

    }

    @Override
    public void imprimir() {

    }

    //GETTERS AND SETTERS
    public double getLados() {
        return lados;
    }

    public void setLados(double lados) {
        this.lados = lados;
    }
}
