package TEMA5.ProyectoAgenda.Services;

import TEMA5.ProyectoAgenda.Clases.Persona;

import java.util.ArrayList;

public class AgendaService {

    private static ArrayList<Persona> agenda = new ArrayList<Persona>();

    public boolean addPersona(Persona persona){
        boolean personaExiste = false;
        for (int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getDni().equals(persona.getDni())) {
                personaExiste = true;
            }
        }

        if(personaExiste==true) {
            return false;
        } else {
            agenda.add(persona);
            System.out.println("Persona correctamente anadida");
        }
        return true;
    }

    public boolean deletePersona(Persona persona){
        boolean personaExiste = false;
        for (int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getDni().equals(persona.getDni())) {
                personaExiste = true;
            }
        }

        if(personaExiste==true) {
            return false;
        } else {
            agenda.remove(persona);
            System.out.println("Persona correctamente eliminada");
        }
        return true;
    }

    public boolean checkPersona(String dni){
        boolean personaCheck = false;
        for (int i = 0; i < agenda.size(); i++){
            if (agenda.get(i).getDni().equals(dni)) {
                System.out.println("Esa persona ya se encuentra en la lista");
                personaCheck = true;
            }
        }
        return personaCheck;
    }


}
