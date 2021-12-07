package Main;
import static org.codehaus.groovy.runtime.DefaultGroovyMethods.contains;

public class refund {
    //int x;

    public refund() {
        //this.x = x;
    }

    public int[] return_item(int[] Orders_Int, int item_num) {
        if(contains(Orders_Int, item_num)) { // yes
            int[] result = {item_num,item_num-1};
            return result;
        } else {
            int[] result = {0,0};
            return result;
        }
    }
}
