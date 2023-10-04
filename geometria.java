import java.util.Scanner;

public class geometria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de Figuras");
        System.out.println("1. Círculo");
        System.out.println("2. Triángulo");
        System.out.println("3. Rectángulo");
        System.out.print("Seleccione el tipo de figura (1/2/3): ");
        int figura = scanner.nextInt();

        switch (figura) {
            case 1:
                calcularCirculo();
                break;
            case 2:
                calcularTriangulo();
                break;
            case 3:
                calcularRectangulo();
                break;
            default:
                System.out.println("Opción inválida.");
        }

        scanner.close();
    }

    public static void calcularCirculo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        double radio = scanner.nextDouble();

        double area = Math.PI * radio * radio;
        double perimetro = 2 * Math.PI * radio;

        System.out.println("Área del círculo: " + area);
        System.out.println("Perímetro del círculo: " + perimetro);
        scanner.close();
    }

    public static void calcularTriangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del triángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;
        double perimetro = base + 2 * Math.sqrt((altura * altura) + (base * base));

        System.out.println("Área del triángulo: " + area);
        System.out.println("Perímetro del triángulo: " + perimetro);
         scanner.close();
    }

    public static void calcularRectangulo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        double base = scanner.nextDouble();
        System.out.print("Ingrese la altura del rectángulo: ");
        double altura = scanner.nextDouble();

        double area = base * altura;
        double perimetro = 2 * (base + altura);

        System.out.println("Área del rectángulo: " + area);
        System.out.println("Perímetro del rectángulo: " + perimetro);
         scanner.close();
    }
}
