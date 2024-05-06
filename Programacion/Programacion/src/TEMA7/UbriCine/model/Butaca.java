package TEMA7.UbriCine.model;

public class Butaca {

    //ATRIBUTOS DE CLASE
    private int fila;
    private int asiento;
    private String idUsuario;


    //CONSTRUCTOR DE CLASE
    public Butaca(int fila, int asiento, String idUsuario) {
        this.fila = fila;
        this.asiento = asiento;
        this.idUsuario = idUsuario;
    }


    //GETTERS Y SETTERS
    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getAsiento() {
        return asiento;
    }

    public void setAsiento(int asiento) {
        this.asiento = asiento;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }


    //METODOS DE CLASE
    @Override
        public boolean equals(Object o) {
            if(o instanceof Butaca) {
                Butaca b = (Butaca) o;
                return b.getFila() == this.fila && b.getAsiento() == this.asiento;
            } else {
                return false;
            }
    }


    @Override
    public String toString() {
        return fila + ':' + asiento + ':' + idUsuario;
    }
}
