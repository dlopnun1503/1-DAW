package TEMA7.ProyectoHotel.Model;

public class Propietario {

    private String host_id;
    private String host_name;


    public Propietario(String host_id, String host_name) {
        this.host_id = host_id;
        this.host_name = host_name;
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }
}
