package TEMA5.ProyectoAgenda.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Localidad {

    private String municipio;
    private String provincia;
    private String cp;

    public Localidad(String municipio, String provincia, String cp){
        this.municipio = municipio;
        this.provincia = provincia;
        this.cp = cp;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        Pattern municipioPattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher municipioMatcher = municipioPattern.matcher(municipio);
        if (municipioMatcher.find()){
            this.municipio = municipio;
        }
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        Pattern provinciaPattern = Pattern.compile("^[A-Z][a-z]+$");
        Matcher provinciaMatcher = provinciaPattern.matcher(provincia);
        if (provinciaMatcher.find()){
            this.provincia = provincia;
        }
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        Pattern cpPattern = Pattern.compile("^(04|41|14|18|29|21|11|23)\\d{3}$");
        Matcher cpMatcher = cpPattern.matcher(cp);
        if (cpMatcher.find()){
            this.cp = cp;
        }
    }

    public void presentacion(){
        System.out.println(this.municipio+ "("+this.provincia+"), "+this.cp);
    }
}
