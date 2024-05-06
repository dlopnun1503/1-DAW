package TEMA4.proyectoArticulo;

import TEMA4.proyectoArticulo.Clases.Articulo;
import TEMA4.proyectoCoche.Clase.Coche;

import java.util.Scanner;

public class MainArticulo {
    public static void main(String[] args) {



        Articulo coche = new Articulo();
        coche.precioBase = 10000.0;;
        coche.stock = 23;
        coche.nombre = "Mercedes";
        coche.id = "1";
        coche.tipo = "3";
        coche.descripcion = "todoterreno";




        Articulo moto = new Articulo();
        moto.precioBase = 20000.0;;
        moto.stock = 37;
        moto.nombre = "ducati";
        moto.id = "2";
        moto.tipo = "3";
        moto.descripcion = "cross";




        Articulo aceite = new Articulo();
        aceite.precioBase = 10.0;;
        aceite.stock = 20233;
        aceite.nombre = "aceite";
        aceite.id = "3";
        aceite.tipo = "1";
        aceite.descripcion = "virgen extra";





        coche.calcularPrecioConIva();
        moto.calcularPrecioConIva();
        aceite.calcularPrecioConIva();

        coche.imprimirDatosProducto();
        moto.imprimirDatosProducto();
        aceite.imprimirDatosProducto();

        int opc = 0;
        Scanner scan = new Scanner(System.in);


        do {
            System.out.println("Bienvenid@ a gestion de stock");
            System.out.println("1. Anadir stock");
            System.out.println("2. Venta");
            System.out.println("3. Consultar stock");
            System.out.println("0. Salir");
            opc = scan.nextInt();

            if(opc < 0 || opc > 3) {
                System.out.println("Opcion incorrecta");
            }else if(opc == 0) {
                System.out.println("Saliendo...");
            } else {
                System.out.println("1. Coche");
                System.out.println("2. Moto");
                System.out.println("3. Aceite");
                if(opc == 1) {
                    // Anadir Stock
                    System.out.print("Anadir Stock. Indique el producto: ");
                    int producto = 0;
                    producto = scan.nextInt();

                    System.out.print("Indique la cantidad: ");
                    int cantidad = scan.nextInt();

                    if(producto == 1) {
                        coche.reponerStock(cantidad);
                    } else if(producto == 2) {
                        moto.reponerStock(cantidad);
                    } else if(producto == 3) {
                        aceite.reponerStock(cantidad);
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else if (opc == 2) {
                    // Venta de producto
                    System.out.print("Venta. Indique el producto:");
                    int producto = 0;
                    producto = scan.nextInt();

                    if(producto == 1) {
                        coche.vender();
                    } else if(producto == 2) {
                        moto.vender();
                    } else if(producto == 3) {
                        aceite.vender();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                } else {
                    // Consultar stock
                    System.out.print("Consulta Stock. Indique el producto:");
                    int producto = 0;
                    producto = scan.nextInt();

                    if(producto == 1) {
                        coche.hayStock();
                    } else if(producto == 2) {
                        moto.hayStock();
                    } else if(producto == 3) {
                        aceite.hayStock();
                    } else {
                        System.out.println("Opcion incorrecta");
                    }
                }
            }
        } while(opc != 0);
    }
}