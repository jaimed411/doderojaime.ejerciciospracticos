import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        List<String> nombres = new ArrayList<>();
        List<Double> calificaciones = new ArrayList<>();

        System.out.println("Ingrese los datos de los alumnos. Para finalizar, escriba 'fin' como nombre.");

        // nombres y calificaciones
        while (true) {
            System.out.println("Nombre del alumno (o 'fin' para terminar):");
            String nombre = entrada.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break; 
            }

            nombres.add(nombre);

            System.out.println("Calificacion del alumno:");
            double calificacion = entrada.nextDouble();
            calificaciones.add(calificacion);
        }

        // Evaluar y mostrar resultados
        for (int i = 0; i < nombres.size(); i++) {
            System.out.println("Resultados para " + nombres.get(i) + ":");

            if (calificaciones.get(i) >= 5.0) {
                System.out.println("Aprobado.");
            } else if (calificaciones.get(i) < 4.9) {
                System.out.println("Suspenso.");
            }
        }
    }
}
