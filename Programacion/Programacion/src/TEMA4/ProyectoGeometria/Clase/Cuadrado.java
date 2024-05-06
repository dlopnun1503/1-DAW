package TEMA4.ProyectoGeometria.Clase;

public class Cuadrado {
    public int lado;
    public double area;

    public Cuadrado (int lado){
        if (lado > 0){
            this.lado = lado;
        } else {
            this.lado = 0;
        }
    this.area = this.lado * this.lado;
    }

    public void compararCuadrados (Cuadrado c) {
       if (this.lado >c.lado){
        System.out.println("El cuadrado con lado " +this.lado+ " es mayor");
    } else {
           System.out.println("El cuadrado con lado " +c.lado+ " es mayor");
       }
    }
}
