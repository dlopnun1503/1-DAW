package TEMA8.proyectoMiniCalculadora1;

import TEMA8.TeoriaEventos.EventosListener;
import TEMA8.proyectoMiniCalculadora1.ui.FrameCalculadora1;

import javax.swing.*;

public class MiniCalculadora1 {
    public static void main(String[] args) {


        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        FrameCalculadora1 fc = new FrameCalculadora1();
                    }
                }
        );



    }
}
