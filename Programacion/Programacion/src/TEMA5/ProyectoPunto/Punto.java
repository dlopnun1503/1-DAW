package TEMA5.ProyectoPunto;

import java.util.Random;

public class Punto {

    //Atributos de clase

    private int x;
    private  int y;

    //Constructores de clase

    public Punto (int x, int y){
        this.x = x;
        this.y = y;
    }

    //Metodos de clase
    public void imprime (){
        System.out.println("(" +this.x+ ", " +this.y+ ")");
    }

    public void setXY (int newX, int newY){
        this.x = newX;
        this.y = newY;
    }

    public void desplaza (int dX, int dY){
        this.x = this.x + dX;
        this.y = this.y + dY;
    }

    public int distancia (Punto p){

        int parte1 = (p.x - this.x) * (p.x - this.x);
        int parte2 = (p.y - this.y) * (p.y - this.y);
        int parte3 = (int) Math.sqrt(parte1 + parte2);

        return parte3;
    }

    public static Punto creaPuntoAleatorio (){
        int aleatorioX = new Random().nextInt(-100, 100);
        int aleatorioY = new Random().nextInt(-100, 100);

        return new Punto(aleatorioX, aleatorioY);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
}
