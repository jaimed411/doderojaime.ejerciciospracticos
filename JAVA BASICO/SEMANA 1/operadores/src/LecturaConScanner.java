import java.util.Scanner; // Importamos la clase Scanner

public class LecturaConScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Creamos una instancia de Scanner

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine(); // Leemos una línea de texto
        System.out.println("Hola, " + nombre);

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt(); // Leemos un número entero
        System.out.println("Tienes " + edad + " años.");

        scanner.close(); // Cierra el scanner cuando ya no se necesita. Esto es OPCIONAL
    }
}