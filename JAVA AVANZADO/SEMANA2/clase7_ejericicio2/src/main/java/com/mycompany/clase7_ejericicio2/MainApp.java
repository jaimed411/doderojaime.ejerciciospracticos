package com.mycompany.clase7_ejericicio2;


import java.util.Scanner;

public class MainApp {
    private static Proyecto proyecto = new Proyecto();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion = 0;
        do {
            try {
                // Mostrar el menú principal y obtener la opción del usuario
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); 

                switch (opcion) {
                    case 1:
                        // Mostrar la estructura del proyecto
                        mostrarEstructuraProyecto();
                        break;
                    case 2:
                        // Agregar tarea 
                        do {
                            agregarTareaPrincipal();
                            System.out.print("¿Deseas agregar otra tarea? (si/no): ");
                        } while (scanner.nextLine().equalsIgnoreCase("si"));
                        break;
                    case 3:
                        // Borrar tarea 
                        do {
                            if (borrarTareaPrincipal()) {
                                System.out.println("Tarea principal borrada con éxito.");
                            } else {
                                System.out.println("Número de tarea no válido.");
                            }
                            System.out.print("¿Deseas borrar otra tarea ? (si/no): ");
                        } while (scanner.nextLine().equalsIgnoreCase("si"));
                        break;
                    case 4:
                        // Agregar subtarea 
                        do {
                            agregarSubtarea();
                            System.out.print("¿Deseas agregar otra subtarea? (si/no): ");
                        } while (scanner.nextLine().equalsIgnoreCase("si"));
                        break;
                    case 5:
                        // Borrar subtarea 
                        do {
                            borrarSubtarea();
                            System.out.print("¿Deseas borrar otra subtarea? (si/no): ");
                        } while (scanner.nextLine().equalsIgnoreCase("si"));
                        break;
                    case 6:
                        // Salir del programa
                        System.out.println("Saliendo... ¡Hasta luego!");
                        break;
                    default:
                        // Opción no válida
                        System.out.println("Opción no válida. Inténtalo de nuevo.");
                }
            } catch (ProyectoException e) {
                // excepciones 
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Error inesperado. Por favor, inténtalo de nuevo.");
                scanner.nextLine(); 
            }

        } while (opcion != 6);
        
        scanner.close(); // Cerrar el Scanner al final del programa
    }
    


    private static void mostrarMenu() {
        System.out.println(". . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(".              MENÚ PRINCIPAL             .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . .");
        System.out.println(".   1. ESTRUCTURA PROYECTO                .");
        System.out.println(".   2. Agregar tarea                      .");
        System.out.println(".   3. Borrar tarea                       .");
        System.out.println(".   4. Agregar subtarea                   .");
        System.out.println(".   5. Borrar subtarea                    .");
        System.out.println(".   6. Salir                              .");
        System.out.println(". . . . . . . . . . . . . . . . . . . . . .");
        System.out.print("Selecciona una opción: ");
    }

    // Métodos

    private static void mostrarEstructuraProyecto() {
        System.out.println("\nESTRUCTURA DEL PROYECTO");
        proyecto.mostrarEstructuraProyecto();
    }

    private static void agregarTareaPrincipal() {
        System.out.print("Ingresa la nueva tarea: ");
        String nombreTarea = scanner.nextLine();
        Tarea nuevaTarea = new Tarea(nombreTarea);
        proyecto.agregarTarea(nuevaTarea);
        System.out.println("Tarea agregada con éxito.");
    }

    private static boolean borrarTareaPrincipal() {
        mostrarEstructuraProyecto();
        System.out.print("Ingresa el número de la tarea que deseas borrar: ");
        int numeroTarea = scanner.nextInt();
        scanner.nextLine(); 
        if (numeroTarea >= 1 && numeroTarea <= proyecto.getTareas().size()) {
            proyecto.getTareas().remove(numeroTarea - 1);
            return true;
        }
        return false;
    }

    private static void agregarSubtarea() {
        mostrarEstructuraProyecto();
        System.out.print("Ingresa el número de la tarea a la que agregarás una subtarea: ");
        int numeroTarea = scanner.nextInt();
        scanner.nextLine(); 
        if (numeroTarea >= 1 && numeroTarea <= proyecto.getTareas().size()) {
            Tarea tareaPrincipal = proyecto.getTareas().get(numeroTarea - 1);
            System.out.print("Ingresa la nueva subtarea: ");
            String nombreSubtarea = scanner.nextLine();
            Tarea nuevaSubtarea = new Tarea(nombreSubtarea);
            tareaPrincipal.agregarSubtarea(nuevaSubtarea);
            System.out.println("Subtarea agregada con éxito.");
        } else {
            System.out.println("Número de tarea no válido.");
        }
    }

    private static void borrarSubtarea() {
        mostrarEstructuraProyecto();
        System.out.print("Ingresa el número de la tarea a la que borrarás una subtarea: ");
        int numeroTarea = scanner.nextInt();
        scanner.nextLine(); 
        if (numeroTarea >= 1 && numeroTarea <= proyecto.getTareas().size()) {
            Tarea tareaPrincipal = proyecto.getTareas().get(numeroTarea - 1);
            tareaPrincipal.mostrarEstructuraConSimbolo("_", "_");
            System.out.print("Ingresa el número de la subtarea que deseas borrar: ");
            int numeroSubtarea = scanner.nextInt();
            scanner.nextLine(); 
            if (numeroSubtarea >= 1 && numeroSubtarea <= tareaPrincipal.getSubtareas().size()) {
                tareaPrincipal.getSubtareas().remove(numeroSubtarea - 1);
                System.out.println("Subtarea borrada con éxito.");
            } else {
                System.out.println("Número de subtarea no válido.");
            }
        } else {
            System.out.println("Número de tarea no válido.");
        }
        
    }
    
}
