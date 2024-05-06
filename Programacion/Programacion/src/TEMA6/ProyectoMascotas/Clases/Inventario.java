package TEMA6.ProyectoMascotas.Clases;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Mascota> mascotas;

    public Inventario() {
        mascotas = new ArrayList<>();
    }

    public void mostrarDatosAnimales() {
        //Recorremos el ArrayList
        for (int i = 0; i < mascotas.size(); i++) {
            mascotas.get(i).muestra();
        }
    }

    public void mostrarDatosDeUnAnimal(String nombre) {

        // 1º Declarar un objeto de tipo Mascota para almacenar la mascota encontrada
        Mascota mas = null;
        // 2º Recorro el arrayList mascotas para buscar por el nombre
        for (int i=0; i<mascotas.size(); i++) {
            if(mascotas.get(i).getNombre().equalsIgnoreCase(nombre)) {
                mas = mascotas.get(i);
                break;
            }
        }

        /*
        2 casos:

        1er caso. Que no haya encontrado la mascota
        -> mas sería null
        -> Cuando un objeto es null... "no tiene" ningún atributo, ni ningún método... nada...
        -> Entonces, si se intenta acceder a un método que no existe... saltaría una NullPointerException

        2o caso. QUe sí haya encontrado la mascota
        -> El objeto mas estaría inicializado
        -> Al estar inicializado, tendría todos sus métodos... atributos...
        -> Y no daría error.
         */

        try {
            mas.muestra();
        } catch (NullPointerException e) {
            System.out.println("Mascota no encontrada...");
        }

        /*
        2a Opción
        if(mas == null) {
            System.out.println("Mascota no encontrada...");
        } else {
            mas.muestra();
        }
         */
    }

    public void vaciarInventario() {
        mascotas.clear();
    }


    public void anadirMascota(Mascota m) {
        mascotas.add(m);
    }

    public boolean eleminiarMascota(String nombre) {
        boolean mascotaEliminada = false;
        for (int i = 0; i < mascotas.size(); i++) {
            if (mascotas.get(i).nombre.equals(nombre)) {
                mascotas.remove(i);
                mascotaEliminada = true;
                break;
            }
        }
        return mascotaEliminada;
    }

    public void mostrarTipoYNombreAnimal() {
        for (int i = 0; i < mascotas.size(); i++) {
            Mascota m = mascotas.get(i);

            //instanceof preguntasi es de la clase perro o gato....
            String tipo = "";
            if (m instanceof Perro) {
                tipo = "Perro";
            } else if (m instanceof Gato) {
                tipo = "Gato";
            } else if (m instanceof Canario) {
                tipo = "Canario";
            } else if (m instanceof Loro) {
                tipo = "Loro";
            }else {
                tipo = "Mascota";
            }
            System.out.println(m.getNombre()+": " +tipo);
        }
    }
}