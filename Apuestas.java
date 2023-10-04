import java.util.Random;
import java.util.Scanner;

public class Apuestas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido, ingresa tu nombre:");
        String nombre = scanner.nextLine();

        System.out.println(nombre + ", ingresa tu edad:");
        int edad = scanner.nextInt();

        if (edad < 18) {
            System.out.println("Lo sentimos, " + nombre + ". No puedes jugar porque eres menor de edad.");
            scanner.close();
            return;
        }

        System.out.println("Muy bien, " + nombre + ". Vamos a apostar, ingresa el valor de tu apuesta:");
        int apuesta = scanner.nextInt();

        int numeroElegido;
        int vecesAparecido = 0;
        int repeticiones = 80;
        int[] numeros = new int[10];
        Random random = new Random();

        do {
            System.out.println("Elige un número del 1 al 10:");
            numeroElegido = scanner.nextInt();
        } while (numeroElegido < 1 || numeroElegido > 10);

        for (int i = 0; i < repeticiones; i++) {
            int numeroAleatorio = random.nextInt(10) + 1;
            System.out.println("El número aleatorio es: " + numeroAleatorio);

            if (numeroAleatorio == numeroElegido) {
                vecesAparecido++;
            }

            numeros[numeroAleatorio - 1]++;
        }

        int maxRepeticiones = 0;
        int segundoMaxRepeticiones = 0;

        for (int i = 0; i < 10; i++) {
            int repeticionesNumero = numeros[i];
            if (repeticionesNumero >= 12) {
                System.out.println("Perdiste. El número " + (i + 1) + " apareció al menos 12 veces.");
                scanner.close();
                return;
            }
            if (repeticionesNumero > maxRepeticiones) {
                segundoMaxRepeticiones = maxRepeticiones;
                maxRepeticiones = repeticionesNumero;
            } else if (repeticionesNumero > segundoMaxRepeticiones) {
                segundoMaxRepeticiones = repeticionesNumero;
            }
        }

        if (vecesAparecido >= 10 || segundoMaxRepeticiones < 12) {
            int ganancias = apuesta * vecesAparecido;
            System.out.println("¡Felicidades! Ganaste " + ganancias + " unidades.");
        }else {
            System.out.println(
           
        "Perdiste. Tu número no apareció al menos 10 veces o hay otros números con 12 o más repeticiones.");
        }
        scanner.close();
    }
}

