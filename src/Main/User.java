package Main;

public class User {

    public String username;
    public String password;
    public String ID;

    public User(String username, char[] password, String ID) {
        this.username = username;
        this.password = convertCharArrToString(password);
        this.ID = ID;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getID() {
        return this.ID;
    }

    public static String convertCharArrToString(char[] arr) {
        String str = "";
        for (int i = 0; i < arr.length; i++) {
            str += arr[i] + "";
        }

        return str;
    }

}
