package TEMA7.ProyectoQuizBien.model;

import java.util.Objects;

public class Pregunta {

    private String pregunta;
    private String respuesta;


    public Pregunta(String pregunta, String respuesta) {
        setPregunta(pregunta);
        setRespuesta(respuesta);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pregunta pregunta1 = (Pregunta) o;
        return Objects.equals(pregunta, pregunta1.pregunta) && Objects.equals(respuesta, pregunta1.respuesta);
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }
}
