package com.mycompany.clase3y5_ejericicio2;


import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GestorEventos gestor = crearGestorConEventos();

        System.out.println("EVENTOS ARTÍSTICOS 2024");
        System.out.println(".......................");

        while (true) {
            System.out.println("1. Buscar eventos por Fecha");
            System.out.println("2. Buscar eventos por Categoría");
            System.out.println("3. Buscar evento más Próximo");
            System.out.println("4. Salir");
            System.out.println(".......................");

            System.out.print("Ingrese el número: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    try {
                        eventosPorFecha(scanner, gestor);
                    } catch (FechaIncorrectaException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    eventosPorCategoria(scanner, gestor);
                    break;
                case 3:
                    eventoMasProximo(gestor);
                    break;
                case 4:
                    System.out.println("¡Adeu!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción del 1 al 4.");
            }
        }
    }

    private static void eventosPorFecha(Scanner scanner, GestorEventos gestor) {
        System.out.print("Ingrese la fecha (YYYY-MM-DD): ");
        String fechaStr = scanner.nextLine();

        try {
            LocalDate fecha = LocalDate.parse(fechaStr);
            List<Evento> eventos = gestor.filtrarEventosPorFecha(fecha);

            if (!eventos.isEmpty()) {
                System.out.println("Eventos para el " + fechaStr + ":");
                eventos.forEach(System.out::println);
            } else {
                System.out.println("No hay eventos para la fecha seleccionada.");
            }

            if (preguntarSiAgregarOtraFecha(scanner)) {
                eventosPorFecha(scanner, gestor);
            }
        } catch (DateTimeParseException e) {
            throw new FechaIncorrectaException("Fecha incorrecta, inténtelo de nuevo.");
        }
    }

    private static void eventosPorCategoria(Scanner scanner, GestorEventos gestor) {
        System.out.print(".......................");
        System.out.println("Categorías disponibles: Galería, Conferencia, Exposición, Museo, Taller o Tour");
        System.out.print("Ingrese la categoría: ");
        String categoria = scanner.nextLine();

        List<Evento> eventos = gestor.filtrarEventosPorCategoria(categoria);
        if (!eventos.isEmpty()) {
            System.out.println("Eventos de la categoría " + categoria + ":");
            eventos.forEach(System.out::println);
        } else {
            System.out.println("No hay eventos para la categoría seleccionada.");
        }

        if (preguntarSiAgregarOtraFecha(scanner)) {
            eventosPorCategoria(scanner, gestor);
        }
    }

    private static void eventoMasProximo(GestorEventos gestor) {
        gestor.encontrarEventoMasProximo().ifPresent(evento -> {
            System.out.print(".......................");
            System.out.println("Evento más próximo:");
            System.out.println(evento);
        });
    }

    private static boolean preguntarSiAgregarOtraFecha(Scanner scanner) {
        System.out.print(".......................");
        System.out.print("¿Volver a buscar? (Si/No): ");
        String respuesta = scanner.nextLine().toLowerCase();
        return respuesta.equals("si");
    }

    private static GestorEventos crearGestorConEventos() {
        GestorEventos gestor = new GestorEventos();

        gestor.agregarEventos(Arrays.asList(
                new Evento("Exposición de Pintura 1", LocalDate.of(2024, 2, 2), "Exposición"),
                new Evento("Museo de Arte Moderno", LocalDate.of(2024, 2, 5), "Museo"),
                new Evento("Taller de Pintura en Acuarelas", LocalDate.of(2024, 3, 10), "Taller"),
                new Evento("Visita a Galería de Arte 1", LocalDate.of(2024, 4, 15), "Galería"),
                new Evento("Conferencia sobre Arte Contemporáneo", LocalDate.of(2024, 5, 20), "Conferencia"),
                new Evento("Exposición de Esculturas", LocalDate.of(2024, 6, 25), "Exposición"),
                new Evento("Recorrido por Pinturas Renacentistas", LocalDate.of(2024, 7, 3), "Tour"),
                new Evento("Museo de Historia del Arte", LocalDate.of(2024, 8, 12), "Museo"),
                new Evento("Taller de Restauración de Obras de Arte", LocalDate.of(2024, 9, 18), "Taller"),
                new Evento("Exposición de Fotografía Artística", LocalDate.of(2024, 11, 22), "Exposición"),
                new Evento("Galería de Arte Contemporáneo", LocalDate.of(2024, 11, 22), "Galería"),
                new Evento("Conferencia sobre Técnicas Pictóricas", LocalDate.of(2024, 12, 5), "Conferencia"),
                new Evento("Taller de Pintura con Óleo", LocalDate.of(2024, 2, 15), "Taller"),
                new Evento("Exposición de Arte Aborigen", LocalDate.of(2024, 2, 20), "Exposición"),
                new Evento("Recorrido por Pinturas Barrocas", LocalDate.of(2024, 3, 25), "Tour"),
                new Evento("Museo de Arte Clásico", LocalDate.of(2024, 4, 30), "Museo"),
                new Evento("Conferencia sobre Arte Abstracto", LocalDate.of(2024, 5, 5), "Conferencia"),
                new Evento("Taller de Pintura al Aire Libre", LocalDate.of(2024, 6, 10), "Taller"),
                new Evento("Visita a Galería de Arte 2", LocalDate.of(2024, 7, 20), "Galería"),
                new Evento("Exposición de Esculturas Modernas", LocalDate.of(2024, 8, 28), "Exposición"),
                new Evento("Galería de Arte Antiguo", LocalDate.of(2024, 9, 5), "Galería"),
                new Evento("Conferencia sobre Historia del Arte", LocalDate.of(2024, 10, 15), "Conferencia"),
                new Evento("Recorrido por Arte Impresionista", LocalDate.of(2024, 11, 22), "Tour"),
                new Evento("Taller de Dibujo Artístico", LocalDate.of(2024, 12, 30), "Taller")
        ));

        return gestor;
    }
}
