package TEMA5;

import TEMA5.ProyectoAlmacen.Articulo;
import TEMA5.ProyectoPersona.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListRepaso {
    public static void main(String[] args) {

        //ARRAYLIST

        // 1º -> Declaramos un arraylist
        // ArrayList nombredelArray = new ArrayList();
        java.util.ArrayList arr = new java.util.ArrayList();

        // 2º Rellenar con datos el ArrayList
        // Ahora mismo esta asi []
        // Si usamos el metodo add() -> añadiremos elementos al ArrayList
        arr.add("David");
        arr.add("Pepe");
        arr.add("Diego");
        arr.add("Juanma");

        // En este punto el ArrayList estaria asi ["David", "Pepe", "Diego", "Juanma"]

        for (int i = 0; i < arr.size(); i++){
            System.out.println("Elemento: " +arr.get(i));
        }

        System.out.println("El tamaño del ArrayList es: " +arr.size());

        System.out.println("El elemento de la posicion 3 es: " +arr.get(3));

        // Nuevo elemento
        arr.add("Jose");

        ArrayList<String> nombres = new ArrayList<String>();
        nombres.add("David"); //0
        nombres.add("Juan"); //1
        nombres.add("Pepe"); //2
        nombres.add("Carlos");  //3
        nombres.add("Alfredo");  //4
        nombres.add("Maria");  //5
        nombres.add("Jake");  //6
        nombres.add("Adolfo");  //7
        nombres.add("Francisco");  //8
        nombres.add("Benito");  //9
        nombres.add("Pablo");  //10

        System.out.println("Nombre: " +nombres.get(4)); //DEBERIA IMPRIMIR ALFREDO

        //PARA INSERTAR UN ELEMENTO EN LA POSICION QUE DESEEMOS
        //EL ELEMENTO DE ESA POSICION NO SE ELIMINA SINO QUE SE DESPLAZA UNA POSICION
        nombres.add(4, "Marcos");
        System.out.println("Nombre: " +nombres.get(4)); //DEBERIA IMPRIMIR MARCOS


        //PARA CAMBIAR EL CONTENIDO DE UNA POSICION
        nombres.set(4, "Pablo");
        System.out.println("Nombre: " +nombres.get(4)); //DEBERIA IMPRIMIR PABLO

        // PARA ACCEDER A UN ELEMENTO DEL ARRAYLIST SE USA EL METODO .GET()
        System.out.println(nombres.get(0));
        System.out.println(nombres.get(nombres.size()-1));


        //PARA RECORRER UN ARRAYLIST, SE PUEDE RECORRER CON UN FOR COMO EL ARRAY NORMAL
        //EN VEZ DE PONER .LENGTH SE PONE .SIZE
        for (int i = 0; i < nombres.size(); i++){
            System.out.println("Nombre: " +nombres.get(i));
        }


        //PARA BUSCAR UN ELEMENTO EN UN ARRAYLIST, SE UTILIZA INDEX.OF(ELEMENTO)
        //DEVUELVE LA POSICION DE ESE ELEMENTO
        //DEVUELVE UN -1 SI NO ESTA EN LA LISTA
        int posicionNombre = nombres.indexOf("Pablo");

        if (posicionNombre != -1){
            System.out.println("El elemento se encuentra en la posicion: " +posicionNombre);
            System.out.println("El elemento es: " +nombres.get(posicionNombre));
        }else {
            System.out.println("El elemento no se encuentra en la lista");
        }

        //VAMOS A CONTAR CUANTOS PABLOS HAY EN LA LISTA
        //NO EXISTE NINGUN MATODO PARA CONTAR EL Nº DE ELEMENTOS E UN ARRAYLIST
        //LO TENEMOS QUE HACER DE MANERA MANUAL
        int contador = 0;
        for (int i = 0; i < nombres.size(); i++){
            if (nombres.get(i).equals("Pablo")){
                contador++;
            }
        }
        System.out.println("Hay " +contador+ " Pablo(s)");


        //LISTA DE OBJETOS
        //LA LISTA NOMBRES2 VA ALMACENAR OBJETOS DE TIPO STRING
        ArrayList<String> nombres2 = new ArrayList<String>();

        //LA LISTA ARTICULOS VA ALMACENAR OBJETOS DE TIPO ARTICULO
        //LA LISTA PERSONAS VA ALMACENAR OBJETOS DE TIPO PERSONA
        ArrayList<Articulo> articulos = new ArrayList<Articulo>();
        ArrayList<Persona> personas = new ArrayList<Persona>();

        Articulo monitor = new Articulo("Monitor", 200, 50, "G");
        Articulo silla = new Articulo("Silla", 40, 1000, "G");
        Articulo mesa = new Articulo("Mesa", 80, 500, "G");
        Articulo calcetines =new Articulo("calcetines" , 8.0 ,200 ,"G");
        Articulo camiseta =new Articulo("Camiseta" , 15.0 ,1000 ,"G");
        Articulo ibuprofeno =new Articulo("Ibuprofeno" , 8.0 ,100000 ,"SR");
        Articulo raqueta = new Articulo("Raqueta de tenis", 150, 200, "G");
        Articulo pelota = new Articulo("Pelota de rugby", 50, 0, "G");
        Articulo pan = new Articulo("Pan", 1, 100, "SR");
        Articulo pelotaVasca = new Articulo ("Pelota basket", 65.8, 78, "G");
        Articulo zapatos_futbol = new Articulo ("Zapatos Futbol Sala", 120, 40, "G");
        Articulo guantes = new Articulo ("Guantes Portero", 30.2, 90, "G");
        Articulo vestido = new Articulo("Estampado", 50, 150, "G");
        Articulo libro = new Articulo("Programacion", 70, 350, "G");
        Articulo estuche = new Articulo("Estuche Maquillaje", 25, 300, "G");
        Articulo chandal =  new Articulo("Chandal nike uapo uapo",200,100,"G");
        Articulo vape = new Articulo("Vape de contrabando",10,20,"G");
        Articulo barcelo = new Articulo("Ron semibarato",14,15,"G");

        articulos.add(monitor);
        articulos.add(silla);
        articulos.add(mesa);
        articulos.add(calcetines);
        articulos.add(camiseta);
        articulos.add(ibuprofeno);
        articulos.add(raqueta);
        articulos.add(pelota);
        articulos.add(pan);
        articulos.add(pelotaVasca);
        articulos.add(zapatos_futbol);
        articulos.add(guantes);
        articulos.add(vestido);
        articulos.add(libro);
        articulos.add(estuche);
        articulos.add(chandal);
        articulos.add(vape);
        articulos.add(barcelo);

        //UN PEQUENIO PROGRAMA QUE MUESTRE POR PANTALLA:
        //articulos cuyo stock sea <= 0
        //los articulos cuyo stock este apunto de acabarse


        int contadorAgotados = 0;
        for (int i = 0; i < articulos.size(); i++){
            if (articulos.get(i).getCuantosQuedan() <= 0){
                contadorAgotados++;
                System.out.println("No quedan " +articulos.get(i).getNombre());
            }
        }
        System.out.println("Hay " +contadorAgotados+ " agotados");

        int contadorStock = 0;
        for (int i = 0; i < articulos.size(); i++){
            if (articulos.get(i).getCuantosQuedan() <= 10 && articulos.get(i).getCuantosQuedan() > 0){
                contadorStock++;
                System.out.println(articulos.get(i).getNombre()+ " a punto de agotarse");
            }
        }
        System.out.println("Hay " +contadorStock+ " apunto de agotarse");


        //Pequenio menu para hacer diferentes operaciones con los articulos
        /*
        Menu Articulo
        1. Contar cuantos articulos hay con stock <= 0
        2. Contar cuantos articulos hay de tipo SR
        3. Contar cuantos articulos hay con un precio menor a 100
        4. Decir cual es el articulo con mayor precio
        5. Decir cual es el articulo con menor precio
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("""
                Menú Articulo
                1. Contar cuántos artículos hay con stock <= 0
                2. Contar cuántos artículos hay de tipo SR
                3. Contar cuántos artículos hay con un precio menor que 100€
                4. Decir cuál es el artículo con mayor precio
                5. Decir cuál es el artículo con menor precio
                """);
        System.out.println("Indique la opción deseada: ");
        int opc;
        try  {
            opc = scan.nextInt();

            switch (opc){
                case 1:
                    int contadorAgot = 0;
                    for (int i = 0; i < articulos.size(); i++){
                        if (articulos.get(i).getCuantosQuedan() <= 0){
                            contadorAgot++;
                        }
                    }
                    System.out.println("Hay " +contadorAgot+ " agotados");
                    break;
                case 2:
                    int contadorSR = 0;
                    for (int i = 0; i < articulos.size(); i++){
                        if (articulos.get(i).getTipo().equals("SR")){
                            contadorSR++;
                        }
                    }
                    System.out.println("Hay " +contadorSR+ " con IVA super reducido");
                    break;
                case 3:
                    int contador100 = 0;
                    for (int i = 0; i < articulos.size(); i++){
                        if (articulos.get(i).getPrecio() < 100){
                            contador100++;
                        }
                    }
                    System.out.println("Hay " +contador100+ " que cuesten mas de 100 euros");
                    break;
                case 4:
                    if (articulos.size()>0) {
                        Articulo mayor = articulos.get(0);
                        for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                            if(articulos.get(i).getPrecio() > mayor.getPrecio()) { // Para cada uno de los articulos, hago una condicion
                                mayor = articulos.get(i);
                            }
                        }
                        System.out.println("El producto con un precio mayor es: "+mayor.getNombre()+" con un precio de "+mayor.getPrecio()+"€");
                    } else {
                        System.out.println("No hay artículos para comparar");
                    }
                    break;
                case 5:
                    if (articulos.size()>0) {
                        Articulo menor = articulos.get(0);
                        for(int i=0; i<articulos.size(); i++) { // Recorro el ArrayList articulos
                            if(articulos.get(i).getPrecio() < menor.getPrecio()) { // Para cada uno de los articulos, hago una condicion
                                menor = articulos.get(i);
                            }
                        }
                        System.out.println("El producto con un precio menor es: "+menor.getNombre()+" con un precio de "+menor.getPrecio()+"€");
                    } else {
                        System.out.println("No hay artículos para comparar");
                    }
                    break;
            }

        } catch (Exception e) {
            System.out.println("Error en la opcion... eliminando todos sus archivos");
        }


    }
}
