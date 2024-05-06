package TEMA6.ProyectoMascotas.Clases;

import java.time.LocalDate;

public class Perro extends Mascota{

    private boolean pulgas;
    private String raza;

    public Perro(String nombre, boolean pulgas, String raza) {
        super(nombre);
        this.pulgas = pulgas;
        this.raza = raza;
    }


    @Override
    public void muestra(){
        super.muestra();
        System.out.println("Soy un perro de raza " +this.raza+ " y ");
        if (this.pulgas){
            System.out.println("tengo pulgas");
        }else {
            System.out.println("No tengo pulgas");
        }
    }


    public boolean isPulgas() {
        return pulgas;
    }

    public void setPulgas(boolean pulgas) {
        this.pulgas = pulgas;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}
