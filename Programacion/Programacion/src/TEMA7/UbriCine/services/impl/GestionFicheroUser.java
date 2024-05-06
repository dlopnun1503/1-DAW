package TEMA7.UbriCine.services.impl;

import TEMA7.UbriCine.model.Usuario;

import java.io.*;
import java.util.ArrayList;

public class GestionFicheroUser {


    public ArrayList<Usuario> leerFicheroUser(String ruta) {

        ArrayList<Usuario> arrUsersTempporal = new ArrayList<>();

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
                    String id_user = "";
                    String name_user = "";
                    String password_user = "";
                    String is_admin_user = "";

                    String[] valores = linea.split(":");
                    id_user = valores[0];
                    name_user = valores[1];
                    password_user = valores[2];
                    is_admin_user = valores[3];
                    boolean isAdmin = Boolean.parseBoolean(is_admin_user);

                    Usuario u = new Usuario(id_user,name_user,password_user, isAdmin);
                    arrUsersTempporal.add(u);

                    linea = br.readLine();


                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arrUsersTempporal;
    }


    public void modificarFicherosUsers (ArrayList<Usuario> usuarios, String ruta){

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
                // a) Recorremos el arrayList que queremos escribir en el fichero
                for (Usuario u : usuarios) {
                    // b) escribrimos en el fichero
                    bw.write(u.getId()+":"+u.getName()+":"+u.getPassword()+":");
                    bw.write(u.isIs_admin()+"");
                    bw.write("\n");
                }

                // 5º Cerrar flujos
                bw.close();
                fw.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public void anadirFicheroUsers(Usuario u, String ruta) {
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
                bw.write(u.getId()+":"+u.getName()+":"+u.getPassword()+":");
                bw.write(u.isIs_admin()+"");
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
