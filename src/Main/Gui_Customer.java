package Main;

import javax.swing.*;

public class Gui_Customer extends JFrame {
    private JPanel P_Customer;

    public Gui_Customer() {
        setContentPane(P_Customer);
        setTitle("Customer View");
        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);
    }
}
