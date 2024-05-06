package Unidad1;

public class Prueba {

    public static void main(String[] args) {

        //*********Tipos de datos******+


        // numéricos entero
        /*
        int    -2^31 a 2^31
        short  -2^63 a 2^63
        long   -32768 a 32768
        byte    -128  a 128
         */

        // numéricos reales
        /*
        float  -3.4^38 a 3.4^38
        double -1.8^308 a 1.8^308
         */
        // cadena de caractéres
        /*
        String
        */
        // carácter
        /*
        char
         */
        // Lógicos o booleanos
        /*
        boolean   True o False ( 1 o 0)
         */
        //*******¿Como declarar una variable?********
        // tipoDeDato  Identificador  = Valor ;
        int edad = 33;
        long nose = 50;
        short num =  2;
        byte nose2 = 127;

        double ejemplo = 0.1;
        float mesa = 4.8f;

        String dni = "845L";
        char letra = 'l';

        boolean prueba = true;

        System.out.println(edad);
        System.out.println(nose);
        System.out.println(num);
        System.out.println(nose2);
        System.out.println(ejemplo);
        System.out.println(mesa);
        System.out.println(dni);
        System.out.println(letra);
        System.out.println(prueba);

        edad = 34;
        System.out.println(edad);

        prueba = false;
        System.out.println(prueba);


        // 3  variables de tipo entero
        int a = 1;
        int b = 2;
        int c = 0;

        //Quiero almacenar a+b dentro de c
        c = a + b;
        System.out.println(c);



        /*
        1. Declarar dos variables de tipo entero
        2. Mostrar por pantalla esas variables
        3. Intercambiar el valor de esas variables
        4. Mostrar el valor intercambiado de esas variables
         */

        int d = 5;
        int f = 17;
        int h = d ;

        System.out.println(d);
        System.out.println(f);

        d = f ;
        f = h ;
        System.out.println(d);
        System.out.println(f);







    }


}


