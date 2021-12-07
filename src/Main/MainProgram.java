package Main;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args){
 
        Login.usersArr.add(new User("Ahmad",  new char[] {'1' , '2' ,'3' ,'4'} , "1122")); // index = 0
        Login.usersArr.add(new User("Majid",  new char[] {'4' ,'3' , '2' ,'1'} , "2211")); // index = 1
        Login.usersArr.add(new User("Faisal", new char[] {'5' , '6' ,'7' , '8'}, "4242")); // index = 2
        Login.usersArr.add(new User("Khalid", new char[] {'1' , '3' , '5' , '6'}, "3232")); // index = 3
        // ! not Found = -1

        AppGUI GUI_TEST = new AppGUI();
        /*
        Scanner Input = new Scanner(System.in);
        int Login_Input = 0;
        while (true) {
            System.out.print("Login or continue as customer : \n1) login\n2) Continue as customer\nInput : ");
            Login_Input=Input.nextInt();
            if (Login_Input == 1) {
                System.out.println("line 1");
                break;
            }//if login 1
            else if (Login_Input == 2) {
                System.out.println("line 2");
                break;
            }//If Login 2
            else {
                System.out.println("Wrong Input");
            }//else Login
        }//While Main
         */
    }//Main Class
}//MainProgram