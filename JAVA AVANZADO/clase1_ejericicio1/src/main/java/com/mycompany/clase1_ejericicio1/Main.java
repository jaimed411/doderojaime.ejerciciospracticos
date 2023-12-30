package com.mycompany.clase1_ejericicio1;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lista de destinos disponibles y sus asientos
        Map<String, Integer> destinos = new HashMap<>();
        destinos.put("Austria", 10);
        destinos.put("Suiza", 10);
        destinos.put("Andorra", 10);

        do {
    // Seleccionar un destino aleatorio
    String[] destinosArray = destinos.keySet().toArray(new String[0]);
    Random random = new Random();
    String destinoAleatorio = destinosArray[random.nextInt(destinosArray.length)];

    // Crear un vuelo con el destino aleatorio y sus asientos disponibles
    Vuelo vuelo = new Vuelo(destinoAleatorio, destinos.get(destinoAleatorio));

    // Menú interactivo
    System.out.println("---");
    System.out.println("\u001B[4mRESERVA DE VUELOS\u001B[0m");
    System.out.println("".replaceAll(".", "-"));
    System.out.println("1. Empezar con la reserva");
    System.out.println("2. Salir");
    System.out.print("Seleccione una opción (1-2): ");
    int opcionPrincipal = scanner.nextInt();
    scanner.nextLine(); // Consumir el salto de línea pendiente

    switch (opcionPrincipal) {
        case 1:
            System.out.println("---");
            // Validar el nombre (solo letras)
            String nombre;
            do {
                System.out.print("NOMBRE: ");
                nombre = scanner.nextLine();
                try {
                    validarNombre(nombre);
                } catch (NombreInvalidoException e) {
                    System.out.println("ERROR: " + e.getMessage());
                    System.out.println("Vuelve a intentar.");
                }
            } while (!nombre.matches("^[a-zA-Z]+$"));

            // Muestra los destinos disponibles
            System.out.println("PAÍSES DISPONIBLES DIC-23: " + String.join(", ", destinos.keySet()));

            // Validar el destino (solo letras)
            String destino;
                    do {
                        System.out.print("DESTINO: ");
                        destino = scanner.nextLine();
                        try {
                            validarDestino(destino, destinos.keySet());
                        } catch (DestinoInvalidoException e) {
                            System.out.println("ERROR: " + e.getMessage());
                            System.out.println("Vuelve a intentar.");
                        } catch (PaisNoValidoException e) {
                            System.out.println("ERROR: " + e.getMessage());
                            System.out.println("Vuelve a intentar.");
                        }
                    } while (!destino.matches("^[a-zA-Z]+$") || !destinos.containsKey(destino));

                    int asientosDisponibles = destinos.get(destino);

                    System.out.println("NÚMERO DE ASIENTOS (Asientos disponibles: " + asientosDisponibles + "): ");
                    // Validar el número de asientos (solo números)
                    try {
                        int cantidadAsientos = Integer.parseInt(scanner.nextLine());

                        // Validar que hay suficientes asientos disponibles
                        if (cantidadAsientos <= asientosDisponibles) {
                            // Intentar realizar la reserva
                            Reserva reserva = new Reserva(nombre, vuelo, cantidadAsientos);

                            reserva.realizarReserva();

                            // Confirmación de la reserva
                            System.out.println("---");
                            System.out.println("\u001B[4mCONFIRMACION DE LA RESERVA\u001B[0m");
                            System.out.println("NOMBRE: " + nombre);
                            System.out.println("---");
                            System.out.println("DESTINO: " + destino);
                            System.out.println("---");
                            System.out.println("NÚMERO DE ASIENTOS: " + cantidadAsientos);
                            System.out.println("---");

                            // Actualizar la cantidad de asientos disponibles
                            destinos.put(destino, asientosDisponibles - cantidadAsientos);

                            // Preguntar al usuario si desea confirmar la reserva (1 para confirmar, 2 para cancelar)
                            System.out.print("¿Desea confirmar la reserva? (1 (SI), 2 (NO)): ");
                            int respuesta = scanner.nextInt();

                            if (respuesta == 1) {
                                System.out.println("¡GRACIAS POR RESERVAR!");
                                System.out.println("---");
                            } else {
                                System.out.println("RESERVA CANCELADA");
                                System.out.println("---");
                            }
                        } else {
                            System.out.println("ERROR: NO HAY SUFICIENTES ASIENTOS DISPONIBLES EN ESTE PAÍS. bUSQUE OTRO. ");
                        }

                    } catch (NumberFormatException e) {
                        System.out.println("ERROR: INGRESA SOLO NÚMEROS PARA EL NÚMERO DE ASIENTOS");
                    } catch (ReservaInvalidaException e) {
                        System.out.println("ERROR AL REALIZAR LA RESERVA " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Saliendo de la aplicación Hasta luego!");
                    System.out.println("---");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (destinos.values().stream().anyMatch(asientos -> asientos > 0));


        // Cerrar el scanner al finalizar
        scanner.close();
    }

    
    
    
    // Método para validar el nombre
    private static void validarNombre(String nombre) throws NombreInvalidoException {
        if (!nombre.matches("^[a-zA-Z]+$")) {
            throw new NombreInvalidoException("INGRESA SOLO LETRAS");
        }
    }

    // Método para validar el destino
    private static void validarDestino(String destino, Iterable<String> destinos) throws DestinoInvalidoException, PaisNoValidoException {
        if (!destino.matches("^[a-zA-Z]+$")) {
            throw new DestinoInvalidoException("INGRESA SOLO LETRAS");
        }

        if (!esPaisValido(destino, destinos)) {
            throw new PaisNoValidoException("PAÍS NO VÁLIDO. INGRESA UNO DE LA LISTA");
        }
    }

    // Método para verificar si el país es válido
    private static boolean esPaisValido(String pais, Iterable<String> destinos) {
        for (String destino : destinos) {
            if (destino.equals(pais)) {
                return true;
            }
        }
        return false;
    }
}
