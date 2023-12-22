/*
c) Clase Auto: Crea una clase Auto que herede de Vehiculo e implemente la interfaz Electrico.
Agrega atributos específicos para los autos eléctricos, como capacidadBateria (en mah) y autonomia (en hs).
Implementa los métodos abstractos de la clase abstracta Vehiculo y los de la interfaz Electrico.
*/


package models;

import interfaces.Electrico;

// Clase hereda Vehiculo e implementa Electrico
public class Auto extends Vehiculo implements Electrico {
    private int capacidadBateria;
    private double autonomia;

    // Constructor
    public Auto(int id, String placa, String marca, String modelo, int anio, double costo, int capacidadBateria, double autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    // Implementación del método Vehiculo
    @Override
    public int calcularAntiguedad() {
        return java.time.Year.now().getValue() - anio;
    }

    // Implementación del método interfaz Electrico
    @Override
    public void cargarEnergia() {
        System.out.println("Cargando energía para el auto eléctrico.");
    }
}
