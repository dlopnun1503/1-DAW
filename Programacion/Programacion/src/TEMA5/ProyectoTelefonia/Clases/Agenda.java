package TEMA5.ProyectoTelefonia.Clases;

import javax.swing.*;
import java.util.ArrayList;

public class Agenda {

    //ATRIBUTOS DE CLASE
    private ArrayList<Contacto> agenda;

    //CONSTRUCTOR DE CLASE
    public Agenda(ArrayList<Contacto> agenda) {
        this.agenda = new ArrayList<>();
    }

    //METODOS DE CLASE
    public boolean anadirContacto(Contacto c){
        boolean contactoAnadido = true;
        //Recorremos el ArrayList para comprobar si el contacto existe
        for (int i = 0; i < agenda.size(); i++){
            if (c.getNombre().equals(agenda.get(i).getNombre())){
                contactoAnadido = false;
            }
        }
        if (contactoAnadido){
            agenda.add(c);
            System.out.println("Contacto anadido");
        }else {
            System.out.println("No se ha podido anadir");
        }
        return contactoAnadido;
    }

    public boolean eliminarContacto(String nombre){
        boolean contactoEliminado = false;
        //Recorremos el ArrayList para comprobar si el contacto existe y poder borrarlo
        for (int i = 0; i < agenda.size(); i++){
            if (nombre.equals(agenda.get(i).getNombre())){
                agenda.remove(i);
                contactoEliminado = true;
                System.out.println("Contacto eliminado");
            } else {
                System.out.println("No se ha podido eliminar");
            }
        }
        return contactoEliminado;
    }

    public Contacto existeContacto(String nombre){
        Contacto contactoExistente = null;
        //Recorremos el ArrayList para comprobar si el contacto existe
        for (int i = 0; i < agenda.size(); i++){
            if (nombre.equals(agenda.get(i).getNombre())){
                contactoExistente = new Contacto(nombre, agenda.get(i).getTelefono());
                System.out.println("Contacto existente");
            } else {
                System.out.println("No se ha podido encontrar dicho contacto");
            }
        }
        return contactoExistente;
    }

    public void listarContacto(){
        //Recorremos el ArrayList y mostramos los nombres de los contactos
        for (int i = 0; i < agenda.size(); i++){
            System.out.println(agenda.get(i).getNombre());
        }
    }

    public int buscaContacto(String nombre) {
        int posContacto = 0;
        for (int i = 0; i < agenda.size(); i++) {
            if (nombre.equals(agenda.get(i).getNombre())) {
                posContacto = i + 1;
                System.out.println(agenda.get(i).getNombre()+ ": "+ agenda.get(i).getTelefono());
            }
        }
        return posContacto;
    }


    //GETTERS AND SETTER
    public ArrayList<Contacto> getAgenda() {
        return agenda;
    }

    public void setAgenda(ArrayList<Contacto> agenda) {
        this.agenda = agenda;
    }
}
