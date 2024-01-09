package com.mycompany.clase7_ejericicio1;


import java.util.ArrayList;
import java.util.List;

public class Directorio {
    String nombre;
    List<Directorio> subdirectorios;
    List<String> archivos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        this.subdirectorios.add(subdirectorio);
    }

    public void agregarArchivo(String archivo) {
        this.archivos.add(archivo);
    }
}
