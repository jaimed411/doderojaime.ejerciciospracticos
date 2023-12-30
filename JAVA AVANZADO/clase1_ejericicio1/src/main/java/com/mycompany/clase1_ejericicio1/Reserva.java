package com.mycompany.clase1_ejericicio1;


public class Reserva {
    private String nombre;
    private Vuelo vuelo;
    private int cantidadAsientos;

    // Constructor que inicializa el nombre, el vuelo y la cantidad de asientos deseados
    public Reserva(String nombre, Vuelo vuelo, int cantidadAsientos) {
        this.nombre = nombre;
        this.vuelo = vuelo;
        this.cantidadAsientos = cantidadAsientos;
    }

    // Método para realizar la reserva, lanzando una excepción si la reserva es inválida
    public void realizarReserva() throws ReservaInvalidaException {
        vuelo.reservarAsientos(cantidadAsientos);
    }

    String getNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getAsientosReservados() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getVuelo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
