package TEMA6.ProyectoBanco.Clases.api;

import TEMA6.ProyectoBanco.Clases.impl.CuentaBancaria;

public interface Cuenta {

    public boolean ingresarDinero(double importe);
    public boolean retirarDinero(double importe);
    public void anadir(double importe);
    public boolean traspasarDinero(double importe, CuentaBancaria CuentaDestino);
    public void calcularInteres();






}
