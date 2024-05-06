package TEMA6.ProyectoMascotas;

import TEMA6.ProyectoMascotas.Clases.*;

public class Main {
    public static void main(String[] args) {


        Perro oreo = new Perro("Oreo", false, "Schnauzer");
        Perro goku = new Perro("Goku", false, "Yorkshire");
        Gato pulga = new Gato("Pulga", "Marron", false);
        Loro pirri = new Loro("Pirri", "Granivoro", true, "Sudamerica");
        Canario muyayo = new Canario("Muyayo", "Granívoro", true, "Amarillo");

        Inventario inventario = new Inventario();

        inventario.anadirMascota(oreo);
        inventario.anadirMascota(goku);
        inventario.anadirMascota(pulga);
        inventario.anadirMascota(pirri);

        inventario.eleminiarMascota("Muyayo");
        inventario.mostrarDatosAnimales();


        inventario.eleminiarMascota("pulga");
        inventario.mostrarDatosAnimales();

        System.out.println("-------------------------------------");
        inventario.mostrarTipoYNombreAnimal();








    }
}
