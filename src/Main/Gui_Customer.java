package Main;

import javax.swing.*;import java.awt.event.ComponentAdapter;

public class Gui_Customer extends JFrame {
    private JPanel P_Customer;
    private JList list1;

    public Gui_Customer() {
        setContentPane(P_Customer);
        setTitle("Customer View");
        setSize(640, 480);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(false);
        String[] WoodType = {"cherry", "oak", "walnut", "maple", "pine", "akasa", "teak", "poplar", "redwood", "beech"};
        list1 = new JList(WoodType);



    }
}
