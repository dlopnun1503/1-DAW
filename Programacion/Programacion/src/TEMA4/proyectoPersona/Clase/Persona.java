package TEMA4.proyectoPersona.Clase;

public class Persona {

    public String nombre;
    public String dni;
    public int edad;
    public String apellidos;
    public double altura;
    public String colorPiel;
    public String colorPelo;
    public Boolean estaTrabajando;


    /**
     * Añadir un atributo público "EstaTrabajando" inicializando por defecto en false
     */


    /**
     * Contructor de clase
     * Se le pasa nombre apellidos dni y edad
      */
    public Persona(String nombre, String apellidos, int edad, String dni, Direccion dir){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
        this.direccion = dir;

    }
    public void presentarse(){
        System.out.println("Hola me llamo " + this.nombre + " " + this.apellidos + ", tengo " + this.edad+ " años y mi dirección es " + direccion.calle+ ", numero " + direccion.numero+ " en " + direccion.localidad+ ", " + direccion.provincia);
    }

    public void cumplirAnios(boolean pasaAnio){
        if (pasaAnio == true){
            this.edad = this.edad + 1;
            System.out.println("El 15 de marzo cumplo  " +this.edad +" anios");
        }else {
            System.out.println("Todavía no cumplo anios");
        }
    }

    public void cambiarColorPelo(String nuevoColor){
        this.colorPelo = nuevoColor;
        System.out.println("Ahora tengo el pelo " + nuevoColor + " porque me lo he pintado");
    }

    /**
     * Método que comprueba si es mayor que edad
     */

    public boolean mayorEdad(){
        if (this.edad >= 18){
            System.out.println("Es mayor de edad");
        }else {
            System.out.println("No es mayor de edad");
        }
        return true;
    }


    /**
     * Método que compara si dos personas son iguales
     */

    public boolean compararPersonas (Persona p){
        if (this.dni.equals(p.dni)){
            System.out.println("Es la misma persona");
        }else {
            System.out.println("No es la misma persona");
        }
        return true;
    }

    /**
     *Método que da de alta o baja a la persona en un trabajo
     * El metodo se llama cambiarEstadoLaboral
     */

    public boolean cambiarEstadoLaboral (boolean cam){
        if (cam == true){
            this.estaTrabajando = false;
            System.out.println("Me acaban de despedir, ya no tengo trabajo");
        }else {
            this.estaTrabajando = true;
            System.out.println("Me acaban de contratar");
        }
        return true;
    }

    public Direccion direccion;


}
