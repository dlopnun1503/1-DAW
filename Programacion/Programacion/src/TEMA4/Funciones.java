package TEMA4;


import java.util.Scanner;
import TEMA4.OtraClase;
import TEMA4.FuncionesII;

public class Funciones {
    public static void main(String[] args) {

        int resultado = OtraClase.sumar(3, 2);
        System.out.println(resultado);

        boolean esValido = FuncionesII.checkDNI("12345678A");
        if (esValido) {
            System.out.println("El dni es valido");
        }else {
            System.out.println("El dni no es válido");
        }

        /**
         * Hacer unmétodo que imprima por pantalla "hola" y el nombre del usuario
         */

        Scanner scan = new Scanner(System.in);
        String nombre = "";
        System.out.println("dime tu nombre: ");
        nombre = scan.next();
        imprimirNombre(nombre);

    } //FIN DE MAIN

    /**
     * Metodo q imprime por pantalla el nombre del usuario
     * @param nombreUser
     */
    public static void imprimirNombre(String nombreUser) {
        System.out.println("Hola " +nombreUser);

    }



} //FIN DE CLASE
