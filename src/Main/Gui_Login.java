package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui_Login extends JFrame {
    private JPanel P_login;
    private JList list1;
    private JButton checkButton;
    private JLabel label1;

    public Gui_Login() {
        setContentPane(P_login);
        setTitle("Logged in");
        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);
        checkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                WoodAvailability woodAvailability = new WoodAvailability();
                int index = list1.getSelectedIndex();
                //System.out.println("Index Selected: " + index);
                String WoodString = (String) list1.getSelectedValue();
                //woodAvailability.IsAvailable(WoodString);
                if (woodAvailability.IsAvailable(WoodString)==true){
                    label1.setText("Yes");
                }
                else if(woodAvailability.IsAvailable(WoodString)==false){
                    label1.setText("Not Available");
                }
            }
        });
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