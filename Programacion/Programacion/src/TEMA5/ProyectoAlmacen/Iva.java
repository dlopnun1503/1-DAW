package TEMA5.ProyectoAlmacen;

public class Iva {
    private static final double IVANORMAL = 1.21;
    private static final double IVAREDUCIDO = 1.10;
    private static final double IVASUPERREDUCIDO = 1.04;

    /**
     * Metodo que devuelve un tio de iva segun el tipo de articulo que se pase por parametro
     */

    public static double getIva (String tipoProducto){

        if (tipoProducto.equals("G")){
            return Iva.IVANORMAL;
        } else if (tipoProducto.equals("R")) {
            return Iva.IVAREDUCIDO;
        } else if (tipoProducto.equals("SR")) {
            return Iva.IVASUPERREDUCIDO;
        }else {
            return 1;
        }
    }

}
