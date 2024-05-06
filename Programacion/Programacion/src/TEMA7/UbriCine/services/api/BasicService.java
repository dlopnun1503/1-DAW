package TEMA7.UbriCine.services.api;

import TEMA7.UbriCine.model.Usuario;

public interface BasicService {


    public boolean altaUsuario();
    public boolean loginUsuario();
    public boolean userExists(String id);
    public boolean checkUser(String id, String password);
    public void leerFicheroUser();
    public void anadirFicheroUser(Usuario u);
    public void modificarFicheroUser();
    public String checkIDUser(String id);


}
