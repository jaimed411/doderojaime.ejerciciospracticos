package com.mycompany.clase7_ejericicio2;


public class Main {
    public static void main(String[] args) {
        // Crear tareas y subproyectos
        Tarea tareaPrincipal1 = new Tarea("Planificar contenido del video");
        Tarea tareaPrincipal2 = new Tarea("Grabar secuencias principales");
        Tarea tareaPrincipal3 = new Tarea("Editar y postproducir el video");

        Tarea subproyecto1_1 = new Tarea("Definir guion y escenas");
        Tarea subproyecto1_2 = new Tarea("Seleccionar ubicaciones y accesorios");

        Tarea subproyecto2_1 = new Tarea("Grabar tomas principales");
        Tarea subproyecto2_2 = new Tarea("Capturar imágenes de calidad");

        Tarea subproyecto3_1 = new Tarea("Editar secuencias");
        Tarea subproyecto3_2 = new Tarea("Agregar efectos y música");

        // Agregar subtareas
        tareaPrincipal1.agregarSubtarea(subproyecto1_1);
        tareaPrincipal1.agregarSubtarea(subproyecto1_2);

        tareaPrincipal2.agregarSubtarea(subproyecto2_1);
        tareaPrincipal2.agregarSubtarea(subproyecto2_2);

        tareaPrincipal3.agregarSubtarea(subproyecto3_1);
        tareaPrincipal3.agregarSubtarea(subproyecto3_2);

        // Crear proyecto y agregar tareas 
        Proyecto proyectoVideo = new Proyecto();
        proyectoVideo.agregarTarea(tareaPrincipal1);
        proyectoVideo.agregarTarea(tareaPrincipal2);
        proyectoVideo.agregarTarea(tareaPrincipal3);

        // Mostrar la estructura del proyecto
        proyectoVideo.mostrarEstructuraProyecto();
        
    }
}
