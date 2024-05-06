package TEMA4.ProyectoPokemon.Clases;

public class Pokemon {

    // ************ATRIBUTOS DE CLASE************

    public String nombre;
    public String lore;
    public double vida;

    public Tipo tipo;

    public Ataque[] ataques;


    // *************CONSTRUCTOR DE CLASE************

    public Pokemon(String nombre, double vida, Tipo tipo){
        this.nombre = nombre;
        this.vida = vida;
        this.tipo = tipo;
    }





}
