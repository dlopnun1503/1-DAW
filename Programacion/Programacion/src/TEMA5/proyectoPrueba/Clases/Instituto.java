package TEMA5.proyectoPrueba.Clases;

import java.util.ArrayList;

public class Instituto {

    //*******ATRIBUTOS DE CLASE*******
    private String nombre;
    private ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

    //*******CONSTRUCTOR DE CLASE*******
    public Instituto(String nombre) {
        this.nombre = nombre;
    }

    //*******METODOS DE CLASE*******


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*
    Para anadir un alumno hacemos lo mismo que para anadir un modulo pero comparando los dni
     */


    public Alumno buscarAlumno(String dni) {
        for (int i = 0; i < alumnos.size(); i++) {
            if (dni.equals(alumnos.get(i).getDni())) {
                System.out.println("Alumno encontrado");
                System.out.println(dni);
            }else {
                System.out.println("Alumno no encontrado");
            }
        }
        return null;
    }

    public boolean bajaAlumno(String dni) {
        boolean alumnoEliminado = false;
        for (int i = 0; i < alumnos.size(); i++) {
            if (dni.equals(alumnos.get(i).getDni())) {
                System.out.println("Alumno eliminado");
                alumnoEliminado = true;
            }else {
                System.out.println("No se puede dar de baja a ese alumno");
            }
        }
        return alumnoEliminado;
    }

    /*
    Recorremos el Array de alumnos y por cada posicion que recorra sumamos 1 al numero de alumnos
     */
    public int numeroAlumnos(){
        int numeroAlumnos = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            numeroAlumnos++;
            if (numeroAlumnos > 100){
                System.out.println("ERROR");
            }else {
                System.out.println("El numero de alumnos es " + numeroAlumnos);
            }
        }
        return numeroAlumnos;
    }
}
