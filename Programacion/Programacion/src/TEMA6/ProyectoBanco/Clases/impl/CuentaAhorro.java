package TEMA6.ProyectoBanco.Clases.impl;

public class CuentaAhorro extends CuentaBancaria{

    private static final double saldoMinimo = 10;


    public CuentaAhorro(String iban, double saldo) {
        super(iban, saldo);
    }

    @Override
    public void calcularInteres() {
        if (saldo < saldoMinimo){
            this.saldo = saldo + (saldo * (interesAnualBasico/2));
        }else if (saldo > saldoMinimo){
            this.saldo = saldo + (saldo * (interesAnualBasico*2));

        }
    }
}
