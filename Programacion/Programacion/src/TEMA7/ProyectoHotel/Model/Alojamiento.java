package TEMA7.ProyectoHotel.Model;

import TEMA7.ProyectoHotel.Model.*;

public class Alojamiento {
    private String id;
    private String room_type;
    private String name;
    private Propietario p;
    private Reserva r;
    private Ubicacion ub;
    private Vecindario ve;
    private Review re;
    private Licencia lic;


    public Alojamiento(String id, String room_type, String name, Propietario p, Reserva r, Ubicacion ub, Vecindario ve, Review re, Licencia lic) {
        this.id = id;
        this.room_type = room_type;
        this.name = name;
        this.p = p;
        this.r = r;
        this.ub = ub;
        this.ve = ve;
        this.re = re;
        this.lic = lic;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Propietario getP() {
        return p;
    }

    public void setP(Propietario p) {
        this.p = p;
    }

    public Reserva getR() {
        return r;
    }

    public void setR(Reserva r) {
        this.r = r;
    }

    public Ubicacion getUb() {
        return ub;
    }

    public void setUb(Ubicacion ub) {
        this.ub = ub;
    }

    public Vecindario getVe() {
        return ve;
    }

    public void setVe(Vecindario ve) {
        this.ve = ve;
    }

    public Review getRe() {
        return re;
    }

    public void setRe(Review re) {
        this.re = re;
    }

    public Licencia getLic() {
        return lic;
    }

    public void setLic(Licencia lic) {
        this.lic = lic;
    }
}
