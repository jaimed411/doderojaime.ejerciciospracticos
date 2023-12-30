package com.mycompany.clase1_ejericicio1;

public class ReservaInvalidaException extends Exception {
    // Constructor que acepta un mensaje y lo pasa al constructor de la clase base (Exception)
    public ReservaInvalidaException(String mensaje) {
        super(mensaje);
    }
}

