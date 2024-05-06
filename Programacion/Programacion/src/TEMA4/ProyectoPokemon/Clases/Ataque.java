package TEMA4.ProyectoPokemon.Clases;

public class Ataque {

    // ************ATRIBUTOS DE CLASE************

    public String nombre;
    public Tipo tipo;
    public int danio;


    // *************CONSTRUCTOR DE CLASE*************
    public Ataque(String nombre, Tipo tipo, int danio){
        this.nombre  = nombre;
        this.tipo = tipo;
        this.danio = danio;

    }
}
