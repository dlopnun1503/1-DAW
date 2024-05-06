package TEMA7.proyectoAirbnb.services;

import TEMA7.proyectoAirbnb.model.Alojamiento;
import TEMA7.proyectoAirbnb.model.Propietario;

import java.io.*;
import java.util.ArrayList;


public class GestionFichero {

    public ArrayList<Alojamiento> leerFicheroAlojamientos(String ruta) {

        ArrayList<Alojamiento> alojamientosTemporal = new ArrayList<>();

        // Al haber pasado la ruta por parámetros, podemos usar varios ficheros (malaga.csv o sevilla.csv)
        System.out.println("RUTA: " + ruta);

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists()) {

            FileReader fr = null;
            BufferedReader br = null;

            try {
                // 3º Abrimos los flujos de escrtura
                fr = new FileReader(fichero);
                br = new BufferedReader(fr);


                // 4º 0peramos con el fichero
                String linea = br.readLine();
                int i = 0;
                while (linea != null) {
                    if (i == 0) {
                        i++;
                    } else {

                        // Variables auxiliares
                        String id = "";
                        String name = "";
                        String host_id = "";
                        String host_name = "";
                        String price = "";

                        String[] valores = linea.split(",");

                        id = valores[0];
                        name = valores[1];
                        host_id = valores[2];
                        host_name = valores[3];
                        price = valores[9];

                        double price_d = 0;
                        try {
                            price_d = Double.parseDouble(price);
                        } catch (NumberFormatException e) {
                            e.printStackTrace();
                        }

                        Propietario p = new Propietario(host_id, host_name);
                        Alojamiento a = new Alojamiento(id, name, p, price_d);

                        alojamientosTemporal.add(a);

                    }
                    linea = br.readLine();
                }

                br.close();
                fr.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return alojamientosTemporal;
    }


    public void escribirFicheroAlojamientos(ArrayList<Alojamiento> alojamientos, String ruta) {

        // 1º Abrir el file

        // Creamos un objeto File utilizando la ruta, en este caso he escogido la absoluta
        File fichero = new File("C:\\Users\\Nicolas\\IdeaProjects\\TEMA7\\src\\resources\\datos_malaga.csv");

        // 2º Comprobar si el fichero existe

        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            // 3º Abrir flujos de escritura
            FileWriter fw = null;
            BufferedWriter bf = null;
            try {
                // Inicializamos el FileWriter y el BufferedWriter
                fw = new FileWriter(fichero);
                bf = new BufferedWriter(fw);

                // 4º Operamos con el fichero

                for (Alojamiento alojamiento : alojamientos) {
                    bf.write(alojamiento.toCSV());
                    bf.newLine();
                }

                // 5º Cerramos los flujos de escritura
                bf.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }

        } else {
            System.out.println("ERROR.....");
        }
    }
}






