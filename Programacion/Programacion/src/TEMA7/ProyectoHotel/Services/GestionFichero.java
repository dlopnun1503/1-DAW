package TEMA7.ProyectoHotel.Services;

import TEMA7.ProyectoHotel.Model.Alojamiento;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GestionFichero {

    public ArrayList<Alojamiento> leerFichero() {

        //0º Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Alojamiento> arrDePreguntasTemporal = new ArrayList<>();

        File fichero = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\malaga.csv");
        //2º Comprobar si existe
        try {
            //1º Comprobar si existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                //2º Abrir flujo de lectura
                //Vamos a operar con un BufferedReader, que admite por param un reader
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                //En este punto ya tenemos un BufferedReadera punto y listo para leer



                String lineaDelFichero = br.readLine(); //Lee una linea
                while (lineaDelFichero != null) { //Si la linea es diferente de null
                    System.out.println(lineaDelFichero); // Entonces la imprime
                    String[] lineaSeparada = lineaDelFichero.split(","); //Separa la linea a partir de que encuentre :
                    lineaDelFichero = br.readLine(); // Y acto seguido lee la siguiente linea
                }
                //Cuando sale del buclesignifica que ya no hay mas lineas que leer

                //4º Cerrar los flujos
                br.close();
                fr.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }

        return arrDePreguntasTemporal;
    }
}
