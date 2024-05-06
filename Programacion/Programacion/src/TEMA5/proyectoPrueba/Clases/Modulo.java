package TEMA5.proyectoPrueba.Clases;

public class Modulo {

    //*******ATRIBUTOS DE CLASE*******
    private String nombre;
    private int horas;

    //*******CONSTRUCTOR DE CLASE*******
    public Modulo (String nombre, int horas){
        this.nombre = nombre;
        this.horas = horas;
    }

    //********METODOS DE CLASE*********

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHoras() {
        return horas;
    }

    /*
    Nos indica que las horas no pueden ser negativas por lo que anadimos una restriccion mediante if
     */
    public void setHoras(int horas) {
        if (horas >= 0){
            this.horas = horas;
        }else {
            System.out.println("ERROR");
        }
    }
}
