package TEMA8.TeoriaEventos;

import TEMA7.ProyectoQuizBien.model.Participante;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.InputMismatchException;

public class EventosListener extends JFrame {


    private int witdh = 600;
    private int height = 600;
    JButton enviar;
    JTextField campoTetxo;
    JLabel resultado;

    //Creamos los eventos
    MouseListener listenerDeEnviar = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            String texto = campoTetxo.getText();
            try{
                if (Integer.parseInt(texto)%2 == 0){
                    resultado.setText("Es par");
                }else {
                    resultado.setText("Es impar");
                }
                campoTetxo.setBackground(new Color(0, 0, 0));
            }catch (NumberFormatException d){
                campoTetxo.setBackground(new Color(255, 0, 0));
                resultado.setText("ERROR!");
            }
            System.out.println(texto);

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            // System.out.println("Entra el raton");
            enviar.setBackground(new Color(1, 81, 255));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            // System.out.println("Sale el raton");
            enviar.setBackground(new Color(200, 200, 200));
        }
    };

    KeyListener listenerTeclado = new KeyListener() {
        @Override
        public void keyTyped(KeyEvent e) {
            if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                String texto = campoTetxo.getText();
                try{
                    if (Integer.parseInt(texto)%2 == 0){
                        resultado.setText("Es par");
                    }else {
                        resultado.setText("Es impar");
                    }
                    campoTetxo.setBackground(new Color(0, 0, 0));
                }catch (NumberFormatException d){
                    campoTetxo.setBackground(new Color(255, 0, 0));
                    resultado.setText("ERROR!");
                }
                System.out.println(texto);

            }
        }

        @Override
        public void keyPressed(KeyEvent e) {

        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    };

    public EventosListener(){
        this.setSize(witdh, height);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Primera ventana");
        this.setResizable(false);
        ImageIcon imagen = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\media\\1409946.png");
        this.setIconImage(imagen.getImage());


        // JFrame tiene un layout por defecto de BorderLayout (CENTER, NORTH, SOUTH, WEST, EAST)
        JLabel titulo = new JLabel("eventos");
        titulo.setPreferredSize(new Dimension(100,100));
        titulo.setFont(new Font("Consolas", Font.BOLD, 32));
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelCentro = new JPanel();

        campoTetxo = new JTextField();
        campoTetxo.setPreferredSize(new Dimension(100, 32));
        campoTetxo.setBackground(new Color(0, 0, 0));
        campoTetxo.setForeground(new Color(255, 255, 255));
        campoTetxo.setFont(new Font("Consolas", Font.BOLD, 16));
        campoTetxo.addKeyListener(listenerTeclado);

        enviar = new JButton("Enviar");
        enviar.setPreferredSize(new Dimension(100, 32));
        enviar.addMouseListener(listenerDeEnviar);

        resultado = new JLabel();
        resultado.setFont(new Font("Consolas", Font.BOLD, 32));



        panelCentro.add(campoTetxo);
        panelCentro.add(enviar);
        panelCentro.add(resultado);

        this.add(panelCentro, BorderLayout.CENTER);
        this.add(titulo, BorderLayout.NORTH);
        this.setVisible(true);
    }



}
