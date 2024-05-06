package TEMA7.Teoria;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class BufferedTeoria {
    public static void main(String[] args) {
        
        
       //TEORIA BUFFERED READER
        
        /*
        BufferedReader es una clase en Java que hereda de Reader
        Esta clase BufferedReader añade funcionalidads muy utiles como puede ser el metodo
        .readLine(): String
        Este metodo .readLine lee una linea entera del fichero y la devuelve en forma de String 
        
        Para construir un objeto de tipo BufferedReader, le pasamos por parametro otro metodo Reader
         */

        //0º Abrir fichero
        String ls = File.separator;
        File fichero = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\buffered_fichero.txt");

        try {
            //1º Comprobar si existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                //2º Abrir flujo de lectura
                //Vamos a operar con un BufferedReader, que admite por param un reader
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                //En este punto ya tenemos un BufferedReadera punto y listo para leer

                //3º Operar con el fichero
                String lineaDelFichero = br.readLine(); //Lee una linea
                while (lineaDelFichero != null){ //Si la linea es diferente de null
                    System.out.println(lineaDelFichero); // Entonces la imprime
                    lineaDelFichero = br.readLine(); // Y acto seguido lee la siguiente linea
                }
                //Cuando sale del buclesignifica que ya no hay mas lineas que leer

                //4º Cerrar los flujos
                br.close();
                fr.close();
            }
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error");
        }
    }
}
