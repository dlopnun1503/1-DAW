package TEMA4.DAWBank.clases;


import java.util.ArrayList;

public class CuentaBancaria {


    private String iban;
    private double saldo;
    private String titular;
    private ArrayList<Movimiento> movimientos;
    public String menu;
    public  CuentaBancaria(String iban, String titular) {
        if (validarLongitudIBAN(iban)) {
            this.iban = iban;
        } else {
            System.out.println("Error: IBAN no valido. La longitud debe ser de 24 caracteres.");
            System.exit(1);
        }

        this.titular = titular;
        this.saldo = 0;
        this.movimientos = new ArrayList<>();
    }

    private boolean validarLongitudIBAN(String iban) {
        return iban.length() == 22;
    }

    public ArrayList<Movimiento> getMovimientos() {
        return movimientos;
    }

    public String mostrarTodo() {
        System.out.println("El titular de la cuenta es " + this.titular + ", el iban es " + this.iban + " y el saldo es de " + this.saldo + " euros");
        return menu;
    }

    public String mostrarIban() {
        System.out.println("El iban es " + this.iban);
        return iban;
    }


    public String mostrarTitular() {
        System.out.println("El titular es " + this.titular);
        return titular;
    }


    public double mostrarSaldo() {
        System.out.println("El saldo es " + this.saldo);
        if (0 > this.saldo) {
            System.out.println("AVISO: Saldo Negativo");
        }
        return saldo;
    }



    public class Movimiento {
        private final String tipo;
        public double cantidad;

        public Movimiento(String tipo, double cantidad) {
            this.tipo = tipo;
            this.cantidad = cantidad;
        }

        public String getTipo() {
            return tipo;
        }

        public double getCantidad() {
            return cantidad;
        }
    }


        public void realizarIngreso(double cantidad) {
            if (cantidad > 0) {
                saldo += cantidad;
                movimientos.add(new Movimiento("Ingreso", cantidad));
                if (cantidad > 3000) {
                    System.out.println("AVISO: Notificar a hacienda");
                }
            } else {
                System.out.println("Error: La cantidad debe ser mayor que cero.");
            }
        }

        public void realizarRetirada(double cantidad) {
            if (cantidad > 0) {
                if (saldo - cantidad >= -50) {
                    saldo -= cantidad;
                    movimientos.add(new Movimiento("Retirada", cantidad));
                    if (cantidad > 3000) {
                        System.out.println("AVISO: Notificar a hacienda");
                    }
                    if (saldo < 0) {
                        System.out.println("AVISO: Saldo negativo");
                    }
                } else {
                    System.out.println("Error: Saldo insuficiente.");
                }
            } else {
                System.out.println("Error: La cantidad debe ser mayor que cero.");
            }
        }
    }



