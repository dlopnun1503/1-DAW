package TEMA6.ProyectoVehiculos.Clases;

public abstract class Vehiculo {

    // ATRIBUTOS DE CLASE, EL FINAL INDICA QUE NO SE PUEDE CAMBIAR
    protected  String matricula;
    protected  String modelo;

    // METODOS DE CLASE
    //Metodo que muestra los datos del vehiculo
    public void muestra(){
        System.out.println("Matricula: " +this.matricula);
        System.out.println("Modelo: " +this.modelo);
    }

    // GETTERS Y SETTER
    public String getMatricula() {
        return matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public abstract void setMatricula(String matricula);

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}

