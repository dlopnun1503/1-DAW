package TEMA8.Teoria;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class Main {
    public static void main(String[] args) {

        JFrame marcoPrincipal = new JFrame();
        marcoPrincipal.setVisible(true);
        marcoPrincipal.setSize(800, 600);
        marcoPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoPrincipal.setTitle("Primera ventana");
        marcoPrincipal.setResizable(false);
        ImageIcon imagen = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\1409946.png");
        marcoPrincipal.setIconImage(imagen.getImage());




    }
}
