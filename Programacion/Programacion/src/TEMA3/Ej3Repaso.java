package TEMA3;

public class Ej3Repaso {
    public static void main(String[] args) {

            try {
                int[] array1 = new int[100];
                int[] array2 = new int[100];

                for (int i = 0; i < 100; i++) {
                    array1[i] = i + 1;
                }

                for (int i = 0; i < 100; i++) {
                    array2[i] = array1[99 - i];
                }

                System.out.println("Primer array:");
                for (int i = 0; i < array1.length; i++) {
                    System.out.print(array1[i] + " ");
                }

                System.out.println("\nSegundo array (en orden inverso):");
                for (int i = 0; i < array2.length; i++) {
                    System.out.print(array2[i] + " ");
                }

            } catch (IndexOutOfBoundsException e) {
                System.out.println("Error: Se intentÃ³ acceder a una posiciÃ³n del array que no existe.");
            }
        }

    }
