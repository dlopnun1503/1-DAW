package TEMA7.UbriCine.services.impl;

import TEMA7.UbriCine.model.Usuario;
import TEMA7.UbriCine.services.api.BasicService;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceUser implements BasicService {


    //ATRIBUTOS DE CLASE
    GestionFicheroUser gestion; // Objeto para poder llamar a los metodos de GestionUser
    ArrayList<Usuario> usuarios; // Contiene todos los registros del fichero users.txt

    LoggerService loggerService = new LoggerService();

    // CONSTRUCTOR DE CLASE
    public ServiceUser() {
        this.usuarios = new ArrayList<>();
        this.gestion = new GestionFicheroUser();
        this.usuarios = gestion.leerFicheroUser("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\users\\users.txt");

    }


    /*
    Con este metodo vamos a dar de alta a los usuarios, llamando al metodo userExists para comprobar que el nuevo
    id no coincida con ninguno que ya se encuentre en el sistema
     */
    @Override
    public boolean altaUsuario() {
        Scanner scan = new Scanner(System.in);
        String id = "";
        String password = "";
        String nombre = "";
        boolean is_Admin = false;
        String pregunta = "";

        System.out.print("Introduzca su id: ");
        id = scan.nextLine();

        //Comprobamos en el fichero si el id existe
        if (!userExists(id)) {
            System.out.print("Escriba su contrasenia: ");
            password = scan.nextLine();
            System.out.print("Escriba su nombre: ");
            nombre = scan.nextLine();
            System.out.print("¿Eres admin? S/N: ");
            pregunta = scan.nextLine();
            if (pregunta.equalsIgnoreCase("S")) {
                is_Admin = true;
            } else {
                is_Admin = false;
            }
            Usuario u = new Usuario(id, nombre, password, is_Admin);
            anadirFicheroUser(u);
            usuarios.add(u);
            loggerService.logAlta(id, "Correcto");
            return true;
        } else {
            System.out.println("El usuario ya existe en el fichero");
            loggerService.logAlta(id, "Incorrecto");
            return false;
        }
    }

    /*
    Con este metodo vamos a permitir a los usuarios loguearse, para ello le vamos a pedir el id y la contrasenia
    y llamando al método checkUser vamos a comprobar que las credenciales coincidan
     */
    @Override
    public boolean loginUsuario() {

        Scanner scan = new Scanner(System.in);
        String id = "";
        String password = "";

        System.out.print("Introduzca su id: ");
        id = scan.nextLine();

        //Comprobamos en el fichero si el id existe
        if (userExists(id)) {
            System.out.print("Escriba su contrasenia: ");
            password = scan.nextLine();

            if (checkUser(id, password)) {
                System.out.println("Bienvenid@ " + id);
                loggerService.logLogin(id, "Correcto");
                return true;
            } else {
                System.out.println("Credenciales incorrectas");
                loggerService.logLogin(id, "Incorrecto");
                return false;
            }
        } else {
            System.out.println("El usuario no existe en el fichero");
            loggerService.logLogin(id, "Incorrecto");
            return false;
        }
    }

    /*
    Metodo en el que vamos a recorrer el array comparando los id para ver si ya tenemos algun usuario al que ya
    pertenezca dicho id
     */
    @Override
    public boolean userExists(String id) {

        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = this.usuarios.get(i); // usuario es el elemento de la posicion i de usuarios
            if (usuario.getId().equalsIgnoreCase(id)) {
                return true;
            }
        }

        return false;
    }

    /*
    Metodo en el que vamos a recorrer el array y comparar el id y cotrasenia para comprobar que las credenciales
    sean correctas
     */

    @Override
    public boolean checkUser(String id, String password) {

        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = this.usuarios.get(i); // usuario es el elemento de la posicion i de usuarios
            if (usuario.getId().equalsIgnoreCase(id) && usuario.getPassword().equals(password)) {
                return true;
            }
        }

        return false;
    }

    //METODO QUE LEE EL FICHERO QUE LE INDICAMOS EN LA RUTA
    @Override
    public void leerFicheroUser() {
        this.usuarios = gestion.leerFicheroUser("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\users\\users.txt");
    }

    //METODO QUE AÑADE UN USUARIO AL FICHERO QUE LE INDICAMOS EN LA RUTA
    @Override
    public void anadirFicheroUser(Usuario u) {
        gestion.anadirFicheroUsers(u, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\users\\users.txt");
    }

    //METODO QUE MODIFICA EL FICHERO QUE INDICAMOS EN LA RUTA
    @Override
    public void modificarFicheroUser() {
        gestion.modificarFicherosUsers(this.usuarios, "C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\users\\users.txt");
    }

    @Override
    public String checkIDUser(String id) {
        for (int i = 0; i < usuarios.size(); i++) {
            Usuario usuario = this.usuarios.get(i); // usuario es el elemento de la posicion i de usuarios
            if (usuario.getId().equalsIgnoreCase(id)) {
                id = usuario.getId();
            }
        }
        return id;
    }
}
