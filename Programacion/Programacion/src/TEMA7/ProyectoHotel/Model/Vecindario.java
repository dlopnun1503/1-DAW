package TEMA7.ProyectoHotel.Model;

public class Vecindario {

    private String group;
    private String name;


    public Vecindario(String group, String name) {
        this.group = group;
        this.name = name;
    }


    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
