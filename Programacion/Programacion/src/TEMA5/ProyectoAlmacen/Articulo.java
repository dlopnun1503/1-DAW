package TEMA5.ProyectoAlmacen;

public class Articulo {

    //Atributos de clase
    private String nombre;
    private double precio;
    private int cuantosQuedan;
    private String tipo;

    //Constructores de clase
    public Articulo (String nombre, double precio, int cuantosQuedan, String tipo){
        this.nombre = nombre;

        if (precio >= 0){
            this.precio = precio;
        }

        if (cuantosQuedan >= 0){
            this.cuantosQuedan = cuantosQuedan;
        }

        if (tipo.equals("G") || tipo.equals("R") || tipo.equals("SR")){
            this.tipo = tipo;
        }
    }

    //Metodos de clase


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0){
            this.precio = precio;
        }
    }

    public int getCuantosQuedan() {
        return cuantosQuedan;
    }

    public void setCuantosQuedan(int cuantosQuedan) {
        if (cuantosQuedan >= 0){
            this.cuantosQuedan = cuantosQuedan;
        }    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void imprimirInfo (){
        System.out.printf("El nombre del producto es %s, con un precio de %f euros y hay un stock de %d", this.nombre, this.precio, this.cuantosQuedan);
    }

    public double getPVP (){
        return this.getPrecio() * Iva.getIva(this.tipo);
    }

    public double getPVPDescuento (double descuento){
        return getPVP() - (getPVP()*(descuento/100));
    }

    public boolean vender (int cant){
        if (cant >= 0){

           if (this.cuantosQuedan >= cant){
               this.cuantosQuedan = this.cuantosQuedan - cant;
               return true;
           }else {
               System.out.println("No hay suficiente stock");
               return false;
           }
        }else {
            System.out.println("Cantidad erronea");
            return false;
        }
    }

    public boolean almacenar (int cant){
        if (cant >= 0){
            this.cuantosQuedan = this.cuantosQuedan + cant;
            return true;
        }else {
            System.out.println("Cantidad erronea");
            return false;
        }
    }
}
