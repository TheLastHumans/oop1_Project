public class Login {
    public static int login(String username, String password) {

        for (int i = 0; i < Main.usersArr.size(); i++) {
            if (Main.usersArr.get(i).getUsername().equalsIgnoreCase(username)
                    && Main.usersArr.get(i).getPassword().equals(password)) {
                return i;
            }
        }

        return -1;
    }
}
