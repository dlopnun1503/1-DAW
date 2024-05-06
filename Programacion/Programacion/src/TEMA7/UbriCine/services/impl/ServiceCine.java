package TEMA7.UbriCine.services.impl;

import TEMA7.UbriCine.model.Butaca;
import TEMA7.UbriCine.model.Cine;
import TEMA7.UbriCine.model.Usuario;
import TEMA7.UbriCine.services.api.BasicServiceEntradas;

import java.util.Scanner;

public class ServiceCine implements BasicServiceEntradas {

    private String nombreCine;
    private static final int NFILAS = 10;
    private static final int NASIENTOS = 10;
    private Butaca[][] salaDeCine;
    private GestionFicheroEntradas gf;
    private ServiceUser serviceUser = new ServiceUser();

    //Constructor de clase
    public ServiceCine(String nombreCine) {
        this.nombreCine = nombreCine;
        this.salaDeCine = new Butaca[NFILAS][NASIENTOS];
        gf = new GestionFicheroEntradas();
        this.salaDeCine = gf.leerFicheroEntradas("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\entradasVendidas.txt"); // aqui vamos a leer el fichero
    }

    //Metodos de clase

    /*
    Metodo que muestra las butacas que se encuentran en el cine
    Para ello recorremos el array para ambos lados ya que es bidimensional y lo mostramos
     */
    @Override
    public void mostrarButacas() {
        String [][] asientos = new String[10][10];
        salaDeCine = gf.leerFicheroEntradas("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\entradasVendidas.txt");
        for (int i = 0; i < salaDeCine.length-1; i++){
            for (int j = 0; j < salaDeCine[i].length-1; j++) {
                if (salaDeCine[i][j] == null){
                    asientos[i][j] = "__";
                }else {
                    asientos[i][j] = "xx";
                }
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    /*
    Metodo para comprar entrada donde preguntamos al usuario la fila y  asiento donde quiere la entrada,
    si to es correcto cambiamos la posicion de dicha butaca de -- a XX, y en entradas vendidas escribimos la fila y asiento
    junto al id del comprador con, gf.anadirFicheroEntrada
     */
    @Override
    public boolean comprarEntradas() {
        Scanner scan = new Scanner(System.in);
        Cine UbriCine = new Cine("UbriCine", 100, 0);

        String id;
        System.out.println("Dime tu id: ");
        id = scan.nextLine();
        int fila;
        System.out.println("En que fila quieres la entrada: ");
        fila = scan.nextInt();
        if (fila >= 0 && fila < 11) {
            System.out.println("Y que asiento: ");
            int asiento = scan.nextInt();
            if (asiento >= 0 && asiento < 11) {
                System.out.println("Entrada comprada");
                serviceUser.checkIDUser(id);
                Butaca butaca = new Butaca(fila, asiento, id);
                salaDeCine[fila][asiento] = butaca;
                gf.anadirFicheroEntrada(butaca, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\entradasVendidas.txt");
                return true;
            } else {
                System.out.println("Error");
                return false;
            }
        } else {
            System.out.println("Error");
            return false;
        }
    }

    @Override
    public boolean devolverEntrada() {Scanner scan = new Scanner(System.in);

        String id;
        System.out.println("Dime tu id: ");
        id = scan.nextLine();
        int fila;
        System.out.println("De que fila quieres devolver la entrada: ");
        fila = scan.nextInt();
        if (fila >= 0 && fila < 11) {
            System.out.println("Y que asiento: ");
            int asiento = scan.nextInt();
            if (asiento >= 0 && asiento < 11) {
                System.out.println("Entrada devuelta");
                serviceUser.checkIDUser(id);
                Butaca butaca = new Butaca(fila, asiento, id);
                salaDeCine[fila][asiento] = null;
                return true;
            } else {
                System.out.println("Error");
                return false;
            }
        } else {
            System.out.println("Error");
            return false;
        }

    }


    /*
    METODO QUE COMPRUEBA SI EL USUARIO EXISTE, recorremos el array bidimensional y comparamos si idUser coincide
    con algun id del array
     */
    @Override
    public boolean checkComprador(String idUser) {
        for (int i = 0; i < salaDeCine.length - 1; i++) {
            for (int j = 0; j < salaDeCine[i].length - 1; j++) {
                if (salaDeCine[i][j].getIdUsuario().equals(idUser)){
                    return true;
                }
            }
        }
        return false;
    }


    //METODO QUE LEE EL FICHERO QUE LE INDICAMOS EN LA RUTA
    @Override
    public void leerFicheroEntada() {
        this.salaDeCine = gf.leerFicheroEntradas("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\entradasVendidas.txt");
    }

    //METODO QUE AÑADE UNA BUTACA AL FICHERO QUE LE INDICAMOS EN LA RUTA
    @Override
    public void anadirFicheroEntada(Butaca butaca) {
        gf.anadirFicheroEntrada(butaca, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\entradasVendidas.txt");
    }

    //METODO QUE MODIFICA EL FICHERO QUE INDICAMOS EN LA RUTA
    @Override
    public void modificarFicheroEntrada() {
        gf.modificarFicherosEntradas(this.salaDeCine, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\entradasVendidas.txt");
    }
}
