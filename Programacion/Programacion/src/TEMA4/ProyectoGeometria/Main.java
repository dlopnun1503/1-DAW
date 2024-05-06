package TEMA4.ProyectoGeometria;

import TEMA4.ProyectoGeometria.Clase.Circulo;
import TEMA4.ProyectoGeometria.Clase.Punto;

public class Main {

    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(5.0);
        Circulo circulo2 = new Circulo(6.0);

        circulo1.mostrarInfo();
        circulo2.mostrarInfo();


        Punto punto1 = new Punto(5, 5);
        Punto punto2 = new Punto(-4, 6);

        double distancia = punto1.calcularDistancia(punto2);
        System.out.println("La distancia es de " +distancia);

    }
}
