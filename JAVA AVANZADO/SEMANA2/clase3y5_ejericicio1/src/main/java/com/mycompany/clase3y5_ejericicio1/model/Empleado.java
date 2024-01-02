package com.mycompany.clase3y5_ejericicio1.model;


import java.util.ArrayList;
import java.util.List;

public class Empleado {
    private String nombre;
    private double salario;
    private String categoria;

    // Constructor
    public Empleado(String nombre, double salario, String categoria) {
        this.nombre = nombre;
        this.salario = salario;
        this.categoria = categoria;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", salario=" + salario +
                ", categoria='" + categoria + '\'' +
                '}';
    }
    
    // Método para inicializar una lista modificable
    public static List<Empleado> crearListaModificable() {
        return new ArrayList<>();
    }
}
