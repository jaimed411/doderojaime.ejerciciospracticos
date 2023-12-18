import java.util.Scanner;

public class ReservaAsientos {
    // Función para mostrar el mapa de asientos
    public static void mostrarMapa(char[][] mapaAsientos) {
        System.out.println("Mapa de Asientos:");
        for (char[] fila : mapaAsientos) {
            for (char asiento : fila) {
                System.out.print(asiento + " ");
            }
            System.out.println();
        }
    }

    // Función para verificar si las coordenadas del asiento son válidas
    public static boolean esAsientoValido(int fila, int asiento) {
        return fila >= 0 && fila < 5 && asiento >= 0 && asiento < 5;
    }
}

