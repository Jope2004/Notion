import java.util.Scanner;

public class InfinitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la longitud de los arrays: ");
        int n = scanner.nextInt();

        int[] array1 = new int[n];
        int[] array2 = new int[n];
        int[] array3 = new int[n];

        int operation = 0; 

        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor " + (i + 1) + " para array1: ");
            array1[i] = scanner.nextInt();
            System.out.print("Ingrese el valor " + (i + 1) + " para array2: ");
            array2[i] = scanner.nextInt();

            if (operation == 0) {
                array3[i] = array1[i] + array2[i];
            } else {
                array3[i] = array1[i] * array2[i];
            }

        }

        int sumaTotal = 0;
        for (int i = 0; i < n; i++) {
            sumaTotal = array3[i];
        }

        array3[n - 1] = sumaTotal;

        System.out.println("Resultado del array3:");

        for (int i = 0; i < n; i++) {
            System.out.println("Valor " + (i + 1) + ": " + array3[i]);
        }

        scanner.close();
    }
}
