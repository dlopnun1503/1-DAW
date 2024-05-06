package TEMA6.ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Mascota {

    protected String nombre;
    protected  int edad;
    protected boolean estado;
    protected LocalDate fechaNac;

    public Mascota(String nombre) {
        this.nombre = nombre;
        this.edad = 0;
        this.estado = true;
        this.fechaNac = LocalDate.now();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public void muestra() {
        if (this.estado == true) {
            System.out.println("_____________");
            System.out.println("El nombre de la mascota es: " + this.nombre);
            System.out.println("La edad de la mascota es: " + this.edad);
            if (fechaNac.getMonthValue() == LocalDate.now().getMonthValue() && fechaNac.getDayOfMonth() == LocalDate.now().getDayOfMonth()){
                System.out.println("Y es mi cuumpleanios");
            }
        }else {
            System.out.println("Los muertos no hablan");
        }
    }

    public void cumpleanios(){
        if (fechaNac.getMonthValue() == LocalDate.now().getMonthValue() && fechaNac.getDayOfMonth() == LocalDate.now().getDayOfMonth()){
            this.edad++;
        }
    }

    public void morir(){
        this.estado = !this.estado;
    }

    public boolean habla(){
        return false;
    }
}
