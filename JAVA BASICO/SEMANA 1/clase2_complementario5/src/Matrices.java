import java.util.Scanner;

public class Matrices {
    // Método para crear y cargar la matriz
    public static int[][] crearCargarMatriz() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número de filas (n): ");
        int n = teclado.nextInt();

        System.out.println("Ingrese el número de columnas (m): ");
        int m = teclado.nextInt();

        // Crear la matriz
        int[][] matriz = new int[n][m];

        // Cargar la matriz
        System.out.println("Ingrese los elementos de la matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = teclado.nextInt();
            }
        }

        return matriz;
    }

    // Método para mostrar la matriz y calcular sumas
    public static void mostrarYCalcularSumas(int[][] matriz) {
        int n = matriz.length;
        int m = matriz[0].length;

        // Mostrar la matriz
        System.out.println("Matriz ingresada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Calcular y mostrar la suma de cada fila
        for (int i = 0; i < n; i++) {
            int sumaFila = 0;
            for (int j = 0; j < m; j++) {
                sumaFila += matriz[i][j];
            }
            System.out.println("Suma de la fila " + (i + 1) + ": " + sumaFila);
        }

        // Calcular y mostrar la suma de cada columna
        for (int j = 0; j < m; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < n; i++) {
                sumaColumna += matriz[i][j];
            }
            System.out.println("Suma de la columna " + (j + 1) + ": " + sumaColumna);
        }
    }
}
