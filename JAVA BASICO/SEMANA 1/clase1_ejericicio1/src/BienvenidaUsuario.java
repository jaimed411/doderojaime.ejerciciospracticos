/*
Ejercicio Nº 1 - Sintaxis básica - Individual

b) Una vez logrado esta primera parte, permitir que se almacene el nombre del usuario en una variable
   y se muestre el mismo en el mensaje. Por ejemplo: “Hola Eduardo, bienvenida al sistema”.
*/

import java.util.Scanner;

public class BienvenidaUsuario {
    public static void main(String[] args) {
        System.out.println("Hola, bienvenido al sistema");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, introduce tu nombre y apellidos: ");
        String nombreUsuario = scanner.nextLine();

        System.out.println("Gracias " + nombreUsuario + "!" + " Te damos la bienvenido al sistema");

        scanner.close();
    }
}
