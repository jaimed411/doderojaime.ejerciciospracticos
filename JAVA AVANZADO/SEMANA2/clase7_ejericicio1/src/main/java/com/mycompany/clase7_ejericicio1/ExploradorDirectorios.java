package com.mycompany.clase7_ejericicio1;


public class ExploradorDirectorios {
    public static void explorarDirectorio(Directorio directorio, String espacio) {
        System.out.println(espacio + "|-- " + directorio.nombre + "/");
        
        for (String archivo : directorio.archivos) {
            System.out.println(espacio + "|   |-- " + archivo);
        }

        for (Directorio subdirectorio : directorio.subdirectorios) {
            explorarDirectorio(subdirectorio, espacio + "|   ");
        }
    }
}
