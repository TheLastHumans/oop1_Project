package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Gui_Customer extends JFrame {
    private JPanel P_Customer;
    private JList WoodTypeList;
    private JButton RefundButton;
    private JButton buyButton;
    private JTextField TF_width;
    private JTextField TF_height;
    private JLabel LB_width;
    private JLabel LB_height;

    public Gui_Customer() {
        setContentPane(P_Customer);
        setTitle("Customer View");
        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);

        P_Customer.addComponentListener(new ComponentAdapter() {
            @Override
            public void componentResized(ComponentEvent e) {
                super.componentResized(e);
            }
        });

        buyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int index = WoodTypeList.getSelectedIndex();
                System.out.println("Index Selected: " + index);
                String s = (String) WoodTypeList.getSelectedValue();
                System.out.println("Value Selected: " + s);
                String GUI_height=TF_height.getName();
                String GUI_width= TF_width.getName();
                int GUI_height_int = Integer.parseInt(GUI_height);
                int GUI_width_int = Integer.parseInt(GUI_width);

                //JOptionPane.showMessageDialog();
            }
        });
    }

    private void createUIComponents() {

        String[] WoodType = {"cherry", "oak", "walnut", "maple", "pine", "akasa", "teak", "poplar", "redwood", "beech"};
        WoodTypeList = new JList(WoodType);
        // TODO: place custom component creation code here
    }
}
