package TEMA6.ProyectoBanco.Clases.impl;

public class CuentaCorriente extends CuentaBancaria{


    public CuentaCorriente(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularInteres() {
        this.saldo = saldo + (saldo * interesAnualBasico);
    }
}
