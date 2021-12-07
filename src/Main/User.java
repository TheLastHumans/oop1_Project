package src.Main;
public class User {

    public String username;
    public String password;
    public String ID ; 

    public User(String username, String password , String ID) {
        this.username = username;
        this.password = password;
        this.ID = ID; 
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getID(){
        return this.ID ; 
    }

}