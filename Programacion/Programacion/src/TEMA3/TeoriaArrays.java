package TEMA3;

public class TeoriaArrays {
    public static void main(String[] args) {

        // 1º. Como declarar un arrive
        // Tipo de dato [] identificador;
        int [] arr;

        // 2º. Inicializar
        // identificador = new Tipo de dato[longitud del array];
        arr = new int[5];

        // 3º. Asignar valor
        // Identificador[indice] = valor;
        arr[0] = 100;
        arr[1] = 2;
        arr[2] = 2;
        arr[3] = 4;
        arr[4] = 0;

        System.out.println("En la posición 0 está el valor " +arr[0]);
        // System.out.println("En la posición 0 está el valor " +arr[5]); Error ya que el índice 5 no existe

        // ************** //

        // 1º. Declarar e inicializar
        // tipo de dato [] identificador = {valores separados por coma};
        char [] cArr = {'d' , '%' , '5' , 't' , 'x'};
        System.out.println("En la posición 4 está el valor " +cArr[4]);

        // ************* //

        // Como acceder a un elemento
        // identificador index

        // Para saber la longitud de un array
        // Identificador.length

        System.out.println("El tamanio del array cArr es " +cArr.length+ " y el primer elemento del array es " +cArr[0]);


        /*
        Declarar un array del tamaño del numero de alumnos de esta clase
        Inicializar dicho String con los nombres de los alumnos
         */

        String [] clase = {"Angel" , "Raquel" , "PabloM" , "PabloG" , "RobertoBo" , "Sebas" , "Alvaro" ,
        "Marcos" , "Juan Antonio" , "Ignacio" , "DavidL" , "Juanma" , "DavidS" , "Victor", "Samuel" , "Sara", "Pepe" ,
        "RobertoBu" , "Oscar" , "Rafael"};

        System.out.println("El tamanio del array clase es " +clase.length+ " y el alumno de la posicion 11 es " +clase[11]);

        // Para recorrer el array completo utilizamos un bucle for para ir desde la posicion 0 hasta la ultima
        // Para mostrar todos
        for (int i = 0; i <= clase.length - 1; i++) {
            System.out.println(clase[i]);
        }



    }
}
