package TEMA7.UbriCine.services.api;

public interface BasicLoggerService {


    public boolean logAlta(String id, String correcto);
    public boolean logLogin(String id, String correcto);
    public void anadirFicheroLogger(String mensaje);


}
