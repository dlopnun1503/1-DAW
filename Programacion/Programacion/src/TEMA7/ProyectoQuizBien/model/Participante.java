package TEMA7.ProyectoQuizBien.model;

import java.util.ArrayList;
import java.util.Objects;

public class Participante {

    private String nombre;
    private String id;
    private ArrayList<Puntuacion> puntuaciones;


    public Participante(String nombre, String id) {
        setNombre(nombre);
        setId(id);
        this.puntuaciones = new ArrayList<>();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participante that = (Participante) o;
        return Objects.equals(nombre, that.nombre) && Objects.equals(id, that.id) && Objects.equals(puntuaciones, that.puntuaciones);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Puntuacion> getPuntuaciones() {
        return puntuaciones;
    }

    public void setPuntuaciones(ArrayList<Puntuacion> puntuaciones) {
        this.puntuaciones = puntuaciones;
    }
}
