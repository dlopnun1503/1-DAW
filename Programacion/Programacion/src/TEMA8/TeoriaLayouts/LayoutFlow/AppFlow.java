package TEMA8.TeoriaLayouts.LayoutFlow;

import javax.swing.*;

public class AppFlow {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(
                new Runnable() {
                    @Override
                    public void run() {
                        FrameFlow ff = new FrameFlow();
                    }
                }
                );

    }
}
