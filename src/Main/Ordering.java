package Main;
import java.util.Random;
public class Ordering {
    public static int Orders_Int;
    public static int x =0;
    public String [] Orders_String;
    public int Ordering() {
        Random random = new Random();
        int max=10000;
        int rand=random.nextInt(max);
        return rand;
    }
    public String[] getOrders_String() {
        return Orders_String;
    }
    public static void setOrders_Int() {
        Orders_Int = x;
        x++;
    }
    public static void setOrders_Int(int X) {
        Orders_Int = x;
        x=X;
    }

    public int getOrders_Int() {
        return Orders_Int;
    }
}