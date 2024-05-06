package TEMA4;

public class Pais {

    public String capital;
    public String tipoClima;
    public int nHabitantes;
    public static int nPaisesUE;


    public Pais (String capital, String tipoClima){
        this.capital = capital;
        this.tipoClima = tipoClima;
    }


    public void darAltaPais (){
        this.nPaisesUE ++;
    }

    public void nacimiento() {
        this.nHabitantes ++;
    }
}
