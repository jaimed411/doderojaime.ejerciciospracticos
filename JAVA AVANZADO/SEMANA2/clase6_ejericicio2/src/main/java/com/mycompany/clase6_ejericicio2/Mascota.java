package com.mycompany.clase6_ejericicio2;


public class Mascota<T> {
    private int codigo;
    private String nombre;
    private int edad;
    private T especie;

    public Mascota(int codigo, String nombre, int edad, T especie) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public T getEspecie() {
        return especie;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie=" + especie +
                '}';
    }
}
