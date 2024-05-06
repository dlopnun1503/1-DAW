package TEMA7.UbriCine.services.impl;

import TEMA7.UbriCine.services.api.BasicLoggerService;

import java.time.LocalDateTime;

public class LoggerService implements BasicLoggerService {

    // ATRIBUTOS DE CLASE
    private GestionFicheroLog gestion;
    GestionFicheroLog gestionFicheroLog = new GestionFicheroLog();

    // CONSTRUCTORES DE CLASE
    public LoggerService(){
        this.gestion = new GestionFicheroLog();
    }

    public LoggerService(GestionFicheroLog gestion){
        this.gestion = gestion;
    }


    // Con este método especificamos lo que se debe escribir al darse de alta en el fichero logs.txt
    @Override
    public boolean logAlta(String id, String correcto) {
        String mensaje = id +";"+LocalDateTime.now()+";Alta;" + correcto;
        gestionFicheroLog.anadirFicheroLog(mensaje, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\logs\\logs.txt");
        return true;
    }

    // Con este método especificamos lo que se debe escribir al loguearse en el fichero logs.txt
    @Override
    public boolean logLogin(String id, String correcto) {
        String mensaje = id +";"+LocalDateTime.now()+";Login;"+ correcto;
        gestionFicheroLog.anadirFicheroLog(mensaje, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\logs\\logs.txt");
        return true;
    }

    @Override
    public void anadirFicheroLogger(String mensaje) {
        this.gestion.anadirFicheroLog(mensaje, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\users\\users.txt");
    }
}
