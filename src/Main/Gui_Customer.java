package Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.util.concurrent.TimeUnit;

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
                //System.out.println("Index Selected: " + index);
                String s = (String) WoodTypeList.getSelectedValue();
                //System.out.println("Value Selected: " + s);
                String GUI_height=TF_height.getText();
                String GUI_width= TF_width.getText();
                //System.out.println(GUI_height + GUI_width);

                if (GUI_height == null || GUI_width == null || s == null){
                    JOptionPane.showMessageDialog(P_Customer,"Wrong selection \nPlease enter Height Width And Wood Type ");
                }
                else{
                    int GUI_height_int = Integer.valueOf(GUI_height);
                    int GUI_width_int = Integer.parseInt(GUI_width);
                    int GUI_area_Int = GUI_width_int=GUI_height_int;
                    WoodAvailability woodAvailability = new WoodAvailability();
                    //woodAvailability.Price(GUI_area_Int, s);


                    JOptionPane.showMessageDialog(P_Customer,"Your order is :"+"\n Wood type : "
                            +s+"\n Table area is : "+GUI_area_Int+"\n The price is : "+woodAvailability.Price(GUI_area_Int,s)+" Sar"+"\n Your tracking number is : "+
                            " Tracking Number");
                }

            }
        });
    }

    private void createUIComponents() {
        WoodAvailability woodAvailability = new WoodAvailability();
        String[] WoodType = woodAvailability.WoodStorage ;
        //{"Cherry", "Oak", "Walnut", "Maple", "Pine", "Akasa", "Teak", "Poplar", "Redwood", "Beech"}
        WoodTypeList = new JList(WoodType);
        TF_height= new JTextField();
        TF_width= new JTextField();
        // TODO: place custom component creation code here
    }
}
