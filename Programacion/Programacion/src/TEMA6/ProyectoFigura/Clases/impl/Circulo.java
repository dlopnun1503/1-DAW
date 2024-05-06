package TEMA6.ProyectoFigura.Clases.impl;

import TEMA6.ProyectoFigura.Clases.api.iFigura2D;

public class Circulo implements iFigura2D {

    //ATRIBUTOS DE CLASE
    private double radio;

    //CONSTRUCTOR DE CLASE
    public Circulo(double radio) {
        this.radio = radio;
    }

    //METODOS DE CLASE
    @Override
    public double perimetro() {
        return 0;
    }

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
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
}

