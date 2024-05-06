import java.util.Scanner;

public class Cafetería {
    public static void main(String[] args) {

        System.out.println("BIENVENID@ A UbriCoffee");

        String user = "usuario";
        int contrasenia = 1234;
        String user1;
        int contrasenia1;
        int deseo;
        double precio = 0;
        int contadorCafe = 0;
        int contadorAgua = 0;
        int contadorTostada = 0;
        int cafes;
        int tostadas = 0;


        Scanner scan = new Scanner(System.in);
        System.out.println("Identificate mediante el usuario: ");
        user1 = scan.next();


        Scanner scan1 = new Scanner(System.in);


        while (!user1.equals(user)) {
            System.out.println("Usuario incorrecto, introduzcalo de nuevo: ");
            user1 = scan.next();
        }
        System.out.println("Usuario  correcto, introduzca la contrasenia: ");
        contrasenia1 = scan.nextInt();

        while (contrasenia1 != contrasenia) {
            System.out.println("Contrasenia incorrecta, introduzcala de nuevo: ");
            contrasenia1 = scan1.nextInt();
        }
        if (user1.equals(user) && contrasenia1 == contrasenia) {
            System.out.println("Bienvenid@ usuario");
            System.out.println("El precio del café es de 1 euro. Si desea café pulse 1");
            System.out.println("El precio del agua es de 50 céntimos. Si desea agua pulse 2");
            System.out.println("El precio de la tostada es de 1,20 euros. Si desea tostada pulse 3");
            System.out.println("Si desea salir pulse 0");
            System.out.println("Selecciona 4 una vez desee no seleccionar más productos");
        }

        Scanner scan2 = new Scanner(System.in);
        do {
            System.out.println("Seleccione producto");
            deseo = scan1.nextInt();
            if (deseo == 1){
                System.out.println("¿Cuántos cafés quieres?");
                contadorCafe = scan2.nextInt();
            } else if (deseo == 2) {
                System.out.println("¿Cuántas aguas quieres?");
                contadorAgua = scan2.nextInt();
            } else if (deseo == 3) {
                System.out.println("¿Cuántas tostadas quieres?");
                contadorTostada = scan2.nextInt();;
            }


        } while (deseo < 4 && deseo > 0);


        if (deseo == 0) {
            System.out.println("Saliendo");
        } else if (deseo == 4) {
            System.out.println("Ya no desea más productos");
        } else if (deseo > 4 || deseo < 0) {
            System.out.println("ERROR");
        }

        System.out.println("Has seleccionado " +contadorCafe+ " cafés");
        System.out.println("Has seleccionado " +contadorAgua+ " aguas");
        System.out.println("Has seleccionado " +contadorTostada+ " tostadas");


        System.out.println("Si desea café solo pulse 6 ");
        System.out.println("Si desea café con leche pulse 7");
        System.out.println("En caso de no haber seleccionado cafe pulse 8");
        cafes = scan2.nextInt();
        if (cafes == 6){
            System.out.println("Pidió café solo");
        } else if (cafes == 7) {
            System.out.println("Pidió café con leche");
        }
        System.out.println("Si desea tostada con jamón pulse 9");
        System.out.println("Si desea tostada con aceite pulse 10");
        System.out.println("En caso de no haber seleccionado tostada pulse 11");
        tostadas = scan2.nextInt();
        if (tostadas == 9){
            System.out.println("Pidió tostada con jamón");
        } else if (tostadas == 7) {
            System.out.println("Pidió tostada con aceite");
        }



            precio =  (1 * contadorCafe) + (0.5 * contadorAgua) + (1.20 * contadorTostada);


        System.out.println("EL precio es de " + precio + " euros");

        System.out.println("Gracias por comprar en UbriCoffee");

        // ¿Cuál es la parte más compleja a la hora de trabajar con bucles?
        /*
        La parte más difícil de trabajar con bucles es saber cuál elegir en cada momento ademá de poner las
        condiciones correctas
         */

        //¿Por qué has decidido utilizar un bucle while en lugar de un do-while? (O al revés si así ha sido el caso)
        /*
        He utilizado un do-while ya que necesitaba hacer algo antes de que se repitiera el bucle while
         */

        // ¿Cuál ha sido la parte más compleja de la práctica?
        /*
        La parte que más me ha costado ha sido preguntar al usuario cuantas cosas quería de cada producto
        y sumar el precio total
         */


    }
}