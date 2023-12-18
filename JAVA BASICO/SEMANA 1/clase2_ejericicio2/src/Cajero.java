import java.text.DecimalFormat;
import java.util.Scanner;

public class Cajero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoDosDecimales = new DecimalFormat("#.##");

        double totalCompra = 0.00;
        boolean finalizarCompra = false;

        System.out.println("\u001B[4mBienvenido a Jaime´s. Ingresa los precios de los productos" +
                " y escribe 'fin' para finalizar la compra.\u001B[0m");

        while (!finalizarCompra) {
            System.out.print("Ingresa el precio del producto: ");
            String entrada = scanner.next();

            if (entrada.equalsIgnoreCase("fin")) {
                finalizarCompra = true;
            } else {
                try {
                    double precioProducto = Double.parseDouble(entrada);
                    if (precioProducto == 0.0) {
                        System.out.println("Error: El número 0 no es válido. Introduce un precio mayor a 0.");
                    } else {
                        totalCompra += precioProducto;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Añade un punto, no una coma. Introduce un número válido.");
                }
            }
        }

        System.out.println("Total de la compra antes del descuento: " + formatoDosDecimales.format(totalCompra) + "€");



        //porcentaje descuento
        System.out.print("¿Tienes algún descuento? Escribe el descuento en porcentaje o 'no': ");
        String descuentoInput = scanner.next();

        double descuento = 0.0;

        if (!descuentoInput.equalsIgnoreCase("no")) {
            try {
                descuento = Double.parseDouble(descuentoInput);
                if (descuento < 0 || descuento > 100) {
                    System.out.println("Error: Descuento no válido. El descuento debe estar entre 0 y 100.");
                    descuento = 0.0;
                } else {
                    descuento /= 100.0;
                    double totalConDescuento = totalCompra - (totalCompra * descuento);
                    System.out.println("El precio de la compra con descuento es: " + formatoDosDecimales.format(totalConDescuento) + "€");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingresa un valor numérico válido para el descuento.");
            }
        } else {
            System.out.println("El precio de la compra es: " + formatoDosDecimales.format(totalCompra) + "€");
        }

        System.out.println("Gracias por su compra en Jaime´s. ¡Vuelve pronto!");

        scanner.close();
    }
}



