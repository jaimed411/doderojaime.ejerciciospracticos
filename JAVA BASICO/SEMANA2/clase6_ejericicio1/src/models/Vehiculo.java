/*
a) Clase Abstracta Vehiculo: Crear una clase abstracta llamada Vehiculo con los siguientes atributos:
id, placa, marca, modelo, año, costo. Establecer un método abstracto para calcular la antigüedad del vehiculo.
*/

package models;

// Clase abstracta
public abstract class Vehiculo {
    public int id;
    public String placa;
    public String marca;
    public String modelo;
    public int anio;
    public double costo;

    // Constructor
    public Vehiculo(int id, String placa, String marca, String modelo, int anio, double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    // Método abstracto para calcular la antigüedad
    public abstract int calcularAntiguedad();
}
