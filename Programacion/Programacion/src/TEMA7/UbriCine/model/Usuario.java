package TEMA7.UbriCine.model;

public class Usuario {

    //ATRIBUTOS DE CLASE
    private String id;
    private String name;
    private String password;
    private boolean is_admin;


    //CONSTRUCTOR DE CLASE
    public Usuario(String id,String name, String password, boolean is_admin) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.is_admin = is_admin;
    }


    //GETTERS Y SETTERS
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isIs_admin() {
        return is_admin;
    }

    public void setIs_admin(boolean is_admin) {
        this.is_admin = is_admin;
    }


    //METODOS DE CLASE
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Usuario usuario = (Usuario) obj;
        return id.equals(usuario.id);
    }


    @Override
    public String toString() {
        return "Usuario: " +
                "id: " + id + '\'' +
                ", name: " + name + '\'' +
                ", is_admin: " + is_admin
                ;
    }

}
