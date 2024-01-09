package com.mycompany.clase7_ejericicio1;


public class Main {
    public static void main(String[] args) {
        // Construir la estructura del directorio
        Directorio estacionDeSki = new Directorio("Grandvalira");

        // Subdirectorio: Informacion
        Directorio informacion = new Directorio("Información general");
        informacion.agregarArchivo("MapaDePistas2023-2024.pdf");
        informacion.agregarArchivo("TarifasResidentes.txt");
        informacion.agregarArchivo("TarifasNoResidentes.txt");
        informacion.agregarArchivo("Condiciones.txt");
        estacionDeSki.agregarSubdirectorio(informacion);

        ///////////////////////////////////////////////////////////////////////////////
        
        // Subdirectorio: AlquilerEquipos
        Directorio alquilerEquipos = new Directorio("AlquilerEquipos");

        // Subdirectorio de AlquilerEquipos: Esquis
        Directorio esquis = new Directorio("Esquis");
        esquis.agregarArchivo("Esqui_baja.jpg");
        esquis.agregarArchivo("Esqui_media.jpg");
        esquis.agregarArchivo("Esqui_alta.jpg");
        alquilerEquipos.agregarSubdirectorio(esquis);

        // Subdirectorio de AlquilerEquipos: Snowboards
        Directorio snowboards = new Directorio("Snowboards");
        snowboards.agregarArchivo("Snowboard_baja.jpg");
        snowboards.agregarArchivo("Snowboard_media.jpg");
        snowboards.agregarArchivo("Snowboard_alta.jpg");
        alquilerEquipos.agregarSubdirectorio(snowboards);
        
        // Subdirectorio de AlquilerEquipos: Snowbikes
        Directorio snowbikes = new Directorio("Snowbikes");
        snowbikes.agregarArchivo("Snowbike1.jpg");
        alquilerEquipos.agregarSubdirectorio(snowbikes);
        
        // Subdirectorio de AlquilerEquipos: Snowmobiles
        Directorio snowmobiles = new Directorio("Snowmobiles");
        snowmobiles.agregarArchivo("Snowmobiles1.jpg");
        alquilerEquipos.agregarSubdirectorio(snowbikes);

        estacionDeSki.agregarSubdirectorio(alquilerEquipos);

        ///////////////////////////////////////////////////////////////////////////////
        
        // Subdirectorio: Pistas
        Directorio pistas = new Directorio("Pistas");

        // Subdirectorio de Pistas: PistaVerde
        Directorio pistaVerde = new Directorio("PistaVerde");
        pistaVerde.agregarArchivo("Mapa_verde.pdf");
        pistaVerde.agregarArchivo("Condiciones_semana1.txt");
        pistas.agregarSubdirectorio(pistaVerde);

        // Subdirectorio de Pistas: PistaAzul
        Directorio pistaAzul = new Directorio("PistaAzul");
        pistaAzul.agregarArchivo("Mapa_Azul.pdf");
        pistaAzul.agregarArchivo("Condiciones_semana1.txt");
        pistas.agregarSubdirectorio(pistaAzul);
        
        // Subdirectorio de Pistas: pistaRoja
        Directorio pistaRoja = new Directorio("pistaRoja");
        pistaRoja.agregarArchivo("Mapa_rojo.pdf");
        pistaRoja.agregarArchivo("Condiciones_semana1.txt");
        pistas.agregarSubdirectorio(pistaRoja);

        // Subdirectorio de Pistas: PistaNegra
        Directorio pistaNegra = new Directorio("PistaNegra");
        pistaNegra.agregarArchivo("Mapa_negro.pdf");
        pistaNegra.agregarArchivo("Condiciones_semana1.txt");
        pistas.agregarSubdirectorio(pistaNegra);
        
        // Subdirectorio de Pistas: pistaFreeride
        Directorio pistaFreeride = new Directorio("pistaFreeride");
        pistaFreeride.agregarArchivo("Mapa_freeride.pdf");
        pistaFreeride.agregarArchivo("Condiciones_semana1.txt");
        pistas.agregarSubdirectorio(pistaFreeride);

        estacionDeSki.agregarSubdirectorio(pistas);

        ///////////////////////////////////////////////////////////////////////////////
        
        // Subdirectorio: Tiendas
        Directorio tiendas = new Directorio("Tiendas");

        // Subdirectorio de Tiendas: Tienda1
        Directorio tienda1 = new Directorio("Tienda El Tarter");
        tienda1.agregarArchivo("Horario.txt");

        // Subdirectorio de Tienda1: Productos
        Directorio productosTienda1 = new Directorio("Productos");
        
        // Subdirectorio de Productos: Abrigos
        Directorio abrigosTienda1 = new Directorio("Abrigo");
        abrigosTienda1.agregarArchivo("Abrigo1.jpg");
        abrigosTienda1.agregarArchivo("Abrigo2.jpg");
        productosTienda1.agregarSubdirectorio(abrigosTienda1);
        
        // Subdirectorio de Productos: Termicas
        Directorio termicasTienda1 = new Directorio("Termica");
        termicasTienda1.agregarArchivo("Termica1.jpg");
        termicasTienda1.agregarArchivo("Termica2.jpg");
        productosTienda1.agregarSubdirectorio(termicasTienda1);
        
        // Subdirectorio de Productos: Pantalones
        Directorio pantalonesTienda1 = new Directorio("Pantalones");
        pantalonesTienda1.agregarArchivo("Pantalones1.jpg");
        pantalonesTienda1.agregarArchivo("Pantalones2.jpg");
        productosTienda1.agregarSubdirectorio(pantalonesTienda1);
        
        // Subdirectorio de Productos: Botas
        Directorio botasTienda1 = new Directorio("Botas");
        botasTienda1.agregarArchivo("Botas1.jpg");
        botasTienda1.agregarArchivo("Botas2.jpg");
        productosTienda1.agregarSubdirectorio(botasTienda1);

        // Subdirectorio de Productos: Guantes
        Directorio guantesTienda1 = new Directorio("Guantes");
        guantesTienda1.agregarArchivo("Guante1.jpg");
        guantesTienda1.agregarArchivo("Guante2.jpg");
        productosTienda1.agregarSubdirectorio(guantesTienda1);

        // Subdirectorio de Productos: Gafas
        Directorio gafasTienda1 = new Directorio("Gafas");
        gafasTienda1.agregarArchivo("Gafa1.jpg");
        gafasTienda1.agregarArchivo("Gafa2.jpg");
        productosTienda1.agregarSubdirectorio(gafasTienda1);
        
        // Subdirectorio de Productos: Cascos
        Directorio cascosTienda1 = new Directorio("Cascos");
        cascosTienda1.agregarArchivo("Cascos1.jpg");
        cascosTienda1.agregarArchivo("Cascos2.jpg");
        productosTienda1.agregarSubdirectorio(cascosTienda1);

        tienda1.agregarSubdirectorio(productosTienda1);
        tiendas.agregarSubdirectorio(tienda1);

        
        
        // Subdirectorio de Tiendas: Tienda2
        Directorio tienda2 = new Directorio("Tienda Grau Roig");
        tienda2.agregarArchivo("Horario.txt");

        // Subdirectorio de Tienda1: Productos
        Directorio productosTienda2 = new Directorio("Productos");
        
        // Subdirectorio de Productos: Abrigos
        Directorio abrigosTienda2 = new Directorio("Abrigo");
        abrigosTienda2.agregarArchivo("Abrigo1.jpg");
        abrigosTienda2.agregarArchivo("Abrigo2.jpg");
        productosTienda2.agregarSubdirectorio(abrigosTienda2);
        
        // Subdirectorio de Productos: Termicas
        Directorio termicasTienda2 = new Directorio("Termica");
        termicasTienda2.agregarArchivo("Termica1.jpg");
        termicasTienda2.agregarArchivo("Termica2.jpg");
        productosTienda2.agregarSubdirectorio(termicasTienda2);
        
        // Subdirectorio de Productos: Pantalones
        Directorio pantalonesTienda2 = new Directorio("Pantalones");
        pantalonesTienda2.agregarArchivo("Pantalones1.jpg");
        pantalonesTienda2.agregarArchivo("Pantalones2.jpg");
        productosTienda2.agregarSubdirectorio(pantalonesTienda2);
        
        // Subdirectorio de Productos: Botas
        Directorio botasTienda2 = new Directorio("Botas");
        botasTienda2.agregarArchivo("Botas1.jpg");
        botasTienda2.agregarArchivo("Botas2.jpg");
        productosTienda2.agregarSubdirectorio(botasTienda2);

        // Subdirectorio de Productos: Guantes
        Directorio guantesTienda2 = new Directorio("Guantes");
        guantesTienda2.agregarArchivo("Guante1.jpg");
        guantesTienda2.agregarArchivo("Guante2.jpg");
        productosTienda2.agregarSubdirectorio(guantesTienda2);

        // Subdirectorio de Productos: Gafas
        Directorio gafasTienda2 = new Directorio("Gafas");
        gafasTienda2.agregarArchivo("Gafa1.jpg");
        gafasTienda2.agregarArchivo("Gafa2.jpg");
        productosTienda2.agregarSubdirectorio(gafasTienda2);
        
        // Subdirectorio de Productos: Cascos
        Directorio cascosTienda2 = new Directorio("Cascos");
        cascosTienda2.agregarArchivo("Cascos1.jpg");
        cascosTienda2.agregarArchivo("Cascos2.jpg");
        productosTienda2.agregarSubdirectorio(cascosTienda2);

        tienda2.agregarSubdirectorio(productosTienda2);
        tiendas.agregarSubdirectorio(tienda2);

        estacionDeSki.agregarSubdirectorio(tiendas);

        ///////////////////////////////////////////////////////////////////////////////
        
        // Subdirectorio: Eventos
        Directorio eventos = new Directorio("Eventos");

        // Subdirectorio de Eventos: Row
        Directorio evento1 = new Directorio("Row Festival");
        evento1.agregarArchivo("Horarios.txt");

        // Subdirectorio de Evento1: rrss
        Directorio fotosRow = new Directorio("rrss");
        fotosRow.agregarArchivo("Cartel1.jpg");
        fotosRow.agregarArchivo("Cartel2.jpg");
        evento1.agregarSubdirectorio(fotosRow);

        eventos.agregarSubdirectorio(evento1);

        estacionDeSki.agregarSubdirectorio(eventos);

        ///////////////////////////////////////////////////////////////////////////////
        
        // Llamar al explorador
        System.out.println("EXPLORACIÓN DIRECTORIO GRANDVALIRA:");
        ExploradorDirectorios.explorarDirectorio(estacionDeSki, "");
    }
}
