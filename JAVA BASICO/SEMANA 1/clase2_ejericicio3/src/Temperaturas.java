/*
Ejercicio Nº 3 - Arreglos: Vectores - Individual

Una web de meteorología necesita de un programa que, al ingresar las 7 temperaturas máximas
de la última semana, calcule la temperatura máxima promedio que hubo.

Para ello, deberá manejar un vector donde en cada posición se almacene la correspondiente
temperatura máxima de cada día. Una vez almacenadas las temperaturas, deberá calcular el
promedio de las mismas recorriendo el vector y mostrando el resultado por pantalla.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] temperaturas = new double[7];

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        System.out.println("\u001B[4mTEMPERATURA PROMEDIO SEMANAL\u001B[0m");

        for (int i = 0; i < 7; i++) {
            System.out.print("La temperatura máxima del " + diasSemana[i] + " es: ");
            temperaturas[i] = scanner.nextDouble();
        }

        double sumaTemperaturas = 0;
        for (double temperatura : temperaturas) {
            sumaTemperaturas += temperatura;
        }

        double promedioTemperaturas = sumaTemperaturas / 7;

        DecimalFormat formatoDecimal = new DecimalFormat("#.#");
        String promedioFormateado = formatoDecimal.format(promedioTemperaturas);

        System.out.println("El promedio de las temperaturas máximas de la última semana es: " + promedioFormateado + "°C");

        scanner.close();
    }
}
