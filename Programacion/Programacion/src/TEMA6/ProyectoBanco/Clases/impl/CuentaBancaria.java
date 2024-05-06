package TEMA6.ProyectoBanco.Clases.impl;

import TEMA6.ProyectoBanco.Clases.api.Cuenta;

public abstract class CuentaBancaria implements Cuenta {

    protected String iban;
    protected double saldo;
    protected static final double interesAnualBasico = 0.02;

    public CuentaBancaria(String iban, double saldo) {
        this.iban = iban;
        this.saldo = saldo;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean ingresarDinero(double importe){
        boolean dienroIngresado = false;
        if (importe > 0){
            anadir(importe);
            dienroIngresado = true;
        }
        return dienroIngresado;
    }

    public boolean retirarDinero(double importe){
        boolean dineroRetirado = false;
        if (saldo > 0){
            if (importe <= saldo){
                anadir(-importe);
                dineroRetirado = true;
            }else {
                System.out.println("No puedes retirar esa cantidad");
            }
        }
        return dineroRetirado;
    }

    public void anadir(double importe){
        this.saldo = saldo + importe;
    }

    public boolean traspasarDinero(double importe, CuentaBancaria CuentaDestino){
        boolean dineroTraspasado = false;
        double saldoC1 = this.saldo;
        double saldoC2 = CuentaDestino.saldo;
        try {
            this.retirarDinero(importe);
            CuentaDestino.ingresarDinero(importe);
            dineroTraspasado = true;
        } catch (Exception e) {
            System.out.println("ERROR AL TRASPASAR");
            this.saldo = saldoC1;
            CuentaDestino.saldo = saldoC2;
        }
        return dineroTraspasado;
    }



    public abstract void calcularInteres();




}
