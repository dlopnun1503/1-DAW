package TEMA3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
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
                   resultado = num1+ num2;
                    break;
                }
                case '-' : {
                    resultado = num1 - num2;
                    break;
                }
                case '*' : {
                    resultado = num1 * num2;
                    break;
                }
                case '/' : {
                    resultado = dividir(num1,num2);
                    break;
                }
                case '%' : {
                    resultado = num1 % num2;
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
            System.out.println("No se puede dividir por 0");
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
}
