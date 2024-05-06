package TEMA7.ProyetoQuiz;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Quiz1 {
    public static void main(String[] args) {

        File  fichero = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\Preguntas_Respuestas.txt");
        ArrayList<String> preguntas = new ArrayList<>();
        ArrayList<String> respuestas = new ArrayList<>();

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

        //EMPIEZA PROGRAMA
        // HACER 10 PREGUNTAS RAMDOM
        // ALMACENAR PUNTUACION
        // ESCRIBIR EN UN FICHERO NUEVO EL NOMBRE Y PUNTUACION

        ArrayList<String> preguntasPraJuego = new ArrayList<>();
        ArrayList<String> respuestasPraJuego = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Dime tu nombre completo: ");
        String nombre = scan.nextLine();
        int puntuacion = 0;

        Random r  = new Random();
        while (preguntasPraJuego.size() < 10) {
            int nRamdom = r.nextInt(preguntas.size());
            String pregunta = preguntas.get(nRamdom);
            String respuesta = respuestas.get(nRamdom);

            if (preguntasPraJuego.contains(pregunta)) {
                System.out.println("Pregunta duplicada");
            } else {
                preguntasPraJuego.add(pregunta);
                respuestasPraJuego.add(respuesta);
            }
        }



        //JUEGO NORMAL -> HACER LAS 10 PREGUNTAS
        String respuestaUsuario = "";

        for (int i = 0; i < preguntasPraJuego.size(); i++) {
            String pregunta = preguntasPraJuego.get(i);
            String respuesta = respuestasPraJuego.get(i);
            System.out.println(pregunta);
            respuestaUsuario = scan.nextLine();
            if (respuestaUsuario.equalsIgnoreCase(respuesta)) {
                System.out.println("Respuesta Correcta");
                puntuacion++;
            } else {
                System.out.println("Respuesta incorrecta, la respuesta era..." + respuesta);
            }
        }
        //ESCRIBIR EN EL FICHERO EL NOMBRE:PUNTUACION


        File ficheroPuntuacion = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\puntuacion.txt");

        // 2º Comprobar que el fichero existe
        if(ficheroPuntuacion.exists() && ficheroPuntuacion.isFile() && ficheroPuntuacion.canWrite()) {

            // 3º Abrir flujos (en este caso, de escritura) -> Lanza IOException
            FileWriter fw = null;
            try {
                fw = new FileWriter(ficheroPuntuacion, true);
                        // 4º Operar con el fichero
                        fw.write(nombre+ ":" +puntuacion+ "\n");



                // 5º Cerrar los flujos
                fw.close();


            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
                // Para cerrar el flujo en caso de error
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (Exception ex){
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}
