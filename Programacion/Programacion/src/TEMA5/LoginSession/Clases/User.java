package TEMA5.LoginSession.Clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class User {

    private String user;
    private String password;

    public User(String user, String password){
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        Pattern userPattern = Pattern.compile("^([A-Z] | [a-z]){5}\\d{3}$");
        Matcher userMatcher = userPattern.matcher(user);
        if (userMatcher.find()) {
            this.user = user;
        } else {
            System.out.println("ERROR");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        Pattern passPattern = Pattern.compile("^\\d{5}$");
        Matcher passMatcher = passPattern.matcher(password);
        if (passMatcher.find()){
            this.password = password;
        }else {
            System.out.println("ERROR");
        }
    }
}
