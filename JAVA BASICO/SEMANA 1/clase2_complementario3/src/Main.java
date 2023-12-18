import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Ingrese el límite hasta el que quiere contar");
        Scanner teclado = new Scanner(System.in);
        int limite = teclado.nextInt();

        // Crear objeto de la clase LimiteNumeros
        LimiteNumeros limiteNumeros = new LimiteNumeros();

        // Llamar al método main de la clase LimiteNumeros
        limiteNumeros.main(args);
    }
}
