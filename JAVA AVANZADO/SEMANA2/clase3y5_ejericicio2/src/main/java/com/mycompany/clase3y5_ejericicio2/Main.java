/*
Imagina que estás construyendo una aplicación para gestionar eventos en una agenda. 
Cada evento tiene un nombre, una fecha y una categoría (por ejemplo, "Reunión", "Conferencia", 
"Taller"). Implementa las siguientes operaciones utilizando Streams y Optionals:
1.Filtra los eventos que están programados para una fecha específica.
2.Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
3.Encuentra el evento más próximo en el tiempo utilizando Optionals. 
*/

package com.mycompany.clase3y5_ejericicio2;


import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
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
                new Evento("Exposición de Fotografía Artística", LocalDate.of(2024, 10, 22), "Exposición"),
                new Evento("Galería de Arte Contemporáneo", LocalDate.of(2024, 11, 27), "Galería"),
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
        

        // 1.Filtra los eventos que están programados para una fecha específica.
        System.out.println("1. Eventos para el 2024-09-05:");
        gestor.filtrarEventosPorFecha(LocalDate.of(2024, 9, 5)).forEach(System.out::println);

        // 2.Agrupa los eventos por categoría y cuenta cuántos eventos hay en cada categoría.
        System.out.println("\n2. Conteo de eventos por categoría:");
        gestor.contarEventosPorCategoria().forEach((categoria, cantidad) ->
                System.out.println(categoria + ": " + cantidad));

        // 3.Encuentra el evento más próximo en el tiempo utilizando Optionals. 
        System.out.println("\n3. Evento más próximo en el tiempo:");
        gestor.encontrarEventoMasProximo().ifPresent(System.out::println);
    }
    
    
}
