package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppGUI extends JFrame{
    private JPanel panel_main;
    private JButton continueAsCustomerButton;
    private JButton loginButton;
    private JTextField TF_Name;
    private JTextField TF_Password;
    private JPasswordField PS_Password;

    public AppGUI() {
        setContentPane(panel_main);
        setTitle("Wooder");
        setSize(640,480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String GUI_Username=TF_Name.getText();
                char[] GUI_Password=PS_Password.getPassword();
                //System.out.println(GUI_Password + GUI_Username);

                if (true){
                    JOptionPane.showMessageDialog(panel_main,"logged in successfully");
                    Gui_Login guiLogin = new Gui_Login();
                    guiLogin.setVisible(true);
                    setVisible(false);
                }
                else if (false){
                    JOptionPane.showMessageDialog(panel_main,"wrong credentials");

                }
            }
        });
        continueAsCustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Gui_Customer guiCustomer = new Gui_Customer();
                guiCustomer.setVisible(true);
                setVisible(false);
            }
        });

    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
