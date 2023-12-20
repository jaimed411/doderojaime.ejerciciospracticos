package RopaModels;

//a) Crear las siguientes clases hijas que compartan sus atributos y métodos:
public class Sombrero extends Vestimenta {
    private String tipo;
    private String tamaño;

    // Constructor
    public Sombrero(int codigo, String nombre, double precio, String marca, String talla, String color,
                    String tipo, String tamaño) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamaño = tamaño;
    }

    /* c) Crear los siguientes métodos (en cada subclase correspondiente):
    Sombrero: método para mostrar un mensaje en pantalla que diga "Este sombrero es de marca: " (mostrar tipo).*/
    public void mostrarMensaje() {
        System.out.println("Este sombrero es de tipo: " + tipo);
    }
}