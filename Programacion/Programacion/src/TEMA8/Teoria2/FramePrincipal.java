package TEMA8.Teoria2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;

public class FramePrincipal extends JFrame {

    public FramePrincipal (){
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Primera ventana");
        this.setResizable(false);
        ImageIcon imagen = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\media\\1409946.png");
        this.setIconImage(imagen.getImage());


        JPanel panelPrincipal = new JPanel();
        panelPrincipal.setBackground(new Color(0, 255, 0));


        JLabel texto1 = new JLabel();
        texto1.setText("Usuario");
        JLabel texto2 = new JLabel();
        texto2.setText("Contrasenia");

        JTextField texto3 = new JTextField();
        texto3.setPreferredSize(new Dimension(100, 22));

        JPasswordField password = new JPasswordField();
        password.setText("");
        password.setPreferredSize(new Dimension(100, 22));
        password.setEchoChar('*');


        ImageIcon imgenSend = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\media\\send-4008.png");

        JButton botonEnviar = new JButton();
       // botonEnviar.setText("Enviar");
        botonEnviar.setIcon(imgenSend);
        botonEnviar.setPreferredSize(new Dimension(22, 22));
        botonEnviar.setBorder(null);

        JToggleButton botonActivar = new JToggleButton("Activar");
        botonActivar.setPreferredSize(new Dimension(70, 70));
        botonActivar.setFont(new Font("Arial", Font.ITALIC, 10));
        botonActivar.setSelected(true);

        JCheckBox opciones1 = new JCheckBox("Prueba1");
        JCheckBox opciones2 = new JCheckBox("Prueba2");
        JCheckBox opciones3 = new JCheckBox("Prueba3");

        JSeparator separator = new JSeparator();
        separator.setPreferredSize(new Dimension(100,100));

        JRadioButton boton1 = new JRadioButton("Boton1");
        JRadioButton boton2 = new JRadioButton("Boton2");
        JRadioButton boton3 = new JRadioButton("Boton3");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(boton1);
        grupo.add(boton2);
        grupo.add(boton3);


        panelPrincipal.add(texto1);
        panelPrincipal.add(texto3);
        panelPrincipal.add(texto2);
        panelPrincipal.add(password);
        panelPrincipal.add(botonEnviar);
        panelPrincipal.add(botonActivar);
        panelPrincipal.add(opciones1);
        panelPrincipal.add(opciones2);
        panelPrincipal.add(opciones3);
        panelPrincipal.add(separator);
        panelPrincipal.add(boton1);
        panelPrincipal.add(boton2);
        panelPrincipal.add(boton3);



        this.add(panelPrincipal);
        this.setVisible(true);
    }



}
