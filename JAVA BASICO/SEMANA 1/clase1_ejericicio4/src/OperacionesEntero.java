import java.util.Scanner;

public class OperacionesEntero {

    public static void main(String[] args) {
        int numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número aleatorio entero: ");
        numero1 = scanner.nextInt();

        System.out.print("Ingrese otro número aleatorio entero: ");
        numero2 = scanner.nextInt();

        System.out.println("\u001B[4mRESULTADOS DE LAS OPERACIONES3\u001B[0m");

        int suma = numero1 + numero2;
        System.out.println("•Suma: " + suma);

        int resta = numero1 - numero2;
        System.out.println("•Resta: " + resta);

        int multiplicacion = numero1 * numero2;
        System.out.println("•Multiplicación: " + multiplicacion);

        int division = numero1 / numero2;
        System.out.println("•División: " + division);


        scanner.close();
    }
}
