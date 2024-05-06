package TEMA8.proyectoMiniCalculadora1.ui;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelCalculadora1 extends JPanel {

    JTextField textFieldValor1;
    JTextField textFieldValor2;
    JButton botonSuma;
    JButton botonResta;
    JButton botonMultiplicacion;
    JButton botonDivision;
    JLabel labelResultado;

    //Eventos
    MouseListener listenerMouse = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
            JButton b = (JButton) e.getSource(); // Identificamos el boton que ha sido pulsado
            try {
                if (b.getText().equals(botonSuma.getText())) {
                    double suma = Integer.parseInt(textFieldValor1.getText()) + Integer.parseInt(textFieldValor2.getText());
                    labelResultado.setText(suma+ "");
                } else if (b.getText().equals(botonResta.getText())) {
                    double resta = Integer.parseInt(textFieldValor1.getText()) - Integer.parseInt(textFieldValor2.getText());
                    labelResultado.setText(resta+ "");
                } else if (b.getText().equals(botonMultiplicacion.getText())) {
                    double multiplicacion = Integer.parseInt(textFieldValor1.getText()) * Integer.parseInt(textFieldValor2.getText());
                    labelResultado.setText(multiplicacion+ "");
                } else if (b.getText().equals(botonDivision.getText())) {
                    double division = Integer.parseInt(textFieldValor1.getText()) / Integer.parseInt(textFieldValor2.getText());
                    labelResultado.setText(division+ "");
                }
            } catch (NumberFormatException ex) {
                System.out.println("ERROR");
            }
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(200, 255, 200));
            b.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            JButton b = (JButton) e.getSource();
            b.setBackground(new Color(200, 255, 255));
            b.setBorder(new LineBorder(new Color(0, 0, 0), 1));
        }
    };

    public PanelCalculadora1(){
        this.setLayout(new BorderLayout());
        this.setBackground(new Color(200, 200, 200));

        //Inicializamos los elementos
        textFieldValor1 = new JTextField("Introduzca valor 1");
        textFieldValor2 = new JTextField("Introduzca valor 2");
        botonSuma = new JButton("+");
        botonResta = new JButton("-");
        botonMultiplicacion = new JButton("*");
        botonDivision = new JButton("/");
        labelResultado = new JLabel();

        //Modificamos los atributos/valores/aspectos de los elementos
        textFieldValor1.setPreferredSize(new Dimension(300, 200));
        textFieldValor2.setPreferredSize(new Dimension(300, 200));
        botonSuma.setPreferredSize(new Dimension(150, 200));
        botonResta.setPreferredSize(new Dimension(150, 200));
        botonMultiplicacion.setPreferredSize(new Dimension(150, 200));
        botonDivision.setPreferredSize(new Dimension(150, 200));
        labelResultado.setPreferredSize(new Dimension(600, 200));

        //Añadimos los eventos
        botonSuma.addMouseListener(listenerMouse);
        botonResta.addMouseListener(listenerMouse);
        botonMultiplicacion.addMouseListener(listenerMouse);
        botonDivision.addMouseListener(listenerMouse);

        JPanel panelNorte = new JPanel(new GridLayout(1, 2));
        JPanel panelCentro = new JPanel(new GridLayout(1, 4));


        //Añadimos al JPanel
        panelNorte.add(textFieldValor1);
        panelNorte.add(textFieldValor2);
        panelCentro.add(botonSuma);
        panelCentro.add(botonResta);
        panelCentro.add(botonMultiplicacion);
        panelCentro.add(botonDivision);
        this.add(panelNorte, BorderLayout.NORTH);
        this.add(panelCentro, BorderLayout.CENTER);
        this.add(labelResultado, BorderLayout.SOUTH);




    }


}
