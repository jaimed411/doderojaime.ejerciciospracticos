/*
e) Clase Moto: Crea una clase Moto que herede de Vehiculo e implemente la interfaz Combustion.
Agrega atributos específicos para las motos de combustión, como cilindrada y tipoMotor.
Implementa los métodos abstractos de la clase abstracta y los de la interfaz.
*/

package models;

import interfaces.Combustion;

// Clase q hereda de Vehiculo e implementa Combustion
public class Moto extends Vehiculo implements Combustion {
    private int cilindrada;
    private String tipoMotor;

    // Constructor
    public Moto(int id, String placa, String marca, String modelo, int anio, double costo, int cilindrada, String tipoMotor) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    // método abstracto de Vehiculo
    @Override
    public int calcularAntiguedad() {
        return java.time.Year.now().getValue() - anio;
    }

    // método de la interfaz Combustion
    @Override
    public void recargarCombustible() {
        System.out.println("Recargando combustible para la moto de combustión...");
    }
}
