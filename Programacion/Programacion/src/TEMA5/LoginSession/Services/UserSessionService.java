package TEMA5.LoginSession.Services;

import TEMA5.LoginSession.Clases.Session;
import TEMA5.LoginSession.Clases.User;

import java.util.ArrayList;
import java.util.Scanner;

public class UserSessionService {

static ArrayList<User> usersRegistered = new ArrayList<User>();
static ArrayList<Session> activeSessions = new ArrayList<Session>();


public static boolean checkIfUserExists(User user){
    boolean userExiste = false;
            for (int i = 0; i < usersRegistered.size(); i++){
                if (user.getUser().equals(usersRegistered.get(i).getUser())){
                    System.out.println("USUARIO EXISTENTE");
                    userExiste = true;
                }
            }
    return userExiste;
}

public static boolean checkIfUserIsDuplicate(String user){
    boolean usuarioDuplicado = false;
    for (int i = 0; i < usersRegistered.size(); i++){
        if (user.equals(usersRegistered.get(i).getUser())){
            System.out.println("USUARIO DUPLICADO");
            usuarioDuplicado = true;
        }
    }
    return usuarioDuplicado;
    }

    public static boolean checkIfSessionIsActive(String user) {
        activeSessions.removeIf(session -> session.getUsuario().getUser().equals(user) && session.isExpired());
        for (Session session : activeSessions) {
            if (session.getUsuario().getUser().equals(user) && !session.isExpired()) {
                return true;
            }
        }
        return false;
    }

    public static boolean addUser(User user) {
        if (!checkIfUserIsDuplicate(user.getUser())) {
            usersRegistered.add(user);
            return true;
        }
        return false;
    }

    public static boolean addSession(User user) {
        if (checkIfUserExists(user)) {
            Session session = new Session(user);
            activeSessions.add(session);
            return true;
        }
        return false;
    }
}
