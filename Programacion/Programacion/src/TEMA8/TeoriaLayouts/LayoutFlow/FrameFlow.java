package TEMA8.TeoriaLayouts.LayoutFlow;

import javax.swing.*;
import java.awt.*;

public class FrameFlow extends JFrame {

    public FrameFlow(){
        this.setSize(800, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("UbriWeb");
        ImageIcon imagen = new ImageIcon("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\media\\1409946.png");
        this.setIconImage(imagen.getImage());
        JPanel panelTitulo = new JPanel();
        panelTitulo.setLayout(new BorderLayout());
        panelTitulo.setBackground(new Color(255, 0, 0));
        panelTitulo.setPreferredSize(new Dimension(800, 100));
        JLabel titulo  = new JLabel("UBRIWEB");
        titulo.setFont(new Font("Consolas", Font.BOLD, 32));
        titulo.setHorizontalAlignment(JLabel.CENTER);

        JPanel panelBody = new JPanel();
        panelBody.setBackground(new Color(241, 241, 241));
        GridLayout gridLayout = new GridLayout(2, 4);
        panelBody.setLayout(gridLayout);
        panelBody.add(new JLabel("USUARIO"));
        panelBody.add(new JTextField());
        panelBody.add(new JLabel(""));
        panelBody.add(new JLabel(""));
        panelBody.add(new JLabel("PASSWORD"));
        panelBody.add(new JPasswordField());
        panelBody.add(new JLabel(""));
        panelBody.add(new JButton("Enviar"));





        panelTitulo.add(titulo);
        this.add(panelBody);
        this.add(panelTitulo, BorderLayout.NORTH);
        this.setVisible(true);
    }


}
