package TEMA7.ProyetoQuiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {


        //Vamos a leer un fichero que va a contener preguntas y rrespuestas, separadas por dos puntos

        //0º Abrir fichero
        String ls = File.separator;
        File fichero = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\Preguntas_Respuestas.txt");

        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();


        /*
        try {
            //1º Comprobar si existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                //2º Abrir flujo de lectura
                //Vamos a operar con un BufferedReader, que admite por param un reader
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                //En este punto ya tenemos un BufferedReadera punto y listo para leer

                //3º Operar con el fichero
                String pregunta = "";
                String respuesta = "";

                String lineaDelFichero = br.readLine(); //Lee una linea
                while (lineaDelFichero != null){ //Si la linea es diferente de null
                    // System.out.println(lineaDelFichero); // Entonces la imprime
                    String[] lineaSeparada = lineaDelFichero.split(":"); //Separa la linea a partir de que encuentre :
                    pregunta = lineaSeparada[0];
                    respuesta = lineaSeparada[1];
                    preguntas.add(pregunta);
                    respuestas.add(respuesta);
                    lineaDelFichero = br.readLine(); // Y acto seguido lee la siguiente linea
                }
                for (int i = 0; i < preguntas.size(); i++){
                    System.out.println("Pregunta "+i+": "+preguntas.get(i));
                }

                for (int i = 0; i < respuestas.size(); i++){
                    System.out.println("Respuesta "+i+": "+respuestas.get(i));
                }

                //Cuando sale del buclesignifica que ya no hay mas lineas que leer

                //4º Cerrar los flujos
                br.close();
                fr.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }



        //Hacer un pequeño programa que te pregunte todas las preguntas,
        //compruebe si la respuesta es correcta
        //(opc) que vaya sumando el nº de respuestas correctas y sume la puntuacion


        try {
            //1º Comprobar si existe
            if (fichero.exists() && fichero.isFile() && fichero.canRead()) {
                //2º Abrir flujo de lectura
                //Vamos a operar con un BufferedReader, que admite por param un reader
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                //En este punto ya tenemos un BufferedReadera punto y listo para leer

                //3º Operar con el fichero
                String pregunta = "";
                String respuesta = "";

                String lineaDelFichero = br.readLine(); //Lee una linea
                while (lineaDelFichero != null){ //Si la linea es diferente de null
                    // System.out.println(lineaDelFichero); // Entonces la imprime
                    String[] lineaSeparada = lineaDelFichero.split(":"); //Separa la linea a partir de que encuentre :
                    pregunta = lineaSeparada[0];
                    respuesta = lineaSeparada[1];
                    preguntas.add(pregunta);
                    respuestas.add(respuesta);
                    lineaDelFichero = br.readLine(); // Y acto seguido lee la siguiente linea
                }
                Scanner scan = new Scanner(System.in);
                for (int i = 0; i < preguntas.size(); i++){
                    System.out.println("Pregunta "+i+": "+preguntas.get(i));
                }
                int contador = 0;

                System.out.println("Respuesta 0: ");
                String respuesta0 = scan.nextLine();
                if (respuesta0.equals(respuestas.get(0))){
                    contador = contador +1;
                }
                System.out.println("Respuesta 1: ");
                String respuesta1 = scan.nextLine();
                if (respuesta1.equals(respuestas.get(1))) {
                    contador = contador +1;
                }
                System.out.println("Respuesta 2: ");
                String respuesta2 = scan.nextLine();
                if (respuesta2.equals(respuestas.get(2))) {
                    contador = contador + 1;
                }
                System.out.println("Ha conseguido " +contador+ " puntos");

                //Cuando sale del buclesignifica que ya no hay mas lineas que leer

                //4º Cerrar los flujos
                br.close();
                fr.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al operar con el fichero");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error general... eliminando todos sus archivos");
        }
         */


        // Manera RAMDOM
        Scanner scan1 = new Scanner(System.in);
        String respuestaUsuario = "";
        String salir = "";
        int nCorrectas = 0;
        Random r = new Random();
        while (!salir.equalsIgnoreCase("si")){
            int nRandom = r.nextInt(preguntas.size());
            String pregunta = preguntas.get(nRandom);
            String respuesta = respuestas.get(nRandom);
            System.out.println(pregunta);
            respuestaUsuario = scan1.nextLine();

            if (respuestaUsuario.equalsIgnoreCase(respuesta)){
                System.out.println("Respuesta Correcta");
                nCorrectas++;
            }else {
                System.out.println("Respuesta incorrecta, la respuesta era..." +respuesta);
            }

            System.out.println("¿Salir? si/no");
            salir = scan1.nextLine();
        }

        System.out.println("Has acertado "+nCorrectas+ " preguntas");




    }
}
