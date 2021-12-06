package Main;

import javax.swing.*;

public class Gui_Login extends JFrame {
    private JPanel P_login;

    public Gui_Login() {
        setContentPane(P_login);
        setTitle("Logged in");
        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);
    }
}
