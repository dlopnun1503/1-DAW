package TEMA7.ProyectoQuizBien.services;

import TEMA7.ProyectoQuizBien.model.Participante;
import TEMA7.ProyectoQuizBien.model.Pregunta;
import TEMA7.ProyectoQuizBien.model.Puntuacion;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class GestionFichero {


    /*
    Va a tener dos metodos
    1º Va a ser para leer un fichero y volcar la informacion en el ArrayList de preguntas




    2º Va a ser para escribir en un fichero la informacion que viene desde el ArrayList de participantes
      */


    public ArrayList<Pregunta> leerFicheroPreguntas() {

        //0º Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Pregunta> arrDePreguntasTemporal = new ArrayList<>();

        File fichero = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\Preguntas_Respuestas.txt");
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
                while (lineaDelFichero != null) { //Si la linea es diferente de null
                    // System.out.println(lineaDelFichero); // Entonces la imprime
                    String[] lineaSeparada = lineaDelFichero.split(":"); //Separa la linea a partir de que encuentre :
                    pregunta = lineaSeparada[0];
                    respuesta = lineaSeparada[1];
                    Pregunta p = new Pregunta(pregunta, respuesta);
                    arrDePreguntasTemporal.add(p);
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


    public void escribirFicheroPuntuaciones(ArrayList<Participante> arrPar) {

        ArrayList<Puntuacion> puntuaciones = new ArrayList<>();

        File ficheroPuntuacion = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\puntuacion.txt");

        // 2º Comprobar que el fichero existe
        if (ficheroPuntuacion.exists() && ficheroPuntuacion.isFile() && ficheroPuntuacion.canWrite()) {

            // 3º Abrir flujos (en este caso, de escritura) -> Lanza IOException
            FileWriter fw = null;
            try {
                fw = new FileWriter(ficheroPuntuacion, true);
                // 4º Operar con el fichero
                for (int i = 0; i < arrPar.size(); i++) {
                    fw.write(arrPar.get(i).getId() + ":[");

                    // Recorres el arrayList de puntuaciones
                    // Escribes la fecha:puntuacion;
                    for (int j = 0; j < arrPar.get(i).getPuntuaciones().size(); j++) {
                        fw.write(arrPar.get(i).getPuntuaciones().get(j).toString());

                    }
                    // Escribes ]\n
                    fw.write("]"+"\n");
                    // 5º Cerrar los flujos
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
                // Para cerrar el flujo en caso de error
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (Exception ex) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    public ArrayList<Participante> leerFicherPuntuacion(){
        //0º Crear e inicializar el ArrayList que al final pasaremos a la clase Trivial
        ArrayList<Participante> participantes = new ArrayList<>();

        File fichero1 = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\puntuacion.txt");
        try {
            //1º Comprobar si existe
            if (fichero1.exists() && fichero1.isFile() && fichero1.canRead()) {
                //2º Abrir flujo de lectura
                //Vamos a operar con un BufferedReader, que admite por param un reader
                FileReader fr = new FileReader(fichero1);
                BufferedReader br = new BufferedReader(fr);
                //En este punto ya tenemos un BufferedReadera punto y listo para leer

                //3º Operar con el fichero
                Scanner scan = new Scanner(System.in);
                String nombre = "";
                String id;

                String lineaDelFichero = br.readLine(); //Lee una linea
                while (lineaDelFichero != null) { //Si la linea es diferente de null
                    // System.out.println(lineaDelFichero); // Entonces la imprime
                    //Separa la linea a partir de que encuentre :
                    System.out.println("Dime tu nombre: ");
                    nombre = scan.nextLine();
                    System.out.println("Dime tu id: ");
                    id = scan.nextLine();
                    Participante p = new Participante(nombre, id);
                    participantes.add(p);
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

        return participantes;
    }

    public ArrayList<Pregunta> escribirFicheroPreguntas(){

        ArrayList<Pregunta> preguntas = new ArrayList<>();

        File ficheroPregunta = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\proyectoQuiz\\Preguntas_Respuestas.txt");

        // 2º Comprobar que el fichero existe
        if (ficheroPregunta.exists() && ficheroPregunta.isFile() && ficheroPregunta.canWrite()) {

            // 3º Abrir flujos (en este caso, de escritura) -> Lanza IOException
            FileWriter fw = null;
            try {
                fw = new FileWriter(ficheroPregunta, true);
                // 4º Operar con el fichero
                for (int i = 0; i < preguntas.size(); i++) {
                    fw.write("");
                    // 5º Cerrar los flujos
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al operar con el fichero");
                // Para cerrar el flujo en caso de error
                if (fw != null) {
                    try {
                        fw.close();
                    } catch (Exception ex) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return preguntas;
    }


    }

