package Main;

public class Ordering {
    public static int[] Orders_Int;
    public static int x =0;
    public String [] Orders_String;
    public Ordering(String[] orders_String) {
        Orders_String = orders_String;
        Orders_Int [x] = x+1;
        x++;
    }
    public String[] getOrders_String() {
        return Orders_String;
    }
    public static int[] getOrders_Int() {
        return Orders_Int;
    }
 } 
