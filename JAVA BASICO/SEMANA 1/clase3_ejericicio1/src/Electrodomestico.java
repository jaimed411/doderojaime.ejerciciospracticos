/*
Crear una clase llamada Electrodomestico (sin tilde, recuerda que los nombres de clases y
variables no llevan tilde) con los siguientes atributos: cod, marca, modelo, consumo y color.
Luego, realiza las siguientes acciones:
a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos
creados con parámetros.
d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
 */

public class Electrodomestico {
    // Atributos
    private int cod;
    private String marca;
    private String modelo;
    private double consumo;
    private String color;

    // Constructor con parámetros
    public Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    // Constructor sin parámetros con valores predeterminados
    public Electrodomestico() {
        this.cod = 0;
        this.marca = "Bosch";
        this.modelo = "HBL8753UC";
        this.consumo = 380.0;
        this.color = "Negro";
    }


    // Método para obtener la marca
    public String getMarca() {
        return marca;
    }

    // Método para obtener el modelo
    public String getModelo() {
        return modelo;
    }

    // Método para obtener el consumo
    public double getConsumo() {
        return consumo;
    }

    // Método para obtener el color
    public String getColor() {
        return color;
    }

}

