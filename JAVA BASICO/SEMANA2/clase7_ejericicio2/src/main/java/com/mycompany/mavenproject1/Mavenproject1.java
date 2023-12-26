/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.ControladoraPersistencia;
import com.mycompany.mavenproject1.Platillo;
import java.util.Scanner;


/**
 *
 * @author Jaime
 */






public class Mavenproject1 {

    public static void main(String[] args) {
        ControladoraPersistencia controlPersis = new ControladoraPersistencia();
        Scanner scanner = new Scanner(System.in);

        int opcion;
        do {
            System.out.println("\n----- Menú -----");
            System.out.println("1. Añadir plato");
            System.out.println("2. Ver platos disponibles");
            System.out.println("3. Borrar plato");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea después del número

            switch (opcion) {
                case 1:
                    añadirPlato(controlPersis, scanner);
                    break;
                case 2:
                    verPlatos(controlPersis);
                    break;
                case 3:
                    borrarPlato(controlPersis, scanner);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 4);
    }

        private static void añadirPlato(ControladoraPersistencia controlPersis, Scanner scanner) {
        System.out.print("Ingrese el nombre del platillo: ");
        String nombre = scanner.nextLine();
        System.out.print("Ingrese la receta del platillo: ");
        String receta = scanner.nextLine();

        double precio = 0.0;
        boolean entradaValida = false;

        do {
            try {
                System.out.print("Ingrese el precio del platillo: ");
                precio = Double.parseDouble(scanner.nextLine());
                entradaValida = true;
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un valor numérico para el precio.");
            }
        } while (!entradaValida);

        Platillo nuevoPlato = new Platillo(nombre, receta, precio);
        controlPersis.crearPlato(nuevoPlato);
        System.out.println("Platillo añadido exitosamente: " + nuevoPlato);
        }


    private static void verPlatos(ControladoraPersistencia controlPersis) {
        System.out.println("Platos disponibles:");
        controlPersis.traerPlatos().forEach(System.out::println);
    }

    private static void borrarPlato(ControladoraPersistencia controlPersis, Scanner scanner) {
        System.out.print("Ingrese el ID del platillo a borrar: ");
        Long id = scanner.nextLong();
        scanner.nextLine(); // Consumir el salto de línea después del número

        controlPersis.borrarPlato(id);
    }
}



  
 


