package TEMA4.ProyectoGeometria.Clase;

public class Circulo {

    private double radio;
    private double area;
    private double  diametro;

    public Circulo(double radio) {
        this.radio = radio;
        calcularArea();
        calcularDiametro();
    }

    private void calcularArea() {
        this.area = Math.PI * Math.pow(this.radio, 2.0);
    }

    private void calcularDiametro() {
        this.diametro = 2 * this.radio;
    }

    public void mostrarInfo(){
        System.out.println("Soy un circulo con radio " +this.radio+ ", area " +this.area+ " y diametro " +this.diametro);
    }

    public void compararCirculos (Circulo c) {
        if (this.radio >c.radio){
            System.out.println("El circulo con radio " +this.radio+ " es mayor");
        } else {
            System.out.println("El circulo con radio " +c.radio+ " es mayor");
        }
    }
}
