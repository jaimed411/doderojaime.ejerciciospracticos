/*
Ejercicio Nº 3 - Variables y Operadores - Individual

Escribe un programa que permita calcular el área de un triángulo y luego mostrar el resultado
por pantalla.. Recuerda que la fórmula para calcular esto es:
(base * altura) / 2 (base por altura dividido dos).

Pista: Debes declarar variables para la base y la altura del triángulo,
asignarles valores y luego calcular el área utilizando la fórmula
 */

import java.util.Scanner;

public class AreaTriangulo {

    public static void main(String[] args) {
        double base, altura;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Base del triángulo: ");
        base = scanner.nextDouble();

        System.out.print("Altura del triángulo: ");
        altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("El área del triángulo es: " + area + " cm²");

        scanner.close();
    }
}

