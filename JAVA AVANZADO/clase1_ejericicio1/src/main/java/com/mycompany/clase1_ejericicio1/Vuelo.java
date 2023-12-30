package com.mycompany.clase1_ejericicio1;


public class Vuelo {
    private String destino;
    private int asientosDisponibles;

    // Constructor que inicializa el destino y la cantidad de asientos disponibles
    public Vuelo(String destino, int asientosDisponibles) {
        this.destino = destino;
        this.asientosDisponibles = asientosDisponibles;
    }

    // Métodos getters para obtener el destino y la cantidad de asientos disponibles
    public String getDestino() {
        return destino;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    // Método para reservar asientos, lanzando una excepción si la reserva es inválida
    public void reservarAsientos(int cantidad) throws ReservaInvalidaException {
        if (cantidad <= 0) {
            throw new ReservaInvalidaException("LOS ASIENTOS DEBEN SER MAYOR A 0.");
        }

        if (cantidad > asientosDisponibles) {
            throw new ReservaInvalidaException("NO HAY SUFICIENTES ASIENTOS DISPONIBLES.");
        }

        asientosDisponibles -= cantidad;
    }
}