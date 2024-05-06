package TEMA3;

public class EjClaseEntregar {
    public static void main(String[] args) {


        /**
         * Ejercicio 1. Definir con lenguaje natural los siguientes arrays
         */
        // Ejemplos
        int[] arr;                  // -> Array de enteros con nombre arr
        int[] arr2 = new int[2];    // -> Array de enteros arr2, con tamaño 2
        arr2[0] = 1;                // -> Asigno el valor entero 1 a la posición 0 del array


        // Ahora tú
        int[] arr3 = {2,3,1}; //Array de enteros con nombre arr3
        String[] sArr; //Cadena de caracteres con nombre sArr
        boolean[] bArr = new boolean[5]; //Array de componentes lógicos con nombre bArr
        char[] cArr = {'a'}; //Array de caracteres con nombre cArr

        cArr[0] = 'b'; // Dice que en la posición 0 del array cArr hay una b
        bArr[0] = true; // Dice que en la posicion 0 del array bArr hay un true
        bArr[2] = true; // Dice que en la posicion 2 del array bArr hay un true
        bArr[3] = false; // Dice que en la posicion 3 del array bArr hay un false
        bArr[4] = true; // Dice que en la posicion 4 del array bArr hay un true

        /**
         * Ejercicio 2. Definir en Java lo descrito en lenguaje natural
         */
        // Ejemplo
        // Array de Strings de tamaño 4 con nombre despedidas, que tenga en la primera posición "chao", en la segunda "adios", en la tercera "Hasta pronto", y en la última "Hasta nunca"
        String[] despedidas = {"chao", "adios", "hasta pronto", "hasta nunca"};

        // AHORA TÚ
        // Array de enteros de tamaño 11 con nombre notas
        int[] notas = new int[11];

        // La primera posición de notas contiene el valor 0
        notas[0] = 0;

        // La segunda posición de notas contiene el valor 1
        notas[1] = 1;

        // La tercera posición de notas contiene el valor 2
        notas[2] = 2;

        // La cuarta posición de notas contiene el valor 3
        notas[3] = 3;

        // La quinta posición de notas contiene el valor 4
        notas[4] = 4;

        // La sexta posición de notas contiene el valor 5
        notas[5] = 5;

        // La septima posición de notas contiene el valor 6
        notas[6] = 6;

        // La octava posición de notas contiene el valor 7
        notas[7] = 7;

        // La novena posición de notas contiene el valor 8
        notas[8] = 8;

        // La decima posición de notas contiene el valor 9
        notas[9] = 9;

        // La onceava posición de notas contiene el valor 10
        notas[10] = 10;

        // Array de Strings de tamaño 10 llamado users, inicializado pero vacío.
        String[] users = new String[10];
        System.out.println(users);

        // Array de booleans de tamaño 10 llamado bans, inicializados todos los elementos del array a false.
        boolean [] bans = new boolean[10];
        bans[0] = false;
        bans[1] = false;
        bans[2] = false;
        bans[3] = false;
        bans[4] = false;
        bans[5] = false;
        bans[6] = false;
        bans[7] = false;
        bans[8] = false;
        bans[9] = false;
        for (int i = 0; i <= bans.length-1; i++) {
            System.out.println(bans[i]);
        }





        // La primera posición de users es "xulito6969"
        users [0] = "xulito6969";

        // La primera posición de bans es true
        bans[0] = true;

        // La segunda posición de users es "userNormalYSimpatico"
        users[1] = "userNormalYSimpático";

        // La segunda posición de bans es true
        bans[1] = true;

        // La tercera posición de users es "lainezz"
        users[2] = "lainezz";

        /**
         * Ejercicio 3
         * Declarar e inicializar un array de enteros de tamaño 10.
         * Llenar ese array con números aleatorios a vuestra elección.
         * Recorrer dicho array desde la posición 0 hasta la última y mostrar el contenido de cada uno de los elementos.
         * Ejemplo
         * "La posición 0 tiene un elemento con valor 17"
         * "La posición 1 tiene un elemento con valor 99"
         * ...
         */
        int [] a =  new int[10];
        a [0] = 3;
        a [1] = 8;
        a [2] = 34;
        a [3] = 32;
        a [4] = 23;
        a [5] = 13;
        a [6] = 3;
        a [7] = 93;
        a [8] = 3;
        a [9] = 3;
        System.out.println("La posición 0 tiene un elemento con valor " +a[0]);
        System.out.println("La posición 1 tiene un elemento con valor " +a[1]);
        System.out.println("La posición 2 tiene un elemento con valor " +a[2]);
        System.out.println("La posición 3 tiene un elemento con valor " +a[3]);
        System.out.println("La posición 4 tiene un elemento con valor " +a[4]);
        System.out.println("La posición 5 tiene un elemento con valor " +a[5]);
        System.out.println("La posición 6 tiene un elemento con valor " +a[6]);
        System.out.println("La posición 7 tiene un elemento con valor " +a[7]);
        System.out.println("La posición 8 tiene un elemento con valor " +a[8]);
        System.out.println("La posición 9 tiene un elemento con valor " +a[9]);


        /**
         * Ejercicio 4
         * Declarar e inicializar un array de Strings de tamaño 10
         * Llenar dicho array con cadenas aleatorias a vuestra elección
         * Recorrer dicho array desde la última posición hasta la 0 (es decir, de atrás hacia delante)
         * Ejemplo:
         * "La posición 9 tiene un elemento con valor perro"
         * "La posición 8 tiene..."
         * ...
         */
        String [] animales = new String[10];
        animales [0] = "perro";
        animales [1] = "gato";
        animales [2] = "caballo";
        animales [3] = "toro";
        animales [4] = "rata";
        animales [5] = "serpiente";
        animales [6] = "león";
        animales [7] = "tigre";
        animales [8] = "hiena";
        animales [9] = "guepardo";

        System.out.println("La posición 9 tiene un elemento con valor " +animales[9]);
        System.out.println("La posición 8 tiene un elemento con valor " +animales[8]);
        System.out.println("La posición 7 tiene un elemento con valor " +animales[7]);
        System.out.println("La posición 6 tiene un elemento con valor " +animales[6]);
        System.out.println("La posición 5 tiene un elemento con valor " +animales[5]);
        System.out.println("La posición 4 tiene un elemento con valor " +animales[4]);
        System.out.println("La posición 3 tiene un elemento con valor " +animales[3]);
        System.out.println("La posición 2 tiene un elemento con valor " +animales[2]);
        System.out.println("La posición 1 tiene un elemento con valor " +animales[1]);
        System.out.println("La posición 0 tiene un elemento con valor " +animales[0]);







    }
}
