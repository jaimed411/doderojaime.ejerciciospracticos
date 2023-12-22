/*
d) Clase Camioneta: Crea una clase Camioneta que herede de Vehiculo e implemente la interfaz Combustion.
Agrega atributos específicos para las camionetas de combustión, como capacidadTanque y consumoCombustible.
Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
*/


package models;

import interfaces.Combustion;

// Clase q hereda de Vehiculo e implementa combustion
public class Camioneta extends Vehiculo implements Combustion {
    private double capacidadTanque;
    private double consumoCombustible;

    // Constructor
    public Camioneta(int id, String placa, String marca, String modelo, int anio, double costo, double capacidadTanque, double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    // método abstracto de Vehiculo
    @Override
    public int calcularAntiguedad() {
        return java.time.Year.now().getValue() - anio;
    }

    // método de la interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible para la camioneta de combustión.");
    }
}
