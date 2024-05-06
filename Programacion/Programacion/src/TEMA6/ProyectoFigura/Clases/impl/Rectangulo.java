package TEMA6.ProyectoFigura.Clases.impl;

import TEMA6.ProyectoFigura.Clases.api.iFigura2D;

public class Rectangulo implements iFigura2D {

    //ATRIBUTOS DE CLASE
    private double ancho;
    private double alto;

    //CONSTRUCTOR DE CLASE
    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
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
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    }
