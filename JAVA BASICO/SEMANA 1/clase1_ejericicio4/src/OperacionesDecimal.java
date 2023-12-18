import java.util.Scanner;

public class OperacionesDecimal {

    public static void main(String[] args) {
        double numero1, numero2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número decimal: ");
        numero1 = scanner.nextDouble();

        System.out.print("Ingrese otro número decimal: ");
        numero2 = scanner.nextDouble();

        System.out.println("\u001B[4mRESULTADOS DE LAS OPERACIONES DECIMALES\u001B[0m");

        double suma = numero1 + numero2;
        System.out.println("• Suma: " + suma);

        double resta = numero1 - numero2;
        System.out.println("• Resta: " + resta);

        double multiplicacion = numero1 * numero2;
        System.out.println("• Multiplicación: " + multiplicacion);

        double division = numero1 * numero2;
        System.out.println("• División: " + division);


        scanner.close();
    }
}
