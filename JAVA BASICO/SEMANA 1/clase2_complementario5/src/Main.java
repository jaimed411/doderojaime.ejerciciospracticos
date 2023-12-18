import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Llamamos al método crearCargarMatriz
        int[][] matrizIngresada = Matrices.crearCargarMatriz();

        // Llamamos al método mostrarYCalcularSumas
        Matrices.mostrarYCalcularSumas(matrizIngresada);
    }
}