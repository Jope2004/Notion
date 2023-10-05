import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println("Bienvenido, " + nombre + ". ¿Cuántos datos vas a ingresar?");
        int numDatos = scanner.nextInt();

        System.out.println("Ingresa el tipo de dato del arreglo (1/int, 2/double, 3/String):");
        int tipoDato = scanner.nextInt();

       
        Object[] datos = new Object[numDatos];

        switch (tipoDato) {
            case 1:
                for (int i = 0; i < numDatos; i++) {
                    System.out.println("Ingresa el dato " + (i + 1) + ":");
                    int dato = scanner.nextInt();
                    datos[i] = dato;
                }
                break;

            case 2:
                for (int i = 0; i < numDatos; i++) {
                    System.out.println("Ingresa el dato " + (i + 1) + ":");
                    double dato = scanner.nextDouble();
                    datos[i] = dato;
                }
                break;

            case 3:
                scanner.nextLine(); 
                for (int i = 0; i < numDatos; i++) {
                    System.out.println("Ingresa el dato " + (i + 1) + ":");
                    String dato = scanner.nextLine();
                    datos[i] = dato;
                }
                break;

            default:
                System.out.println("Tipo de dato no válido.");
                break;
        }

        System.out.println("Arreglo:");
        for (Object dato : datos) {
            System.out.println(dato);
        }

        scanner.close();
    }
}
