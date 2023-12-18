public class Main {
    public static void main(String[] args) {
        // a) Crea 3 objetos de la clase Electrodomestico utilizando parámetros.
        Electrodomestico electrodomestico1 = new Electrodomestico(1, "Samsung", "RS27T5200SR", 400.0, "Blanco");
        Electrodomestico electrodomestico2 = new Electrodomestico(2, "Whirlpool", "WFW5620HW", 150.0, "Negro");
        Electrodomestico electrodomestico3 = new Electrodomestico(3, "LG", "OLED65C1PUB", 150.0, "Gris");

        // b) Crea 1 objeto de la clase Electrodomestico sin parámetros.
        Electrodomestico electrodomesticoSinParametros = new Electrodomestico();

        // c) Muestra por pantalla la marca, modelo y consumo energético de los 3 electrodomésticos creados con parámetros.
        System.out.println("Electrodomestico 1 - Marca: " + electrodomestico1.getMarca() +
                ", Modelo: " + electrodomestico1.getModelo() +
                ", Consumo: " + electrodomestico1.getConsumo()); /*+
                ", Color: " + electrodomestico1.getColor());*/

        System.out.println("Electrodomestico 2 - Marca: " + electrodomestico2.getMarca() +
                ", Modelo: " + electrodomestico2.getModelo() +
                ", Consumo: " + electrodomestico2.getConsumo());/* +
                ", Color: " + electrodomestico2.getColor());*/

        System.out.println("Electrodomestico 3 - Marca: " + electrodomestico3.getMarca() +
                ", Modelo: " + electrodomestico3.getModelo() +
                ", Consumo: " + electrodomestico3.getConsumo());/* +
                ", Color: " + electrodomestico3.getColor());*/

        // d) Intenta obtener la marca del electrodoméstico creado sin parámetros.
        //¿Se obtiene algún valor? De ser así… ¿Qué valor se obtiene?
        System.out.println("Marca electrodomestico sin parámetros: " + electrodomesticoSinParametros.getMarca());
        System.out.println("Modelo electrodomestico sin parámetros: " + electrodomesticoSinParametros.getModelo());
        System.out.println("Consumo electrodomestico sin parámetros: " + electrodomesticoSinParametros.getConsumo());
        System.out.println("Color electrodomestico sin parámetros: " + electrodomesticoSinParametros.getColor());
    }
}



