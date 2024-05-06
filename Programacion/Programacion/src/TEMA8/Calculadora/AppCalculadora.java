package TEMA8.Calculadora;

import TEMA8.Calculadora.FramePrincipal;

import javax.swing.*;

public class AppCalculadora {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        FramePrincipal fp = new FramePrincipal();
                    }
                }
        );




    }
}
