package Main;

import java.util.Scanner;
public class MainProgram {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        int Login_Input = 0;
        while (1==1) {
            System.out.println("Login or continue as customer : \n1) login\n2) Continue as customer\nInput :" + Input.nextInt(Login_Input));
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
    }//Main Class
}//MainProgram