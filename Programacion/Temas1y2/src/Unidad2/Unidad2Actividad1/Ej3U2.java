import java.util.Scanner;

public class Ej3U2 {
    public static void main(String[] args) {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Dime un número: ");
        a = scan.nextInt();

        int fact = 0;
        if (a < 0) {
            System.out.println("Factorial no válido");
        } else {
            fact = 1;
            for (int i = 1; i <= a; i++)
                fact = fact * i;
        }
        System.out.println("El factorial es " + fact);


    }
}
