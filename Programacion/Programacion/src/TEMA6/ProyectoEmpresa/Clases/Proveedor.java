package TEMA6.ProyectoEmpresa.Clases;

public class Proveedor {


    private String nombre;
    private String dni;
    private String localidad;
    private String telefono;

    public Proveedor(String nombre, String dni, String localidad, String telefono) {
        setNombre(nombre);
        this.dni = dni;
        setLocalidad(localidad);
        setTelefono(telefono);
    }

@Override
    public String toString(){
        String cadenaAMostrar = "";
        cadenaAMostrar += "Nombre proveedor : "+this.nombre+"\n";
        cadenaAMostrar += "Telefono: "+this.telefono;
        return cadenaAMostrar;
    }

    @Override
    public boolean equals(Object pro) {
        if (pro instanceof Proveedor) {
            Proveedor proveedor = (Proveedor) pro;
            if (this.dni.equalsIgnoreCase(proveedor.dni)){
                return true;
            }else {
                return false;
            }
        } else {
            return false;
        }
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }
    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
