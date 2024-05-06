package TEMA4.ProyectoGeometria.Clase;

public class Punto {

    public int coorX;
    public int coorY;


    // Constructor que reciba por parametros la coorx y la coorY
    public Punto (int coorX, int coorY) {
        this.coorY = coorY;
        this.coorX = coorX;
    }

    public double calcularDistancia (Punto p) {
        double a = (p.coorX - this.coorX) * (p.coorX - this.coorX);
        double b = (p.coorY - this.coorY) * (p.coorY - this.coorY);

        double raiz = Math.sqrt(a+b);
        return  raiz;

    }

}
