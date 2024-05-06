package TEMA6.ProyectoBanco.Utils;

import TEMA6.ProyectoBanco.Clases.impl.CuentaBancaria;

import java.util.ArrayList;

public class Util {

    public ArrayList<CuentaBancaria> cuentas;
    public Util(){
        cuentas = new ArrayList<>();
    }
    public void mostarSaldo(){
        for (int i = 0; i < cuentas.size(); i++){
            System.out.println(cuentas.get(i).getSaldo());
        }
    }
}
