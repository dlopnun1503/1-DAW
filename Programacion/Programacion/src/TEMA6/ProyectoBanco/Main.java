package TEMA6.ProyectoBanco;

import TEMA6.ProyectoBanco.Clases.impl.CuentaAhorro;
import TEMA6.ProyectoBanco.Clases.impl.CuentaCorriente;
import TEMA6.ProyectoBanco.Utils.Util;

public class Main {
    public static void main(String[] args) {

        CuentaAhorro c1 = new CuentaAhorro("ES12345678912345678912", 245.50);
        CuentaAhorro c2 = new CuentaAhorro("ES12345678912345678944", 2344.44);
        CuentaCorriente c3 = new CuentaCorriente("ES12345678912345678888", 2.50);
        CuentaCorriente c4 = new CuentaCorriente("ES12345678912345679999", 34569.00);
        Util u = new Util();

        c4.traspasarDinero(200,c3);
        c1.ingresarDinero(20);
        c2.retirarDinero(44.44);
        u.cuentas.add(c1);
        u.cuentas.add(c2);
        u.cuentas.add(c3);
        u.cuentas.add(c4);
        u.mostarSaldo();






    }
}
