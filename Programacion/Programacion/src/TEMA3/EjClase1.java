package TEMA3;

public class EjClase1 {
    public static void main(String[] args) {
        // Declarar un array de char de tamaño 1000 y llenar todas las psoiciones con la letra F

        char [] f;
        f = new char[1000];
        f[0] = 'f';
        for (int i = 0; i <= f.length-1; i++){
            f[i] = 'f';
            System.out.println(f[i]);
        }

    }
}
