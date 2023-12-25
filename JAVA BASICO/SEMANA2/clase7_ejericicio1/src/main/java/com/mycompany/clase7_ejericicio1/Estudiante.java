package com.mycompany.clase7_ejericicio1;


public class Estudiante {
    private int id;
    private String nombre;
    private int edad;
    private double calificacion;

    // Constructor
    public Estudiante(int id, String nombre, int edad, double calificacion) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = calificacion;
    }

    // Getters y setters (puedes generarlos automáticamente en tu IDE)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    // Método toString para mostrar la información del estudiante
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Edad: " + edad + ", Calificación: " + calificacion;
    }
}
