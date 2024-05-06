package TEMA8.TeoriaLayouts.LayoutBorder;

import javax.swing.*;
import java.awt.*;

public class FrameBorder extends JFrame {
    // Los JFrame se inicializan por defecto con un BorderLayout

    public FrameBorder(){
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Primera ventana");
        this.setResizable(false);
        ImageIcon imagen = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\media\\1409946.png");
        this.setIconImage(imagen.getImage());

        //Vamos a crear 4 JPanel y añadirlos en diferentes posiciones del BorderLayout
        JPanel panelCentro = new JPanel();
        panelCentro.setBackground(new Color(255, 100, 100));
        panelCentro.setLayout(new BorderLayout());

        JPanel panelNorte = new JPanel();
        panelNorte.setBackground(new Color(100, 0, 255));
        panelNorte.setPreferredSize(new Dimension(100, 200));

        JPanel panelSur = new JPanel();
        panelSur.setBackground(new Color(255, 255, 0));
        panelSur.setPreferredSize(new Dimension(100, 100));

        JPanel panelOeste = new JPanel();
        panelOeste.setBackground(new Color(100, 100, 100));
        panelOeste.setPreferredSize(new Dimension(100, 100));

        JPanel panelEste = new JPanel();
        panelEste.setBackground(new Color(0, 255, 100));
        panelEste.setPreferredSize(new Dimension(100, 100));

        JPanel panelCentroEste = new JPanel();
        panelCentroEste.setBackground(new Color(234, 5, 5));
        panelCentroEste.setPreferredSize(new Dimension(100, 100));

        JPanel panelCentroOeste = new JPanel();
        panelCentroOeste.setBackground(new Color(237, 239, 232));
        panelCentroOeste.setPreferredSize(new Dimension(100, 100));

        JPanel panelCentroNorte = new JPanel();
        panelCentroNorte.setBackground(new Color(0, 0, 0));
        panelCentroNorte.setPreferredSize(new Dimension(100, 100));

        JPanel panelCentroSur = new JPanel();
        panelCentroSur.setBackground(new Color(246, 76, 2));
        panelCentroSur.setPreferredSize(new Dimension(100, 100));

        JPanel panelCentroCentro = new JPanel();
        panelCentroCentro.setBackground(new Color(106, 255, 6));
        panelCentroCentro.setPreferredSize(new Dimension(100, 100));

        this.add(panelCentro, BorderLayout.CENTER);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelSur, BorderLayout.SOUTH);
        this.add(panelOeste, BorderLayout.WEST);
        this.add(panelEste, BorderLayout.EAST);
        panelCentro.add(panelCentroEste, BorderLayout.EAST);
        panelCentro.add(panelCentroCentro, BorderLayout.CENTER);
        panelCentro.add(panelCentroOeste, BorderLayout.WEST);
        panelCentro.add(panelCentroNorte, BorderLayout.NORTH);
        panelCentro.add(panelCentroSur, BorderLayout.SOUTH);


        this.setVisible(true);
    }



}
