package TEMA6.ProyectoHerencia.Clases;

public class Empleado extends PersonaH{

    private double sueldo;

    public Empleado(String nombre, String dni, String sexo, double sueldo) {
        super(nombre, dni, sexo);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void presentacion(){
        System.out.println("_______________");
        System.out.println("Nombre: " +this.nombre);
        System.out.println("Dni: "+this.dni);
        System.out.println("Sexo: "+this.sexo);
        System.out.println("Sueldo: "+this.sueldo);
        System.out.println("_______________");

    }
}
