package TEMA7.UbriCine.services.impl;

import TEMA7.UbriCine.model.Butaca;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroEntradas {

    public Butaca[][] leerFicheroEntradas(String ruta) {

       Butaca[][] arrButacasTemporal = new Butaca[10][10];

        //1º Abrir file
        try {
            File fichero = new File(ruta);
            if (fichero.exists()) {
                // 2º Abrir flujos
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);

                //3º Operar con el fichero
                String linea = br.readLine();
                while (linea != null) {
                    String fila = "";
                    String asiento = "";
                    String idUsuario = "";

                    String[] valores = linea.split(":");
                    fila = valores[0];
                    asiento = valores[1];
                    idUsuario = valores[2];

                    Butaca butaca = new Butaca(Integer.parseInt(fila), Integer.parseInt(asiento), idUsuario);
                    arrButacasTemporal[butaca.getFila()][butaca.getAsiento()] = butaca;


                    linea = br.readLine();


                    // 5º Cerrar flujos
                    fr.close();
                    br.close();

                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrButacasTemporal;
    }


    public void modificarFicherosEntradas (Butaca[][] butacas, String ruta){

        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura
                fw = new FileWriter(fichero, false);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                // a) Recorremos el array que queremos escribir en el fichero
                for (int i = 0; i < butacas.length-1; i++) {
                    for (int j = 0; j < butacas[i].length - 1; j++) {
                        // b) escribrimos en el fichero
                        bw.write(butacas[i][j].getFila() + ":" + butacas[i][j].getAsiento() + ":" + butacas[i][j].getIdUsuario());
                        bw.write("\n");
                    }
                }

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void anadirFicheroEntrada(Butaca butaca, String ruta) {
        // 1º Abrimos el fichero
        File fichero = new File(ruta);

        // 2º Comprobamos que existe
        if (fichero.exists() && fichero.isFile() && fichero.canWrite()) {

            FileWriter fw = null;
            BufferedWriter bw = null;

            try {
                // 3º Abrimos los flujos de escritura
                fw = new FileWriter(fichero, true);
                bw = new BufferedWriter(fw);


                // 4º 0peramos con el fichero
                bw.write(butaca.getFila()+":"+butaca.getAsiento()+":"+butaca.getIdUsuario());
                bw.write("\n");


                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
