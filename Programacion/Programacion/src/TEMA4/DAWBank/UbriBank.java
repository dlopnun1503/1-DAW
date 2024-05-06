package TEMA4.DAWBank;

import TEMA4.DAWBank.clases.CuentaBancaria;

import java.util.ArrayList;
import java.util.Scanner;



public class UbriBank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir datos para crear una cuenta
        System.out.print("Ingrese el IBAN: ");
        String iban = scanner.nextLine();

        System.out.print("Ingrese el titular: ");
        String titular = scanner.nextLine();

        // Crear la cuenta bancaria
        CuentaBancaria cuenta = new CuentaBancaria(iban, titular);

        int opcion = 0;

        while (opcion != 8) {
            // Mostrar el menu
            System.out.println("\n--- Menu Principal ---");
            System.out.println("1. Datos de la cuenta");
            System.out.println("2. IBAN");
            System.out.println("3. Titular");
            System.out.println("4. Saldo");
            System.out.println("5. Ingreso");
            System.out.println("6. Retirada");
            System.out.println("7. Movimientos");
            System.out.println("8. Salir");

            System.out.print("Seleccione una opcion: ");
            opcion = scanner.nextInt();

            if (opcion == 1) {
                mostrarDatosCuenta(cuenta);
            } else if (opcion == 2) {
                System.out.println("IBAN: " + cuenta.mostrarIban());
            } else if (opcion == 3) {
                System.out.println("Titular: " + cuenta.mostrarTitular());
            } else if (opcion == 4) {
                System.out.println("Saldo: " + cuenta.mostrarSaldo() + " euros");
            } else if (opcion == 5) {
                System.out.print("Ingrese la cantidad a ingresar: ");
                double cantidadIngreso = scanner.nextDouble();
                cuenta.realizarIngreso(cantidadIngreso);
            } else if (opcion == 6) {
                System.out.print("Ingrese la cantidad a retirar: ");
                double cantidadRetirada = scanner.nextDouble();
                cuenta.realizarRetirada(cantidadRetirada);
            } else if (opcion == 7) {
                mostrarMovimientos(cuenta);
            } else if (opcion == 8) {
                System.out.println("Hasta luego");
            } else {
                System.out.println("Opcion no valida. Intentelo de nuevo.");
            }
        }
    }

    private static void mostrarDatosCuenta(CuentaBancaria cuenta) {
        System.out.println("\n--- Datos de la Cuenta ---");
        System.out.println("IBAN: " + cuenta.mostrarIban());
        System.out.println("Titular: " + cuenta.mostrarTitular());
        System.out.println("Saldo: " + cuenta.mostrarSaldo() + " euros");
    }

    private static void mostrarMovimientos(CuentaBancaria cuenta) {
        System.out.println("\n--- Movimientos ---");
        ArrayList<CuentaBancaria.Movimiento> movimientos = cuenta.getMovimientos();
        if (movimientos.isEmpty()) {
            System.out.println("No hay movimientos registrados.");
        } else {
            for (int i = 0; i < movimientos.toArray().length; i++) {
                CuentaBancaria.Movimiento movimiento = movimientos.get(i);
                System.out.println(movimiento.getTipo() + ": " + movimiento.getCantidad() + " euros");
            }
        }
    }
}
