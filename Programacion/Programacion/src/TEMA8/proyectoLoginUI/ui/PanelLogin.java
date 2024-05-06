package TEMA8.proyectoLoginUI.ui;

import TEMA8.proyectoLoginUI.services.ServiceUser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PanelLogin extends JPanel {

    JButton bEnviar;
    JLabel labelUsuario;
    JLabel labelPass;
    JTextField textFieldUsuario;
    JPasswordField passwordField;
    JLabel mensaje;
    ServiceUser serviceUser = new ServiceUser();

    MouseListener mouseListener = new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {

              if (textFieldUsuario.getText().equals("") ) {
                  textFieldUsuario.setBackground(new Color(255, 0, 0));
              }else if (passwordField.getText().equals("") ){
                  passwordField.setBackground(new Color(255, 0, 0));
              }else {
                  if (serviceUser.loginUI(textFieldUsuario.getText(), passwordField.getText())){
                      mensaje.setText("Esta registrado");
                      textFieldUsuario.setBackground(new Color(255, 255, 255));
                      passwordField.setBackground(new Color(255, 255, 255));
                  }else {
                      mensaje.setText("Pa tu casa");
                      textFieldUsuario.setBackground(new Color(255, 255, 255));
                      passwordField.setBackground(new Color(255, 255, 255));
                  }
              }

        }
    };

    public PanelLogin(){

        this.setBackground(new Color(106, 255, 6));
        this.setLayout(null);

        bEnviar = new JButton("Enviar");
        bEnviar.setLocation(215, 300);
        bEnviar.setSize(150, 32);
        this.add(bEnviar);
        bEnviar.addMouseListener(mouseListener);


        labelUsuario = new JLabel("Usuario");
        labelUsuario.setLocation(185,150);
        labelUsuario.setSize(150, 32);
        this.add(labelUsuario);

        labelPass = new JLabel("Password");
        labelPass.setLocation(185,200);
        labelPass.setSize(150, 32);
        this.add(labelPass);

        textFieldUsuario = new JTextField();
        textFieldUsuario.setLocation(250, 150);
        textFieldUsuario.setSize(150, 32);
        this.add(textFieldUsuario);

        passwordField = new JPasswordField();
        passwordField.setLocation(250, 200);
        passwordField.setSize(150, 32);
        this.add(passwordField);

        mensaje = new JLabel();
        mensaje.setLocation(215, 350);
        mensaje.setSize(150, 32);
        this.add(mensaje);
    }

}
