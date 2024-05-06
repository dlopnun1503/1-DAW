package TEMA4.proyectoCoche.Clase;

public class Coche {

    //Atributos de clase

    public int nRuedas;
    public int nPuertas;
    public int nLuces;
    public String motor;
    public String nBastidor;
    public String tipoCarroceria;
    public String propietario;


    //MÉTODOS DE CLASE

    public void desplazar(boolean esMarchaAtras){
        if (esMarchaAtras == false) {
            System.out.println("Camino hacia delante");
        }else {
            System.out.println("Camino hacia atrás");
        }

    }

    public void frenar(){
        System.out.println("Frenando el coche");
    }

    public void acelerar(){
        System.out.println("Acelerando");
    }

    public void arrancar(){
        System.out.println("Arrancando");
    }

    public void imprimirDatosVehiculos(){
        System.out.println("Hola soy el coche de " +this.propietario);
    }
}

