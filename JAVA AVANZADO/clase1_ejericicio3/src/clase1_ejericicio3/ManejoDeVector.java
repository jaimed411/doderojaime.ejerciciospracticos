/*Ejercicio Nº 3 - Vectores y excepciones - Individual
Estás desarrollando una aplicación de gestión de datos en la que puedes almacenar 
información en un vector y acceder a ella posteriormente. Tu tarea es implementar una 
función que te permita almacenar datos en un vector y manejar excepciones estándar de Java 
teniendo en cuenta lo siguiente:
1.Desarrolla una función que te permita almacenar datos en un vector. Puedes utilizar un 
vector de tamaño fijo para simplificar el ejercicio.
2.Luego, implementa un mecanismo que te permita acceder a los datos almacenados en el vector 
proporcionando un índice.
3.Utiliza una excepción estándar de Java que, al intentar acceder a una posición que no 
existe en el vector, por ejemplo, un índice que esté fuera del rango del vector se pueda capturar.
4.Captura la excepción y proporciona un mensaje de error descriptivo que indique que estás 
intentando acceder a una posición inválida en el vector.
*/


package clase1_ejericicio3;
import java.util.Scanner;

public class ManejoDeVector {

    private static final int TAMANO_VECTOR = 8;
    private static int[] vector = new int[TAMANO_VECTOR];

    public static void main(String[] args) {
        almacenarDatosEnVector();
        accederDatosEnVector();
        System.out.println("GRACIAS!");
    }

    // Paso 1: Función para almacenar datos en el vector
    private static void almacenarDatosEnVector() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("GESTIÓN DE DATOS CON VECTOR");
        System.out.println("         ―――――          ");
        System.out.println("INGRESE DATOS EN EL VECTOR:");

        // Ciclo para ingresar datos en el vector
        for (int i = 0; i < TAMANO_VECTOR; i++) {
            System.out.print("Ingrese valor en la posición " + i + ": ");

            try {
                vector[i] = leerEnteroDesdeConsola(scanner);
            } catch (NumeroDecimalException e) {
                System.out.println(e.getMessage());
                i--; 
            }
        }
        System.out.println("Datos almacenados correctamente!");
    }

    // Método para leer un entero desde la consola y lanzar una excepción si es un número decimal
    private static int leerEnteroDesdeConsola(Scanner scanner) {
        int valor = 0;

        try {
            valor = scanner.nextInt();

            if (valor != (int) valor) {
                throw new NumeroDecimalException("No es posible poner un número decimal.");
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("ERROR AL NO INGRESAR UN NÚMERO ENTERO");
            scanner.nextLine(); 
        }

        return valor;
    }

    // Paso 2: Función para acceder a datos en el vector
    private static void accederDatosEnVector() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nACCEDER A DATOS EN EL VECTOR:");

        // Ciclo para permitir al usuario acceder a datos en el vector
        while (true) {
            System.out.print("Ingrese el índice para acceder a un valor (-1 para salir): ");
            int indice = scanner.nextInt();

            if (indice == -1) {
                break;
            }

            // Paso 3: Utilizar una excepción para manejar accesos fuera de rango
            try {
                int valor = vector[indice]; 
                System.out.println("Valor en la posición " + indice + ": " + valor);
            } catch (ArrayIndexOutOfBoundsException e) {
                // Paso 4: Captura la excepción y proporciona un mensaje de error descriptivo
                System.out.println("ERROR AL ESTAR INTENTANDO ACCEDER A UNA POSICIÓN INVÁLIDA EN EL VECTOR.");
            }
        }

        scanner.close();
    }
}
