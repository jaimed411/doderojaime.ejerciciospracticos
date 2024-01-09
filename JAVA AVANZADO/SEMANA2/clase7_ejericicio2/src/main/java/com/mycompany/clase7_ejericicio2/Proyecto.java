package com.mycompany.clase7_ejericicio2;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


public class Proyecto implements Serializable {
    private List<Tarea> tareas;

    // Constructor
    public Proyecto() {
        this.tareas = new ArrayList<>();
    }

    // Métodos
    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public List<Tarea> getTareas() {
        return tareas;
    }

    public void mostrarEstructuraProyecto() {
        System.out.println("\nESTRUCTURA DEL PROYECTO");
        for (Tarea tarea : tareas) {
            tarea.mostrarEstructura("  ");
        }
    }
}
