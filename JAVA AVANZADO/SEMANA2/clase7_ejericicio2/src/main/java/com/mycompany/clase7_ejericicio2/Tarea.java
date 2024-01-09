package com.mycompany.clase7_ejericicio2;


import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String nombre;
    private List<Tarea> subtareas;

    // Constructor
    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    // Métodos
    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void agregarSubtarea(Tarea subtarea) {
        subtareas.add(subtarea);
    }

    public void mostrarEstructura(String prefijo) {
        System.out.println(prefijo + "-> " + nombre);
        for (Tarea subtarea : subtareas) {
            subtarea.mostrarEstructura(prefijo + "  ");
        }
    }

    public void mostrarEstructuraConSimbolo(String prefijo, String simbolo) {
        System.out.println(prefijo + "└─ " + simbolo + " " + nombre);
        for (int i = 0; i < subtareas.size() - 1; i++) {
            subtareas.get(i).mostrarEstructuraConSimbolo(prefijo + "│  ", "_");
        }
        if (subtareas.size() > 0) {
            subtareas.get(subtareas.size() - 1).mostrarEstructuraConSimbolo(prefijo + "   ", "_");
        }
    }
}
