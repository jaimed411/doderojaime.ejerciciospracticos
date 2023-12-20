/*
Ejercicio Nº 2 - Herencia y Polimorfismo - Individual

Crear una clase llamada Vestimenta con los atributos: código, nombre, precio,
marca, talla y color (con sus métodos y constructores correspondientes).

a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
Zapato: material, tipoCierre
Pantalon: estilo, tipoTejido
Camiseta: manga, cuello
Sombrero: tipo, tamaño

b) Una vez creadas las clases, crear en el Main un vector de tipo Vestimenta y
almacenar 3 zapatos, 3 pantalones, 2 camisetas y 1 sombrero (crear un objeto con
parámetros para cada uno de ellos).

c) Crear los siguientes métodos (en cada subclase correspondiente):
-Zapato: método para mostrar un mensaje en pantalla que diga
"Estos zapatos son de marca: " (mostrar marca).
-Pantalon: método para mostrar un mensaje en pantalla que diga
"Estos pantalones son de marca: " (mostrar estilo).
-Camiseta: método para mostrar un mensaje en pantalla que diga
"Esta camiseta es de marca: " (mostrar manga).
-Sombrero: método para mostrar un mensaje en pantalla que diga
"Este sombrero es de marca: " (mostrar tipo).

d) Recorrer el vector y ejecutar el método que corresponde en cada posición del mismo.
 */



package Ropa;

import RopaModels.*;

public class Main {
    public static void main(String[] args) {
        // b) Crear un vector de tipo Vestimenta y almacenar diferentes objetos
        Vestimenta[] vestimentas = new Vestimenta[9];

        // Crear 3 Zapatos
        vestimentas[0] = new Zapato(1, "Zapato Deportivo", 59.99, "Nike", "42", "Negro", "Cuero", "Cordones");
        vestimentas[1] = new Zapato(2, "Zapato Formal", 79.99, "Adidas", "41", "Marrón", "Piel", "Hebilla");
        vestimentas[2] = new Zapato(3, "Zapatilla Casual", 39.99, "Puma", "40", "Blanco", "Tela", "Velcro");

        // Crear 3 Pantalones
        vestimentas[3] = new Pantalon(4, "Pantalón Vaquero", 49.99, "Levi's", "32", "Azul", "Clásico", "Denim");
        vestimentas[4] = new Pantalon(5, "Pantalón Chino", 34.99, "Dockers", "30", "Negro", "Slim", "Algodón");
        vestimentas[5] = new Pantalon(6, "Pantalón Deportivo", 29.99, "DC", "34", "Gris", "Skater", "Poliéster");

        // Crear 2 Camisetas
        vestimentas[6] = new Camiseta(7, "Camiseta Manga Corta", 19.99, "H&M", "M", "Rojo", "Corta", "Cuello Redondo");
        vestimentas[7] = new Camiseta(8, "Camiseta Manga Larga", 24.99, "Zara", "L", "Blanco", "Larga", "Cuello V");

        // Crear 1 Sombrero
        vestimentas[8] = new Sombrero(9, "Sombrero de Paja", 49.99, "Nike", "42", "Negro", "Paja", "M");

        // d) Recorrer el vector y ejecutar el método que corresponde en cada posición
        for (Vestimenta vestimenta : vestimentas) {
            if (vestimenta instanceof Zapato) {
                ((Zapato) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Pantalon) {
                ((Pantalon) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Camiseta) {
                ((Camiseta) vestimenta).mostrarMensaje();
            } else if (vestimenta instanceof Sombrero) {
                ((Sombrero) vestimenta).mostrarMensaje();
            }
        }
    }
}