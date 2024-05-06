package TEMA7.UbriCine.services.api;

import TEMA7.UbriCine.model.Butaca;
import TEMA7.UbriCine.model.Usuario;

public interface BasicServiceEntradas {

    public void mostrarButacas();
    public boolean comprarEntradas();
    public boolean devolverEntrada();
    public boolean checkComprador(String idUser);
    public void leerFicheroEntada();
    public void anadirFicheroEntada(Butaca butaca);
    public void modificarFicheroEntrada();




}
