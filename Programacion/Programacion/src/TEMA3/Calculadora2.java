package TEMA3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora2 {
    public static void main(String[] args) {

        double num1;
        double num2;
        char op;
        double resultado = 0;

        Scanner scan = new Scanner(System.in);


        try {
            System.out.println("Introduzca el primer número: ");
            num1 = scan.nextDouble();

            System.out.println("Introduzca el segundo número: ");
            num2 = scan.nextDouble();

            System.out.println("Introduzca el operador: ");
            op = scan.next().charAt(0);

            switch (op) {
                case '+' :{
                    resultado = suma(num1,num2);
                    break;
                }
                case '-' : {
                    resultado = resta(num1,num2);
                    break;
                }
                case '*' : {
                    resultado = mult(num1,num2);
                    break;
                }
                case '/' : {
                    resultado = dividir(num1,num2);
                    break;
                }
                case '%' : {
                    resultado = porcentaje(num1,num2);
                    break;
                }
                default: {
                    System.out.println("Operador incorrecto");
                    break;
                }

            }
            System.out.println("El resultado es " +resultado);


        }catch (InputMismatchException e){
            System.out.println("Error en los datos");
            System.out.println("Por favor, introduzca un dato numérico: ");
        }catch (ArithmeticException e) {
            System.out.println("No se puede dividir o realizar porcentaje por 0");
        }



    }
    public static double dividir (double num1, double num2) throws ArithmeticException {
        double resultadoAux = 0.0;
        if (num2 == 0){
            throw new ArithmeticException();
        }

        resultadoAux = num1/num2;
        return resultadoAux;
    }

public static double porcentaje (double num1, double num2) throws ArithmeticException {
        double resultadoAux2 = 0.0;
        if (num2 == 0) {
            throw new ArithmeticException();
        }
        resultadoAux2 = num1 % num2;
        return resultadoAux2;
}

public static double suma (double num1, double num2) {
        double resultadoAux3 = 0.0;
        resultadoAux3 = num1 + num2;
        return resultadoAux3;
}
    public static double resta (double num1, double num2) {
        double resultadoAux4 = 0.0;
        resultadoAux4 = num1 - num2;
        return resultadoAux4;
    }
    public static double mult (double num1, double num2) {
        double resultadoAux5 = 0.0;
        resultadoAux5 = num1 * num2;
        return resultadoAux5;
    }
}
