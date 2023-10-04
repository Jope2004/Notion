import java.util.Scanner;

public class Deuda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, por favor ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + ", ingresa el monto total de tu deuda:");
        double deuda = scanner.nextDouble();

        System.out.println("Ahora, elige el tipo de tarjeta (1/Blanca, 2/Dorada, 3/Negra):");
        int Tarjeta = scanner.nextInt();

        System.out.println("Por último, especifica la cantidad de cuotas en meses:");
        int cuotas = scanner.nextInt();

        double interesMensual = 0;

        switch (Tarjeta) {
            case 1:
                interesMensual = 3.53 / 100;
                break;
            case 2:
                interesMensual = 2.95 / 100;
                break;
            case 3:
                interesMensual = 1.92 / 100;
                break;
        }

        double totalPagado = 0;

        for (int mes = 1; mes <= cuotas; mes++) {
            double interesMensualActual = (deuda * interesMensual);
            totalPagado = (deuda + interesMensualActual);

            System.out.println("Mes " + mes + ": Cuota mensual = " +  deuda +  ", Interés mensual = " +  interesMensualActual +", Total pagado hasta ahora = " +  totalPagado);

            deuda = deuda / cuotas;
        }

        scanner.close();
    }
}
