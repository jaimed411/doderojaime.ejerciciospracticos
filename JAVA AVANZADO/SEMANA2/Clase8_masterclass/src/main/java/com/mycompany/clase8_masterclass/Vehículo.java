/*
1. Inicia creando una clase Vehículo con los atributos modelo, marca y costo, luego crea una lista 
de vehículos. Crea además los constructores de las clases y los métodos Setter y Getter.
*/

package com.mycompany.clase8_masterclass;

class Vehiculo {
    private int id;
    private String modelo;
    private String marca;
    private double costo;

    // Contador estático para generar identificadores únicos
    private static int contadorId = 1;

    // Constructor
    public Vehiculo(String modelo, String marca, double costo) {
        this.id = contadorId++;
        this.modelo = modelo;
        this.marca = marca;
        this.costo = costo;
    }

    // Métodos Setter y Getter
    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}