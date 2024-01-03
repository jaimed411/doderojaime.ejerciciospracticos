/*
Una concesionaria de vehículos necesita un sistema para administrar su inventario de autos. 
Crea una clase Auto con atributos como marca, modelo, año, y precio. Implementa una clase 
utilitaria InventarioAutos con métodos genéricos para realizar las siguientes operaciones:
1. Agregar Autos al Inventario: Utiliza un método genérico para agregar autos 
al inventario de la concesionaria.
2. Buscar Autos por Marca o Año: Implementa métodos genéricos que permitan buscar autos 
por marca o año dentro del inventario.
3. Calcular el Valor Total del Inventario: Desarrolla un método genérico que calcule el 
valor total de todos los autos en el inventario. 
*/

package com.mycompany.clase6_ejericicio1;



import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        InventarioAutos<Auto> inventario = new InventarioAutos<>();

        boolean continuar = true;

        while (continuar) {
            // Menú principal
            System.out.println("");
            System.out.println("INVENTARIO COCHES 2024 DODRACING:");
            System.out.println(".................................");
            System.out.println("");
            System.out.println("1. Agregar coche");
            System.out.println("2. Buscar coche por marca");
            System.out.println("3. Buscar coche por año");
            System.out.println("4. Lista de coches");
            System.out.println("5. Calcular valor total del inventario");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");

            try {
                int opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        agregarAuto(scanner, inventario);
                        break;
                    case 2:
                        buscarPorMarca(scanner, inventario);
                        break;
                    case 3:
                        buscarPorAño(scanner, inventario);
                        break;
                    case 4:
                        mostrarLista(inventario);
                        break;
                    case 5:
                        calcularValorTotal(inventario);
                        break;
                    case 6:
                        System.out.println("Graaacias!");
                        continuar = false;
                        break;
                    default:
                        System.out.println("Opción no válida. Por favor, ingrese un número del 1 al 6.");
                        System.out.println("");
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, ingrese un número válido.");
                scanner.nextLine(); 
            }
        }
    }

    private static void agregarAuto(Scanner scanner, InventarioAutos<Auto> inventario) {
        String marca, modelo;
        int año;
        double precio;

        do {
            System.out.println("");
            System.out.print("Ingrese la marca del coche: ");
            marca = scanner.nextLine();

            System.out.print("Ingrese el modelo del coche: ");
            modelo = scanner.nextLine();

            System.out.print("Ingrese el año del coche: ");
            año = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            System.out.print("Ingrese el precio del coche: ");
            precio = scanner.nextDouble();
            scanner.nextLine(); // Consumir el salto de línea

            Auto nuevoAuto = new Auto(marca, modelo, año, precio);
            inventario.agregarAuto(nuevoAuto);

            System.out.println("");
            System.out.print("¿Quieres agregar otro coche? (Si/No): ");
            System.out.println("");
        } while (scanner.nextLine().equalsIgnoreCase("Si"));
    }

    private static void buscarPorMarca(Scanner scanner, InventarioAutos<Auto> inventario) {
        String marca;
        do {
            System.out.println("");
            System.out.print("Ingrese la marca del coche a buscar: ");
            marca = scanner.nextLine();

            List<Auto> autosEncontrados = inventario.buscarPorMarca(marca);
            if (autosEncontrados.isEmpty()) {
                System.out.println("No hay coches de la marca: " + marca);
                System.out.println("");
            } else {
                System.out.println("Coches de marca " + marca + ":");
                System.out.println("");
                for (Auto auto : autosEncontrados) {
                    System.out.println(auto);
                }
            }

            System.out.print("¿Quieres buscar otro coche por marca? (Si/No): ");
            System.out.println("");
        } while (scanner.nextLine().equalsIgnoreCase("Si"));
    }

    private static void buscarPorAño(Scanner scanner, InventarioAutos<Auto> inventario) {
        int año;
        do {
            System.out.println("");
            System.out.print("Ingrese el año del coche a buscar: ");
            año = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            List<Auto> autosEncontrados = inventario.buscarPorAño(año);
            if (autosEncontrados.isEmpty()) {
                System.out.println("No hay coches del año " + año);
                System.out.println("");
            } else {
                System.out.println("Coches del año " + año + ":");
                System.out.println("");
                for (Auto auto : autosEncontrados) {
                    System.out.println(auto);
                }
            }

            System.out.print("¿Quieres buscar otro coche por año? (Si/No): ");
            System.out.println("");
        } while (scanner.nextLine().equalsIgnoreCase("Si"));
    }

    private static void mostrarLista(InventarioAutos<Auto> inventario) {
        System.out.println("Lista de coches:");

        if (inventario.isEmpty()) {
            System.out.println("El inventario está vacío.");
        } else {
            for (Auto auto : inventario) {
                System.out.println(auto);
            }
        }
    }

    private static void calcularValorTotal(InventarioAutos<Auto> inventario) {
        double valorTotal = inventario.calcularValorTotal();
        System.out.println("Valor total del inventario de 2024: " + valorTotal + "€");
    }
}