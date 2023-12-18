import java.util.Scanner;

public class SueldoEmpleados {
    public static void main(String[] args) {
        double sueldo;
        /*4 tipos de empleados
          1 repositor, 2 cajero, 3 supervisor, 4 Jefe
         */
        System.out.println("Ingrese el tipo de empleado");
        Scanner teclado = new Scanner(System.in);
        int categoria = teclado.nextInt();

        if (categoria == 1) {
            sueldo = 15890 + (15890 * 0.10);
        } else if (categoria == 2) {
            sueldo = 25630.89;
        } else if (categoria == 3) {
            sueldo = 35560.20 - (35560.20 * 0.11);
        } else if (categoria == 4) {
            sueldo = 42050.33;
        } else {
            System.out.println("Ingresó un número de categoría incorrecto");
            return;
        }

        System.out.println("La categoría de la persona es: " + categoria);
        System.out.println("El sueldo de la persona es: " + sueldo);
    }
}
