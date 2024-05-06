package TEMA4;

public class OtraClase {

    /**
     *
     * @param a - sumando1
     * @param b -sumando2
     * @return - resultado de la suma
     */
    public static int sumar(int a, int b){
        return  a + b;
    }

    /**
     *
     * @param a - sumando1
     * @param b - sumando2
     * @return - resultado de la resta
     */
    private static int restar(int a, int b) {
        return a - b;
    }

    protected static void ImprimirOperaciones() {
        System.out.println("Esta clase puede sumar y restar");
    }
}
