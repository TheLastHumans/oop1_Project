package Main;

import javax.swing.*;

public class Gui_Login extends JFrame {
    private JPanel P_login;
    private JList list1;
    private JButton button1;
    private JLabel label1;

    public Gui_Login() {
        setContentPane(P_login);
        setTitle("Logged in");
        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);
    }

    private void createUIComponents() {
        label1 = new JLabel();
        list1 = new JList();
        WoodAvailability woodAvailability = new WoodAvailability();
        String[] WoodType = woodAvailability.WoodStorage ;
        list1 = new JList(WoodType);
        // TODO: place custom component creation code here
    }
}