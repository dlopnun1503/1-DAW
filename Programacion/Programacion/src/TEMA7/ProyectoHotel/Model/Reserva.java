package TEMA7.ProyectoHotel.Model;

public class Reserva {

    private double precio;
    private int min_nights;
    private int availabity;


    public Reserva(double precio, int min_nights, int availabity) {
        this.precio = precio;
        this.min_nights = min_nights;
        this.availabity = availabity;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMin_nights() {
        return min_nights;
    }

    public void setMin_nights(int min_nights) {
        this.min_nights = min_nights;
    }

    public int getAvailabity() {
        return availabity;
    }

    public void setAvailabity(int availabity) {
        this.availabity = availabity;
    }
}
