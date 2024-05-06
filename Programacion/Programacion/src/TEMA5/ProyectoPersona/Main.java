package TEMA5.ProyectoPersona;

public class Main {
    public static void main(String[] args) {

        Persona p1 = new Persona("David", "Lopez", "77496750K", 19);
        p1.imprime();
        p1.esMayorEdad();
        p1.esJubilado();

        Persona p2 = new Persona("Carlos", "Jaén", "77499764L", 36);
        p2.imprime();
        p2.esMayorEdad();
        p2.esJubilado();

        p1.diferenciaEdad(p2);
    }
}
