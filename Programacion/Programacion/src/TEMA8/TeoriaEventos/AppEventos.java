package TEMA8.TeoriaEventos;

import TEMA8.Calculadora.FramePrincipal;

import javax.swing.*;

public class AppEventos {
    public static void main(String[] args) {



        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        EventosListener el = new EventosListener();
                    }
                }
        );



    }
}
