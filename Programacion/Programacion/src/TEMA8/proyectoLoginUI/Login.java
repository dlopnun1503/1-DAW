package TEMA8.proyectoLoginUI;

import TEMA8.Calculadora.FramePrincipal;
import TEMA8.proyectoLoginUI.ui.FrameLogin;

import javax.swing.*;

public class Login {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        FrameLogin fl = new FrameLogin();
                    }
                }
        );

    }
}
