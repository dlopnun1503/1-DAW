package TEMA7.proyectoAirbnb;

import TEMA7.proyectoAirbnb.model.Alojamiento;
import TEMA7.proyectoAirbnb.model.Propietario;
import TEMA7.proyectoAirbnb.services.GestionFichero;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        GestionFichero gf = new GestionFichero();



        ArrayList<Alojamiento> alojamientosTemporal = new ArrayList<>();

        alojamientosTemporal = gf.leerFicheroAlojamientos("C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\malaga.csv");
        gf.escribirFicheroAlojamientos(alojamientosTemporal,"C:\\Users\\dlopnun1503\\Desktop\\Programación\\Programacion\\src\\resources\\archivosTema7\\datos_malaga.csv");


        for (Alojamiento a : alojamientosTemporal) {
            System.out.println(a);
        }


        Scanner scan = new Scanner(System.in);

        try {
            int opc = 1;

            while (opc != 0) {
                System.out.print("""
                        Bienvenid@ a la web
                                        
                        1. Visualizar los 20 alojamientos mas baratos
                        2. Visualizar los 20 alojamientos mas caros
                        3. Alojamientos cenidos a su presupuesto
                        4. Modificar precio de alojamiento
                        5. Modificar propietario de un alojamiento
                        0. Salir
                                        
                        Escoja una opcion:
                        """);
                opc = scan.nextInt();

                switch (opc) {

                    case 1:
                        imprimirAlojamientosMasBaratos(alojamientosTemporal);
                        break;
                    case 2:
                        imprimirAlojamientosMasCaros(alojamientosTemporal);
                        break;
                    case 3:
                        imprimirAlojamientosPorPresupuesto(alojamientosTemporal);
                        break;
                    case 4:
                        modificarPrecioAlojamiento(scan, alojamientosTemporal);
                        break;
                    case 5:
                        modificarPropietarioAlojamiento(scan, alojamientosTemporal);
                        break;
                    case 0:
                        System.out.println("Adios...");
                        break;

                    default:
                        System.out.println("Opcion no valida");
                        break;
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void imprimirAlojamientosMasBaratos(ArrayList<Alojamiento> alojamientos) {
        alojamientos.stream()
                .sorted()
                .limit(20)
                .forEach(System.out::println);
    }

    private static void imprimirAlojamientosMasCaros(ArrayList<Alojamiento> alojamientos) {
        alojamientos.stream()
                .sorted((a1, a2) -> Double.compare(a2.getPrecio(), a1.getPrecio()))
                .limit(20)
                .forEach(System.out::println);
    }

    private static void imprimirAlojamientosPorPresupuesto(ArrayList<Alojamiento> alojamientos) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el presupuesto máximo por noche: ");
        double presupuesto = scan.nextDouble();

        alojamientos.stream()
                .filter(alojamiento -> alojamiento.getPrecio() <= presupuesto)
                .forEach(System.out::println);
    }

    private static void modificarPrecioAlojamiento(Scanner scan, ArrayList<Alojamiento> alojamientos) {
        System.out.print("Ingrese el ID del alojamiento a modificar: ");
        String id = scan.nextLine();
        Alojamiento alojamiento = encontrarAlojamientoPorID(alojamientos, id);
        if (alojamiento != null) {
            System.out.println("Alojamiento encontrado: " + alojamiento);
            System.out.print("Ingrese el nuevo precio: ");
            double nuevoPrecio = scan.nextDouble();
            alojamiento = new Alojamiento(alojamiento.getId(), alojamiento.getName(),
                    alojamiento.getPropietario(), nuevoPrecio);
            actualizarArchivoCSV(alojamientos);
            System.out.println("Precio del alojamiento modificado exitosamente.");
        } else {
            System.out.println("No se encontró ningún alojamiento con ese ID.");
        }
    }

    private static void actualizarArchivoCSV(ArrayList<Alojamiento> alojamientos) {
    }

    private static void modificarPropietarioAlojamiento(Scanner scan, ArrayList<Alojamiento> alojamientos) {
        System.out.print("Ingrese el ID del alojamiento a modificar: ");
        String id = scan.nextLine();
        Alojamiento alojamiento = encontrarAlojamientoPorID(alojamientos, id);
        if (alojamiento != null) {
            System.out.println("Alojamiento encontrado: " + alojamiento);
            System.out.print("Ingrese el nuevo ID del propietario: ");
            String nuevoHostId = scan.nextLine();
            System.out.print("Ingrese el nuevo nombre del propietario: ");
            String nuevoHostName = scan.nextLine();
            Propietario nuevoPropietario = new Propietario(nuevoHostId, nuevoHostName);
            alojamiento = new Alojamiento(alojamiento.getId(), alojamiento.getName(),
                    nuevoPropietario, alojamiento.getPrecio());
            actualizarArchivoCSV(alojamientos);
            System.out.println("Propietario del alojamiento modificado exitosamente.");
        } else {
            System.out.println("No se encontró ningún alojamiento con ese ID.");
        }
    }

    private static Alojamiento encontrarAlojamientoPorID(ArrayList<Alojamiento> alojamientos, String id) {
        return alojamientos.stream()
                .filter(a -> a.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

}
