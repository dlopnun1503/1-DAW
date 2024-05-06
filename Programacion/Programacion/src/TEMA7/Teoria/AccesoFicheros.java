package TEMA7.Teoria;

import java.io.File;
import java.io.IOException;

public class AccesoFicheros {
    public static void main(String[] args) {


        //PARA CREAR UN OBJETO DE TIPO FILE DEBEMOS LLAMAR AL CONSTRUCTOR DE LA CLASE FILE
        File fichero1 = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\fich_noexiste.txt");

        //EN ESTE PUNTO YA TENEMOS UN OBJETO DE TIPO FILE, EN ESTE CASO, EL FICHERO QUE HEMOS CREADO
        if (fichero1.exists()) {
            System.out.println("El fichero existe y tiene el nombre " + fichero1.getName());
        } else {
            System.out.println("El fichero no existe, procedemos a crearlo");
            try {
                fichero1.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Error al  crear el fichero");
            }
        }


        //VAMOS A OBTENER INFORMACION DEL FICHERO
        try {
            System.out.println("nombre: " + fichero1.getName());
            System.out.println("Padre del fichero: " + fichero1.getParent());
            System.out.println("Ruta absoluta del fichero: " + fichero1.getAbsolutePath());
            System.out.println("Ruta canonica del fichero: " + fichero1.getCanonicalPath());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error al obtener datos del fichero");
        }


        //VAMOS A INTENTAR BORRAR EL FICHERO
        if (fichero1.delete()) {
            System.out.println("Se ha eliminado el fichero");
        } else {
            System.out.println("No se ha podido eliminar el fichero");
        }

        //EJERCICIO CLASE
        //Hay que acceder al directorio alumnos
        File alumnos = new File("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\alumnos");
        //Preguntar si existe
        //Si existe, listar los ficheros del directorio
        if (alumnos.exists()) {
            File[] ficherosDelDirectorio = alumnos.listFiles();
            // .listFiles devuelve un array con todos los Files contenidos en el directorio
            //Tenemos que recorrer el array
            for (int i = 0; i < ficherosDelDirectorio.length; i++) {
                String nombreDelFichero = ficherosDelDirectorio[i].getName();
                System.out.println("Nombre: " + nombreDelFichero);
            }


        }
    }
}

