package src.Main;
import java.util.*;
public class Login {

    public static ArrayList<User> usersArr = new ArrayList<User>();

    public static boolean login() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter Your Username : ");
        String username = scanner.next();
        System.out.print("Please Enter Your Password : ");
        String password = scanner.next();

        int index = login(username, password);
        return login(index);

    }

    public static void main(String[] args) {

        usersArr.add(new User("Ahmad", "1234", "1122")); // index = 0
        usersArr.add(new User("Majid", "4321", "2211")); // index = 1
        usersArr.add(new User("Faisal", "4545", "4242")); // index = 2
        usersArr.add(new User("Khalid", "1010", "3232")); // index = 3
        // ! not Found = -1

    }

    public static boolean login(int index) {

        if (0 <= index && index < usersArr.size())
            return true;
        return false;

    }

    public static int login(String username, String password) {

        for (int i = 0; i < usersArr.size(); i++) {
            if (usersArr.get(i).getUsername().equalsIgnoreCase(username)
                    && usersArr.get(i).getPassword().equals(password)) {
                return i;
            }
        }

        return -1;
    }

}
