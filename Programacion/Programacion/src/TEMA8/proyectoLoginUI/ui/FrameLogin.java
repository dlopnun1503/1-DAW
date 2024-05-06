package TEMA8.proyectoLoginUI.ui;

import javax.swing.*;

public class FrameLogin extends JFrame{

    public FrameLogin() {
        this.setSize(600, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Proyecto UI");
        ImageIcon image = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\media\\send-4008.png");
        this.setIconImage(image.getImage());
        this.setResizable(false);

        PanelLogin p = new PanelLogin();
        this.add(p);

        this.setVisible(true);
    }

}
