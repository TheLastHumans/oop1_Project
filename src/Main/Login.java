package Main;

import java.util.*;

public class Login {

    public static ArrayList<User> usersArr = new ArrayList<User>();


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
