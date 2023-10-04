import java.util.Scanner;

public class notas3 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        // Declaramos la variable "sumaNotas"
        double sumaNotas = 0;
        
        // Le pedimos al usuario su nombre
        System.out.println("Hola, ingresa tu nombre:");
        String nom = scanner.nextLine();// Leemos

        // Comenzamos el ciclo para calcular una o más materias según el usuario
        while (true) {
            // Pedimos el nombre de la materia que queremos calcular
            System.out.println("Bienvenido " + nom + ". Ingresa la materia que quieres calcular:");
            String Materia = scanner.nextLine();
            
            // Preguntamos el número de notas que van a ingresar para también saber el tamaño del arreglo
            System.out.println("¿Cuantas notas son?");
            int cantidadNotas = scanner.nextInt();// Leemos

            // Creamos los arreglos de notas y porcentaje poniéndoles su longitud = cantidad de notas 
            double[] notas = new double[cantidadNotas];
            double[] porcentajes = new double[cantidadNotas];
            
            // Ciclo para ingresar las notas
            for (int i = 0; i < cantidadNotas; i++) { 
                // Pedimos las notas que tiene el usuario dentro del ciclo
                System.out.println("Ingresa la nota #" + (i + 1) + ":");
                notas[i] = scanner.nextDouble();// Leemos
            }
            
            // Ciclo para ingresar los porcentajes
            for (int i = 0; i < cantidadNotas; i++) { 
                // Pedimos los porcentajes que tiene el usuario de cada nota dentro del ciclo
                System.out.println("Ingresa el porcentaje de la nota #" + (i + 1) + ":");
                porcentajes[i] = scanner.nextDouble();// Leemos
            }
            
            // Ciclo para calcular la suma de notas
            for (int i = 0; i < cantidadNotas; i++) { 
                // Hacemos la operación de los datos suministrados entre notas y porcentajes 
                sumaNotas += (notas[i] * (porcentajes[i] / 100)); 
            }
            
            // Imprimimos El resultado 
            System.out.println(nom + ", tu nota final en " + Materia + " es: " + sumaNotas);

            // Preguntamos al usuario si quiere calcular más materias
            System.out.println(nom + " ¿Deseas calcular notas para otra materia? (si/no):");
            String respuesta = scanner.next();

            // Si quiere, se repite el ciclo; si no, se acaba el programa 
            if (!respuesta.equalsIgnoreCase("si")) {
                break; // Salimos del bucle si la respuesta no es "si"
            }
            
            // Reiniciamos sumaNotas para la siguiente materia
            sumaNotas = 0;
            
            // Limpiamos el búfer de entrada
            scanner.nextLine();
        }
        
        // Cerramos el scanner al finalizar el programa
        scanner.close();
    }
}
 