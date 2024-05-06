package TEMA7.Teoria.Ejemplos;

import java.io.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejemplo1 {
    public static void main(String[] args) {


        /*
        Enunciado
        Crear un programa que lea un fichero de texto plano y lea las palabras que hay en el.
        El programa debe mostrar el numero de palabras que hay
        (Opcional) Mostrar las palabras tambien
         */


        // 1º Abrir el fichero
        File fichero1 = new File("resources/archivosTema7/archivosEjemplos/fich_ejemplo1.txt");
        //2º Comprobar si existe
        if(fichero1.exists() && fichero1.isFile() && fichero1.canRead()){

            //3º Abrir flujos de lectura -> Lanza IO exception
            FileReader fr = null;
            try {
                fr = new FileReader(fichero1);

                //4º Operar con el fichero
                int caracter = 0;
                int numPalabras = 0;
                    while (caracter != -1) {//MIENTRAS SEA DISTINTO DE -1 SEGUIMOS LEYENDO
                        caracter = fr.read(); // fr.read devuelve un entero... El caracter en unicode
                        if (caracter == 32 || caracter == -1) {
                            numPalabras ++;
                        }
                    }
                System.out.println("El numero de palabras es " + numPalabras);

                //5º Cerramos el flujo
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
            }
        }



    }
}
